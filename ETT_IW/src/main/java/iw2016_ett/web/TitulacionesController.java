package iw2016_ett.web;
import iw2016_ett.domain.Titulaciones;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;
import iw2016_ett.domain.batch.TitulacionesBatchService;
import org.gvnix.addon.web.mvc.annotations.batch.GvNIXWebJpaBatch;

@RequestMapping("/titulacioneses")
@Controller
@RooWebScaffold(path = "titulacioneses", formBackingObject = Titulaciones.class)
@GvNIXWebJQuery
@GvNIXWebJpaBatch(service = TitulacionesBatchService.class)
public class TitulacionesController {
	
	
}
