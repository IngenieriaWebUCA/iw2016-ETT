package iw2016_ett.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import iw2016_ett.web.UsersController;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findOfertasByEstado", "findOfertasByPuestotrabajo", "findOfertasByLocalizacion", "findOfertasByTitulaciones" })
public class Oferta {

    /**
     */
    private String titulo;

    /**
     */
    private String TipoContrato;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date FechaInicio;

    /**
     */
    private int NumeroVacantes;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date FechaFin;

    /**
     */
    @Enumerated
    private Perfil Perfil;

    /**
     */
    @Enumerated
    private Estado Estado;

    /**
     */
    @Enumerated
    private Contrato Contrato;

    /**
     */
    private float Sueldo;

    /**
     */
    @ManyToOne
    private Localizacion localizacion;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oferta")
    private Set<Titulaciones> titulaciones = new HashSet<Titulaciones>();

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oferta")
    private Set<Inscripcion> inscripcion = new HashSet<Inscripcion>();

    /**
     */
    @OneToOne
    private PuestoTrabajo puestotrabajo;

    public static List<Oferta> findOfertaEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        Users u = UsersController.Usuario_logueado();
        String jpaQuery = null;
        /*if (u.getRol().equals("ROLE_ADMIN") ||  u.getRol().equals("ROLE_GESTOR")) {
         jpaQuery = "SELECT o FROM Oferta  o";
         } else if (u.getRol().equals("ROLE_EMPRESA")) {
         jpaQuery = "SELECT o FROM Oferta  o where empresa =" + u.getId();
         }else{*/
        jpaQuery = "SELECT o FROM Oferta  o where estado = 0";
        // }
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Oferta.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }

    /**
     */
    @ManyToOne
    private Empresa empresa;
}
