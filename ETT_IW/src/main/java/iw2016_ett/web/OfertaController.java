package iw2016_ett.web;
import iw2016_ett.domain.Estado;
import iw2016_ett.domain.Oferta;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/ofertas")
@Controller
@RooWebScaffold(path = "ofertas", formBackingObject = Oferta.class)
@RooWebFinder
public class OfertaController {

    @RequestMapping(produces = "text/html")
    public String list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("ofertas", Oferta.findOfertaEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) Oferta.countOfertas() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("ofertas", Oferta.findOfertasByEstado(Estado.Activa, sortFieldName, sortOrder));
        }
        addDateTimeFormatPatterns(uiModel);
        return "ofertas/list";
    }
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String create(@Valid Oferta oferta, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, oferta);
            return "ofertas/create";
        }
        uiModel.asMap().clear();
        oferta.setEmpresa(EmpresaController.empresa_logueada());
        oferta.persist();
        return "redirect:/ofertas/" + encodeUrlPathSegment(oferta.getId().toString(), httpServletRequest);
    }
}
