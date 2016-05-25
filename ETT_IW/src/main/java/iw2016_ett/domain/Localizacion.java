package iw2016_ett.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Localizacion {

    /**
     */
    private String Pais;

    /**
     */
    private String comunidad;

    /**
     */
    private String Provincia;

    /**
     */
    private String Localidad;

    /**
     */
    private String direccion;

    /**
     */
    @ManyToOne
    private Empresa empresa;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "localizacion")
    private Set<Oferta> ofertas = new HashSet<Oferta>();
}
