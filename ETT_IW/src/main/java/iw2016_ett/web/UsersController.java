package iw2016_ett.web;

import iw2016_ett.domain.Demandante;
import iw2016_ett.domain.Empresa;
import iw2016_ett.domain.Users;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/userses")
@Controller
@RooWebScaffold(path = "userses", formBackingObject = Users.class)
@RooWebFinder
public class UsersController {

	@RequestMapping(method = RequestMethod.POST, produces = "text/html")
	public String create(@Valid Users users, BindingResult bindingResult, Model uiModel,
			HttpServletRequest httpServletRequest) {
		if (bindingResult.hasErrors()) {
			populateEditForm(uiModel, users);
			return "userses/create";
		}
		if (Users.countFindUsersesByUsernameEquals(users.getUsername()) > 0)
			return "userses/create";
		uiModel.asMap().clear();
		users.persist();
		return "redirect:/userses/" + encodeUrlPathSegment(users.getId().toString(), httpServletRequest);
	}

	public static Users Usuario_logueado() {

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		List<Users> lUser = Users.findUsersesByUsernameEquals(name).getResultList();
		Users usuario = null;
		if (lUser.size() > 0) {
			usuario =  lUser.get(0);
		}
		
		return usuario;
	}

}
