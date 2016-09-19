package email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 19-9-16.
 */
public class JavaxMailSender {
    public void sendEmail(String address, String subject, String body, String user, String pass, String smtp_auth, String smtp_starttls, String smtp_host, String smtp_port) throws MessagingException {
        final String username = user;
        final String password = pass;

        Properties props = new Properties();
        props.put("mail.smtp.auth", smtp_auth);
        props.put("mail.smtp.starttls.enable", smtp_starttls);
        props.put("mail.smtp.host", smtp_host);
        props.put("mail.smtp.port", smtp_port);

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(address));
        message.setSubject(subject);
        message.setText(body);

        Transport.send(message);
    }
}
