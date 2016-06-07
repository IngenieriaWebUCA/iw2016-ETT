package iw2016_ett.web;

import iw2016_ett.domain.Demandante;
import iw2016_ett.domain.Estado;
import iw2016_ett.domain.EstadoInsc;
import iw2016_ett.domain.Inscripcion;
import iw2016_ett.domain.Oferta;
import iw2016_ett.domain.Users;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;
import org.osgi.service.http.HttpContext;

import iw2016_ett.domain.batch.InscripcionBatchService;
import iw2016_ett.email.mail;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.gvnix.addon.web.mvc.annotations.batch.GvNIXWebJpaBatch;

@RequestMapping("/inscripcions")
@Controller
@RooWebScaffold(path = "inscripcions", formBackingObject = Inscripcion.class)
@GvNIXWebJQuery
@GvNIXWebJpaBatch(service = InscripcionBatchService.class)
public class InscripcionController {

	@RequestMapping(method = RequestMethod.PUT, produces = "text/html")
	public String update(@Valid Inscripcion inscripcion, BindingResult bindingResult, Model uiModel,
			HttpServletRequest httpServletRequest) {
		if (bindingResult.hasErrors()) {
			populateEditForm(uiModel, inscripcion);
			return "inscripcions/update";
		}
		uiModel.asMap().clear();
		inscripcion.merge();

		mail m = new mail();

		m.send(inscripcion.getDemandante().getEmail(), "Actualizacion estado oferta",
				"Su inscripción a pasado a estado: " + inscripcion.getEstado());
		return "redirect:/inscripcions/" + encodeUrlPathSegment(inscripcion.getId().toString(), httpServletRequest);
	}

	@RequestMapping(method = RequestMethod.POST, produces = "text/html")
	public String create(@Valid Inscripcion inscripcion, BindingResult bindingResult, Model uiModel,
			HttpServletRequest httpServletRequest) {
		if (bindingResult.hasErrors()) {
			populateEditForm(uiModel, inscripcion);
			return "inscripcions/create";
		}
		uiModel.asMap().clear();
		inscripcion.persist();
		mail m = new mail();

		m.send(inscripcion.getDemandante().getEmail(), "Inscripción",
				"Usted se ha inscripto en la oferta: " + inscripcion.getOferta().getTitulo());

		return "redirect:/inscripcions/" + encodeUrlPathSegment(inscripcion.getId().toString(), httpServletRequest);
	}

	@RequestMapping(value = "/{oferta}", params = "inscribir", produces = "text/html")
	public String inscripcionOferta(@PathVariable("oferta") Long ofertaId, Model uiModel) {
		Oferta oferta = Oferta.findOferta(ofertaId);

		Demandante demandante = DemandanteController.demandante_logueado();
		Inscripcion inscripcion = new Inscripcion();
		inscripcion.setDemandante(demandante);
		inscripcion.setEstado(EstadoInsc.Recibida);
		inscripcion.setOferta(oferta);
		inscripcion.persist();
		mail m = new mail();

		m.send(inscripcion.getDemandante().getEmail(), "Inscripción",
				"Usted se ha inscripto en la oferta: " + inscripcion.getOferta().getTitulo());

		return "redirect:/ofertas";
	}
	
	@RequestMapping(produces = "text/html")
    public String list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        
		if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("inscripcions", Inscripcion.findInscripcionEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) Inscripcion.countInscripcions() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("inscripcions", Inscripcion.findInscripcionsByDemandante((Demandante)UsersController.Usuario_logueado()));
        }
        return "inscripcions/list";
    }
}
