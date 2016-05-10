package iw2016_ett.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Localizacion {

    /**
     */
    @Enumerated
    private Pais Pais;

    /**
     */
    @Enumerated
    private Comunidad comunidad;

    /**
     */
    @Enumerated
    private Provincia Provincia;

    /**
     */
    @Enumerated
    private Localidad Localidad;

    /**
     */
    private String direccion;
}
