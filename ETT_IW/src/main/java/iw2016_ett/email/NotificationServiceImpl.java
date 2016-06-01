package iw2016_ett.email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;

public class NotificationServiceImpl {

    @Autowired
    private transient MailSender mailTemplate;

    public void sendMessage(String mailTo, String message) {
        org.springframework.mail.SimpleMailMessage mailMessage = new org.springframework.mail.SimpleMailMessage();
        mailMessage.setTo(mailTo);
        mailMessage.setText(message);
        mailTemplate.send(mailMessage);
    }
}
