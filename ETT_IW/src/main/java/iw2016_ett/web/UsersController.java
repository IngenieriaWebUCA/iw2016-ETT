package iw2016_ett.web;
import iw2016_ett.domain.Empresa;
import iw2016_ett.domain.Users;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/userses")
@Controller
@RooWebScaffold(path = "userses", formBackingObject = Users.class)
public class UsersController {

	@RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String create(@Valid Users users, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, users);
            return "userses/create";
        }
        if(Users.countFindUsersesByUsernameEquals(users.getUsername())>0)
        	return "userses/create";
        uiModel.asMap().clear();
        users.persist();
        return "redirect:/userses/" + encodeUrlPathSegment(users.getId().toString(), httpServletRequest);
    }
}
