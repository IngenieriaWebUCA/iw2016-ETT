package iw2016_ett.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Oferta {

    /**
     */
    private int id;

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
    private Date FechaAccesible;

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
    @ManyToOne
    private Empresa empresa;
}
