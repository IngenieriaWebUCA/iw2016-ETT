package iw2016_ett.web;
import iw2016_ett.domain.Formacion;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/formacions")
@Controller
@RooWebScaffold(path = "formacions", formBackingObject = Formacion.class)
public class FormacionController {
}
