package iw2016_ett.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Enumerated;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
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
}
