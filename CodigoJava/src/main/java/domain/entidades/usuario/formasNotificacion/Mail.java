package domain.entidades.usuario.formasNotificacion;

import domain.entidades.usuario.Contacto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.*;

@Entity
@DiscriminatorValue("mail")
public class Mail extends EstrategiaDeNotificacion {
    @Transient
    private Properties properties;

    @Transient
    private Session session;



    public Mail() {

    }

    public void notificar(Contacto contacto, String mensaje) throws MessagingException {
/*

            String correos = contacto.getMail();

            this.enviarEmail("Mensaje de la plataforma Rescate de Patitas", mensaje, correos);
*/
    }



    public void enviarEmail(String asunto, String mensaje, String correo) throws MessagingException {

           /* final String username = "rescatedepatitas59@gmail.com";  // rescatedepatitas59@gmail.com
            final String password = "Rescatedepatitas123";  // Rescatedepatitas123

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });

            try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress( username));
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(correo));
                message.setSubject(asunto);
                message.setText(mensaje);

                Transport.send(message);

            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }*/
        }




    }
