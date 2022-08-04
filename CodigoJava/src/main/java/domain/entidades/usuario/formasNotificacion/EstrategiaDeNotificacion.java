package domain.entidades.usuario.formasNotificacion;

import com.textmagic.sdk.RestException;
import domain.entidades.usuario.Contacto;

import javax.mail.MessagingException;
import javax.persistence.*;
import java.io.IOException;

@Entity
@Table(name = "estrategiaDeNotificacion")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipoDeEstrategiaDeNotificacion")
public abstract class EstrategiaDeNotificacion {
    @Id
    @GeneratedValue
    private int id_estrategiaDeNotificacion;

    public int getId() {
        return id_estrategiaDeNotificacion;
    }

    public abstract void notificar(Contacto contacto, String mensaje) throws RestException, IOException, MessagingException;

}