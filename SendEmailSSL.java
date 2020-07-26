package javaapplication2;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmailSSL {

    public static void main(String[] args) throws NoSuchProviderException {

        final String username = "cz84007@gmail.com";
        final String password = "chat@!@#$";

        Properties props = new Properties();
        props.put("mail.smtp.user",username); 
    props.put("mail.smtp.password", password);
    props.put("mail.smtp.host", "smtp.gmail.com"); 
    props.put("mail.smtp.port", "587"); 
    //props.put("mail.debug", "true"); 
    props.put("mail.smtp.auth", "true"); 
    props.put("mail.smtp.starttls.enable","true"); 
    props.put("mail.smtp.EnableSSL.enable","true");      

        Session session = Session.getInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        Transport transport = session.getTransport("smtp");            


        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("cz84007@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("tushargoel66@gmail.com")
            );
            message.setSubject("Testing Gmail SSL");
            message.setText("Dear Mail Crawler,"
                    + "\n\n Please do not spam my email!");

            transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}