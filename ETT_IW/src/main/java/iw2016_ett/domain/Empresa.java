package iw2016_ett.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Empresa extends Users{

    /**
     */
    private String CIF;

    /**
     */
    private String nombre;

    /**
     */
    private String actividad;

    /**
     */
    private int n_Empleados;

    /**
     */
    private String email;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresa")
    private Set<Localizacion> localizacion = new HashSet<Localizacion>();
}
