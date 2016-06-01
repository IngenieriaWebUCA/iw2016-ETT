package iw2016_ett.email;

public class mail {
	public static void main(String args[]) {
		 
		// Spring Bean file you specified in /src/main/resources folder
		
		String toAddr = "juangarpe94@gmail.com";
 
		// email subject
		String subject = "Hey.. This email sent by Crunchify's Spring MVC Tutorial";
 
		// email body
		String body = "There you go.. You got an email.. Let's understand details on how Spring MVC works -- By Crunchify Admin";
		NotificationServiceImpl m = new NotificationServiceImpl();
		m.sendMessage(toAddr, body);
	}
}
