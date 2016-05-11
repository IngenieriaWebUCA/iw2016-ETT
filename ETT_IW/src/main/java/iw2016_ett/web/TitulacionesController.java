package iw2016_ett.web;
import iw2016_ett.domain.Titulaciones;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/titulacioneses")
@Controller
@RooWebScaffold(path = "titulacioneses", formBackingObject = Titulaciones.class)
public class TitulacionesController {
}
