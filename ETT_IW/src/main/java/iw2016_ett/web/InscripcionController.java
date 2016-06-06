package iw2016_ett.web;

import iw2016_ett.domain.Demandante;
import iw2016_ett.domain.Estado;
import iw2016_ett.domain.EstadoInsc;
import iw2016_ett.domain.Inscripcion;
import iw2016_ett.domain.Oferta;

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
}
