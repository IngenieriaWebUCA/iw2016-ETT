// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.web;

import iw2016_ett.domain.Demandante;
import iw2016_ett.domain.Formacion;
import iw2016_ett.domain.TipoFormacion;
import iw2016_ett.domain.Titulaciones;
import iw2016_ett.web.FormacionController;
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

privileged aspect FormacionController_Roo_Controller {
    
    @RequestMapping(params = "form", produces = "text/html")
    public String FormacionController.createForm(Model uiModel) {
        populateEditForm(uiModel, new Formacion());
        return "formacions/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String FormacionController.show(@PathVariable("id") Long id, Model uiModel) {
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("formacion", Formacion.findFormacion(id));
        uiModel.addAttribute("itemId", id);
        return "formacions/show";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String FormacionController.update(@Valid Formacion formacion, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, formacion);
            return "formacions/update";
        }
        uiModel.asMap().clear();
        formacion.merge();
        return "redirect:/formacions/" + encodeUrlPathSegment(formacion.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String FormacionController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, Formacion.findFormacion(id));
        return "formacions/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String FormacionController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Formacion formacion = Formacion.findFormacion(id);
        formacion.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/formacions";
    }
    
    void FormacionController.addDateTimeFormatPatterns(Model uiModel) {
        uiModel.addAttribute("formacion_fechainicio_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        uiModel.addAttribute("formacion_fechafin_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    void FormacionController.populateEditForm(Model uiModel, Formacion formacion) {
        uiModel.addAttribute("formacion", formacion);
        addDateTimeFormatPatterns(uiModel);
        uiModel.addAttribute("demandantes", Demandante.findAllDemandantes());
        uiModel.addAttribute("tipoformacions", Arrays.asList(TipoFormacion.values()));
        uiModel.addAttribute("titulacioneses", Titulaciones.findAllTitulacioneses());
    }
    
    String FormacionController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
