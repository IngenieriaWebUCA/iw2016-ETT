package iw2016_ett.web;
import iw2016_ett.domain.Empresa;
import iw2016_ett.domain.Oferta;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysema.query.Query;
import com.mysema.query.annotations.QueryEntity;

import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;
import org.gvnix.web.datatables.util.DatatablesUtilsBean;
import org.hibernate.jpa.internal.EntityManagerImpl;
import org.hibernate.loader.custom.sql.SQLCustomQuery;

import iw2016_ett.domain.batch.EmpresaBatchService;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import javax.validation.Valid;
import org.gvnix.addon.web.mvc.annotations.batch.GvNIXWebJpaBatch;
import org.gvnix.addon.datatables.annotations.GvNIXDatatables;

@RequestMapping("/empresas")
@Controller
@RooWebScaffold(path = "empresas", formBackingObject = Empresa.class)
@GvNIXWebJQuery
@GvNIXWebJpaBatch(service = EmpresaBatchService.class)
@GvNIXDatatables(ajax = true, detailFields = { "localizacion" })
public class EmpresaController {


	@RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String create(@Valid Empresa empresa, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, empresa);
            return "empresas/create";
        }
        if(Empresa.countFindUsersesByUsernameEquals(empresa.getUsername())>0)
        	return "empresas/create";
        
        uiModel.asMap().clear();
        empresa.setRol("ROLE_EMPRESA");
        
        empresa.persist();
        return "redirect:/empresas/" + encodeUrlPathSegment(empresa.getId().toString(), httpServletRequest);
    }
}
