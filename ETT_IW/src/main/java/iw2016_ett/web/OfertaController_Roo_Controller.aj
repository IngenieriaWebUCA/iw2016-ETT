// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.web;

import iw2016_ett.domain.Contrato;
import iw2016_ett.domain.Estado;
import iw2016_ett.domain.Inscripcion;
import iw2016_ett.domain.Localizacion;
import iw2016_ett.domain.Oferta;
import iw2016_ett.domain.Perfil;
import iw2016_ett.domain.PuestoTrabajo;
import iw2016_ett.web.OfertaController;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.joda.time.format.DateTimeFormat;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect OfertaController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String OfertaController.create(@Valid Oferta oferta, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, oferta);
            return "ofertas/create";
        }
        uiModel.asMap().clear();
        oferta.persist();
        return "redirect:/ofertas/" + encodeUrlPathSegment(oferta.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String OfertaController.createForm(Model uiModel) {
        populateEditForm(uiModel, new Oferta());
        return "ofertas/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String OfertaController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("oferta", Oferta.findOferta(id));
        uiModel.addAttribute("itemId", id);
        return "ofertas/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String OfertaController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("ofertas", Oferta.findOfertaEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) Oferta.countOfertas() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("ofertas", Oferta.findAllOfertas(sortFieldName, sortOrder));
        }
        addDateTimeFormatPatterns(uiModel);
        return "ofertas/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String OfertaController.update(@Valid Oferta oferta, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, oferta);
            return "ofertas/update";
        }
        uiModel.asMap().clear();
        oferta.merge();
        return "redirect:/ofertas/" + encodeUrlPathSegment(oferta.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String OfertaController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, Oferta.findOferta(id));
        return "ofertas/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String OfertaController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Oferta oferta = Oferta.findOferta(id);
        oferta.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/ofertas";
    }
    
    void OfertaController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("oferta_fechainicio_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        uiModel.addAttribute("oferta_fechafin_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    void OfertaController.populateEditForm(Model uiModel, Oferta oferta) {
        uiModel.addAttribute("oferta", oferta);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("contratoes", Arrays.asList(Contrato.values()));
        uiModel.addAttribute("estadoes", Arrays.asList(Estado.values()));
        uiModel.addAttribute("inscripcions", Inscripcion.findAllInscripcions());
        uiModel.addAttribute("localizacions", Localizacion.findAllLocalizacions());
        uiModel.addAttribute("perfils", Arrays.asList(Perfil.values()));
        uiModel.addAttribute("puestotrabajoes", PuestoTrabajo.findAllPuestoTrabajoes());
    }
    
    String OfertaController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
