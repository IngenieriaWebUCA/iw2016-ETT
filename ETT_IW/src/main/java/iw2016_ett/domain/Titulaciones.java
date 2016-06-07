package iw2016_ett.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import iw2016_ett.web.UsersController;

import java.util.List;

import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Titulaciones {

    /**
     */
    private String Nombre;

    /**
     */
    @ManyToOne
    private Oferta oferta;
    
    
    
}
