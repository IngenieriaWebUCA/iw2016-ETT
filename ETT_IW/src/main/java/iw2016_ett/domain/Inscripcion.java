package iw2016_ett.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import iw2016_ett.web.UsersController;
import javax.persistence.Enumerated;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findInscripcionsByDemandante" })
public class Inscripcion {

    /**
     */
    @Enumerated
    private EstadoInsc Estado;

    /**
     */
    @ManyToOne
    private Oferta oferta;

    /**
     */
    @ManyToOne
    private Demandante demandante;

    public static List<Inscripcion> findInscripcionEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        Users u = UsersController.Usuario_logueado();
        String jpaQuery = null;
        if (u.getRol().equals("ROLE_ADMIN") ||  u.getRol().equals("ROLE_GESTOR")) {
            jpaQuery = "SELECT o FROM Inscripcion o";
        } else if (u.getRol().equals("ROLE_DEMANDANTE")) {
            jpaQuery = "SELECT o FROM Inscripcion o where demandante =" + u.getId();
        } /*else if(u.getRol()=="ROLE_EMPRESA"){  jpaQuery = "SELECT o FROM Inscripcion o where oferta in (SELECT o FROM Oferta o where empresa";  }  */
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Inscripcion.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
}
