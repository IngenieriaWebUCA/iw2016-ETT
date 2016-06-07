package iw2016_ett.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import iw2016_ett.web.UsersController;
import java.util.Date;
import java.util.List;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findFormacionsByDemandante" })
public class Formacion {

    /**
     */
    private String Titulo;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date FechaInicio;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date FechaFin;

    /**
     */
    private String Observaciones;

    /**
     */
    @Enumerated
    private TipoFormacion tipoFormacion;

    /**
     */
    @ManyToOne
    private Demandante demandante;

    /**
     */
    @OneToOne
    private Titulaciones titulacion;

    public static List<Formacion> findFormacionEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        Users u = UsersController.Usuario_logueado();
        String jpaQuery = null;
        if (u.getRol().equals("ROLE_ADMIN")) {
            jpaQuery = "SELECT o FROM Formacion o";
        } else if (u.getRol().equals("ROLE_DEMANDANTE")) {
            jpaQuery = "SELECT o FROM Formacion o where demandante =" + u.getId();
        }
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Formacion.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
}
