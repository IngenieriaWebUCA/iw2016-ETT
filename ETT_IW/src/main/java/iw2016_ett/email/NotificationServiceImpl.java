package iw2016_ett.email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
 
/**
 * @author Crunchify.com
 * 
 */
@Controller
@Service("crunchifyEmail")
public class NotificationServiceImpl {
	@Autowired
	private MailSender crunchifymail; // MailSender interface defines a strategy
										// for sending simple mails
 
	public void SendEmail(String toAddress, String subject, String msgBody) {
 
		SimpleMailMessage crunchifyMsg = new SimpleMailMessage();
		crunchifyMsg.setFrom("ett.iw2016@gmail.com");
		crunchifyMsg.setTo(toAddress);
		crunchifyMsg.setSubject(subject);
		crunchifyMsg.setText(msgBody);
		crunchifymail.send(crunchifyMsg);
	}
}

