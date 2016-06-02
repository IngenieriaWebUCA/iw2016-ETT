package iw2016_ett.web;
import iw2016_ett.domain.Demandante;
import iw2016_ett.domain.Empresa;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;
import iw2016_ett.domain.batch.DemandanteBatchService;
import iw2016_ett.email.NotificationServiceImpl;
import iw2016_ett.email.mail;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.gvnix.addon.web.mvc.annotations.batch.GvNIXWebJpaBatch;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/demandantes")
@Controller
@RooWebScaffold(path = "demandantes", formBackingObject = Demandante.class)
@GvNIXWebJQuery
@GvNIXWebJpaBatch(service = DemandanteBatchService.class)
@RooWebFinder
public class DemandanteController {

    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String create(@Valid Demandante demandante, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, demandante);
            return "demandantes/create";
        }
        
        if (Demandante.countFindUsersesByUsernameEquals(demandante.getUsername()) > 0) return "demandantes/create";
        uiModel.asMap().clear();
        demandante.setRol("ROLE_DEMANDANTE");
        demandante.persist();
        
        /*String crunchifyConfFile = "META-INF/spring/applicationContext.xml";
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(crunchifyConfFile);
 
		// @Service("crunchifyEmail") <-- same annotation you specified in CrunchifyEmailAPI.java
		NotificationServiceImpl mail = (NotificationServiceImpl) context.getBean("crunchifyEmail");
		*/String toAddr = demandante.getEmail();
		String fromAddr = "ett.iw2016@gmail.com";
 
		// email subject
		String subject = "Registro exitoso";
 
		// email body
		String body = "Bienvenido "+demandante.getNombre() +" a ETT";
		mail m = new mail();
		m.send(toAddr, subject, body);
        
        return "redirect:/demandantes/" + encodeUrlPathSegment(demandante.getId().toString(), httpServletRequest);
    }
}
