package iw2016_ett.email;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class mail {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
 
		// Spring Bean file you specified in /src/main/resources folder
		String crunchifyConfFile = "crunchify-bean.xml";
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(crunchifyConfFile);
 
		// @Service("crunchifyEmail") <-- same annotation you specified in CrunchifyEmailAPI.java
		NotificationServiceImpl mail = (NotificationServiceImpl) context.getBean("crunchifyEmail");
		String toAddr = "juangarpe94@gmail.com";
		String fromAddr = "ett.iw2016@gmail.com";
 
		// email subject
		String subject = "Hey.. This email sent by Crunchify's Spring MVC Tutorial";
 
		// email body
		String body = "There you go.. You got an email.. Let's understand details on how Spring MVC works -- By Crunchify Admin";
		mail.SendEmail(toAddr, fromAddr, subject, body);
	}
}
