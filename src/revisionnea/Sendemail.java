
package revisionnea;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class Sendemail {
    public static int verficationsend;
    public static void sendMail(String recepient, int verficationnum) throws Exception {
        System.out.println("sending");
        Properties properties = new Properties();
        verficationsend = verficationnum;
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "revisionprogram7@gmail.com";
        String password = "RevisionNEA";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        Message message = prepareMessage(session, myAccountEmail, recepient);

        Transport.send(message);
        System.out.println("message sent sucessfully");
    }

    public static Message prepareMessage(Session session, String myAccountEmail, String recepient) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Verfication number");
            message.setText("Hello, \nYour verfication code is "+ verficationsend);
            return message;
        } catch (Exception ex) {
            Logger.getLogger(Sendemail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}


