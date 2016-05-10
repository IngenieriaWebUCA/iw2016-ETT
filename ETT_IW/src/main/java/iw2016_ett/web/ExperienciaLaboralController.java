package iw2016_ett.web;
import iw2016_ett.domain.ExperienciaLaboral;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/experiencialaborals")
@Controller
@RooWebScaffold(path = "experiencialaborals", formBackingObject = ExperienciaLaboral.class)
public class ExperienciaLaboralController {
}
