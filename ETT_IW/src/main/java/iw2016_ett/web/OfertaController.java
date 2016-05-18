package iw2016_ett.web;
import iw2016_ett.domain.Oferta;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;

@RequestMapping("/ofertas")
@Controller
@RooWebScaffold(path = "ofertas", formBackingObject = Oferta.class)
@GvNIXWebJQuery
public class OfertaController {
}
