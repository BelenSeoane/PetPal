package domain.entidades.usuario.formasNotificacion;

import com.textmagic.sdk.RestException;
import domain.entidades.usuario.Contacto;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Entity
@DiscriminatorValue("sms")
public class SMS extends EstrategiaDeNotificacion{

    public void notificar(Contacto contacto, String mensaje) throws RestException {
        final String ACCOUNT_SID = "AC7676b9257b6643c0032c8b819dcfbc77";
        final String AUTH_TOKEN = "6cea30dc04a9b40640e2c333761a41ae";

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message.creator(
                new PhoneNumber(contacto.getTelefono()),
                new PhoneNumber("+15753420363"),
                mensaje)
                .create();
    }
}
