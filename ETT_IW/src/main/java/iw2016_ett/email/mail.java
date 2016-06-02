package iw2016_ett.email;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;


public class mail {
	
	@SuppressWarnings("resource")
	public void send(String toAddr, String subject, String body) {
 
		// Spring Bean file you specified in /src/main/resources folder
		String crunchifyConfFile = "META-INF/spring/applicationContext.xml";
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(crunchifyConfFile);
 
		// @Service("crunchifyEmail") <-- same annotation you specified in CrunchifyEmailAPI.java
		NotificationServiceImpl mail = (NotificationServiceImpl) context.getBean("crunchifyEmail");
		mail.SendEmail(toAddr, subject, body);
	}
}
