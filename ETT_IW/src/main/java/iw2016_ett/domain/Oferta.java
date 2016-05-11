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
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Oferta {

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
    private Date FechaFin;

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
    @Enumerated
    private Contrato Contrato;

    /**
     */
    private float Sueldo;

    /**
     */
    @ManyToOne
    private Localizacion localizacion;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oferta")
    private Set<Titulaciones> titulaciones = new HashSet<Titulaciones>();

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oferta")
    private Set<Inscripcion> inscripcion = new HashSet<Inscripcion>();

    /**
     */
    @OneToOne
    private PuestoTrabajo puestotrabajo;
}
