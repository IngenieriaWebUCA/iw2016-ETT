package iw2016_ett.web;
import iw2016_ett.domain.Formacion;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;
import iw2016_ett.domain.batch.FormacionBatchService;
import org.gvnix.addon.web.mvc.annotations.batch.GvNIXWebJpaBatch;

@RequestMapping("/formacions")
@Controller
@RooWebScaffold(path = "formacions", formBackingObject = Formacion.class)
@GvNIXWebJQuery
@GvNIXWebJpaBatch(service = FormacionBatchService.class)
public class FormacionController {
}
