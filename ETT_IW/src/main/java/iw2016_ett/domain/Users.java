package iw2016_ett.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.springframework.beans.factory.annotation.Value;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findUsersesByUsernameEquals", "findUsersesByUsernameLike" })
public class Users {

    /**
     */
    @NotNull
    @Column(unique = true)
    private String username;

    /**
     */
    @NotNull
    private String password;

    /**
     */
    @Value("1")
    private int enable;

    /**
     */
    private String rol;
}
