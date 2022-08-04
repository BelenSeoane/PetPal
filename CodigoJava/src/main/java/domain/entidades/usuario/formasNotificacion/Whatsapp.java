package domain.entidades.usuario.formasNotificacion;

import domain.entidades.usuario.Contacto;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Entity
@DiscriminatorValue("whatsapp")
public class Whatsapp extends EstrategiaDeNotificacion {

    public void notificar(Contacto contacto, String mensaje) {
        final String ACCOUNT_SID = "AC7676b9257b6643c0032c8b819dcfbc77";
        final String AUTH_TOKEN = "6cea30dc04a9b40640e2c333761a41ae";

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:"+contacto.getTelefono()),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                mensaje)
                .create();
    }



}