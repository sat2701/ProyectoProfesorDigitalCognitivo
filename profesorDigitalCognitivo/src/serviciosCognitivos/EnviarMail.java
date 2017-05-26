package serviciosCognitivos;

/*
 * Fichero: EnviarMail.java
 * Autor: Chuidiang
 * Fecha: 5/04/07 18:14
 */

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 * Ejemplo de envio de correo simple con JavaMail
 *
 * @author Chuidiang
 *
  */
public class EnviarMail{

    public void enviarCorreo(String destinatario){
        try
        {
            // Propiedades de la conexión
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "profesorrebeldesswing@gmail.com");
            props.setProperty("mail.smtp.auth", "true");

            // Preparamos la sesion
            Session session = Session.getDefaultInstance(props);

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            
//          Aqui va el destinatario
            message.setFrom(new InternetAddress("profesorrebeldesswing@gmail.com"));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress(destinatario));
            
            message.setSubject("Profesor Cognitivo");
            message.setText(
                "Se ha habilitado una nueva evaluación, ingrese a continuación:   "
                + "https://www.youtube.com/watch?v=XKQzAFgSPJY");
            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            t.connect("profesorrebeldesswing@gmail.com", "rebeldesdelswing");
            t.sendMessage(message, message.getAllRecipients());
            t.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}