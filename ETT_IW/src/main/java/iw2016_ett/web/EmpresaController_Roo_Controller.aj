// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.web;

import iw2016_ett.domain.Empresa;
import iw2016_ett.domain.Localizacion;
import iw2016_ett.domain.Oferta;
import iw2016_ett.web.EmpresaController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect EmpresaController_Roo_Controller {
    
    @RequestMapping(params = "form", produces = "text/html")
    public String EmpresaController.createForm(Model uiModel) {
        populateEditForm(uiModel, new Empresa());
        return "empresas/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String EmpresaController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("empresa", Empresa.findEmpresa(id));
        uiModel.addAttribute("itemId", id);
        return "empresas/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String EmpresaController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("empresas", Empresa.findEmpresaEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) Empresa.countEmpresas() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("empresas", Empresa.findAllEmpresas(sortFieldName, sortOrder));
        }
        return "empresas/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String EmpresaController.update(@Valid Empresa empresa, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, empresa);
            return "empresas/update";
        }
        uiModel.asMap().clear();
        empresa.merge();
        return "redirect:/empresas/" + encodeUrlPathSegment(empresa.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String EmpresaController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, Empresa.findEmpresa(id));
        return "empresas/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String EmpresaController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Empresa empresa = Empresa.findEmpresa(id);
        empresa.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/empresas";
    }
    
    void EmpresaController.populateEditForm(Model uiModel, Empresa empresa) {
        uiModel.addAttribute("empresa", empresa);
        uiModel.addAttribute("localizacions", Localizacion.findAllLocalizacions());
        uiModel.addAttribute("ofertas", Oferta.findAllOfertas());
    }
    
    String EmpresaController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
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
