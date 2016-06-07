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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findExperienciaLaboralsByDemandante" })
public class ExperienciaLaboral {

    /**
     */
    private String Empresa;

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
    @ManyToOne
    private Demandante demandante;

    /**
     */
    @OneToOne
    private PuestoTrabajo puestotrabajo;

    public static List<ExperienciaLaboral> findExperienciaLaboralEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        Users u = UsersController.Usuario_logueado();
        String jpaQuery = null;
        if (u.getRol().equals("ROLE_ADMIN") ) {
            jpaQuery = "SELECT o FROM ExperienciaLaboral o";
        } else if (u.getRol().equals("ROLE_DEMANDANTE")) {
            jpaQuery = "SELECT o FROM ExperienciaLaboral o where demandante =" + u.getId();
        }
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, ExperienciaLaboral.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
}
