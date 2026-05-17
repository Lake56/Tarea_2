import java.time.Instant;

public class Invitacion {
 //datos de la invitacion
    private Instant hora;
    private Invitable invitado;
    private Reunion reunion;

    //constructores
    public Invitacion(Invitable invitado, Reunion reunion) {
        this.hora = Instant.now(); //la hora de creacion de la invitacion
        this.invitado = invitado;
        this.reunion = reunion;
    }

    //constructor para declarar la hora explicitamente
    public Invitacion(Invitable invitado, Reunion reunion, Instant hora) {
        this.hora = hora;
        this.invitado = invitado;
        this.reunion = reunion;
    }

}
