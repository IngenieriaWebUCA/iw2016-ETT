package iw2016_ett.web;
import iw2016_ett.domain.Demandante;
import iw2016_ett.domain.ExperienciaLaboral;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;
import iw2016_ett.domain.batch.ExperienciaLaboralBatchService;
import org.gvnix.addon.web.mvc.annotations.batch.GvNIXWebJpaBatch;

@RequestMapping("/experiencialaborals")
@Controller
@RooWebScaffold(path = "experiencialaborals", formBackingObject = ExperienciaLaboral.class)
@GvNIXWebJQuery
@GvNIXWebJpaBatch(service = ExperienciaLaboralBatchService.class)
public class ExperienciaLaboralController {
	
	 @RequestMapping(produces = "text/html")
	    public String list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
	        if (page != null || size != null) {
	            int sizeNo = size == null ? 10 : size.intValue();
	            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
	            uiModel.addAttribute("experiencialaborals", ExperienciaLaboral.findExperienciaLaboralEntries(firstResult, sizeNo, sortFieldName, sortOrder));
	            float nrOfPages = (float) ExperienciaLaboral.countExperienciaLaborals() / sizeNo;
	            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
	        } else {
	            uiModel.addAttribute("experiencialaborals", ExperienciaLaboral.findExperienciaLaboralsByDemandante((Demandante)UsersController.Usuario_logueado()));
	        }
	        addDateTimeFormatPatterns(uiModel);
	        return "experiencialaborals/list";
	    }
}
