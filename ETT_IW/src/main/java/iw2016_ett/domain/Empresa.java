package iw2016_ett.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Empresa {

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
}
