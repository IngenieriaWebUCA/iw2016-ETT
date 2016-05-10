package iw2016_ett.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Demandante {

    /**
     */
    private int id;

    /**
     */
    private String Nombre;

    /**
     */
    private String Apellidos;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date FechaNacimiento;

    /**
     */
    private String direccion;

    /**
     */
    private String email;

    /**
     */
    private int Telefono;

    /**
     */
    @Enumerated
    private Sexo Sexo;

    /**
     */
    private String Resumen;

    /**
     */
    private String Foto;

    /**
     */
    private String Curriculum;

    /**
     */
    private String Puesto;
}
