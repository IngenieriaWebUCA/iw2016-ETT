package iw2016_ett.web;
import iw2016_ett.domain.Localizacion;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;
import iw2016_ett.domain.batch.LocalizacionBatchService;
import org.gvnix.addon.web.mvc.annotations.batch.GvNIXWebJpaBatch;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.gvnix.addon.datatables.annotations.GvNIXDatatables;

@RequestMapping("/localizacions")
@Controller
@RooWebScaffold(path = "localizacions", formBackingObject = Localizacion.class)
@GvNIXWebJQuery
@GvNIXWebJpaBatch(service = LocalizacionBatchService.class)
@GvNIXDatatables(ajax = true)
public class LocalizacionController {
	
	 @RequestMapping(method = RequestMethod.POST, produces = "text/html")
	    public String create(@Valid Localizacion localizacion, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
	        if (bindingResult.hasErrors()) {
	            populateEditForm(uiModel, localizacion);
	            return "localizacions/create";
	        }
	        uiModel.asMap().clear();
	        
	        localizacion.setEmpresa(EmpresaController.empresa_logueada());
	        localizacion.persist();
	        return "redirect:/localizacions/" + encodeUrlPathSegment(localizacion.getId().toString(), httpServletRequest);
	    }
	
}
