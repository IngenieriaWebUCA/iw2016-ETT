package iw2016_ett.web;
import iw2016_ett.domain.PuestoTrabajo;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;

@RequestMapping("/puestotrabajoes")
@Controller
@RooWebScaffold(path = "puestotrabajoes", formBackingObject = PuestoTrabajo.class)
@GvNIXWebJQuery
public class PuestoTrabajoController {
}
