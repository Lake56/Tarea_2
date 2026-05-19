import java.time.Instant;

public class Invitacion {
 //datos de la invitacion
    private Instant hora;
    private Invitable invitado;
    private Reunion reunion;

    //constructores
    public Invitacion(Invitable invitado, Reunion reunion) {
        if (invitado==null) {
            throw new IllegalArgumentException("Error, el invitado no puede ser nulo");
        } else if (reunion==null) {
            throw new IllegalArgumentException("Error, la reunion no puede ser nula");
        }

        this.hora = Instant.now(); //la hora de creacion de la invitacion
        this.invitado = invitado;
        this.reunion = reunion;
    }

    //constructor para declarar la hora explicitamente
    public Invitacion(Invitable invitado, Reunion reunion, Instant hora) {
        if (invitado==null) {
            throw new IllegalArgumentException("Error, el invitado no puede ser nulo");
        } else if (reunion==null) {
            throw new IllegalArgumentException("Error, la reunion no puede ser nula");
        } else if (hora==null) {
            throw new IllegalArgumentException("Error, la hora no puede ser nula");
        }

        this.hora = hora;
        this.invitado = invitado;
        this.reunion = reunion;
    }



    //getters y setters
    public Instant getHora() {
        return hora;
    }
    public void setHora(Instant hora) {
        if (hora==null) {
            throw new IllegalArgumentException("Error, la hora no puede ser nula");
        }

        this.hora = hora;
    }

    public Invitable getInvitado() {
        return invitado;
    }
    public void setInvitado(Invitable invitado) {
        if (invitado==null) {
            throw new IllegalArgumentException("Error, el invitado no puede ser nulo");
        }

        this.invitado = invitado;
    }

    public Reunion getReunion() {
        return reunion;
    }
    public void setReunion(Reunion reunion) {
        if (reunion==null) {
            throw new IllegalArgumentException("Error, la reunion no puede ser nula");
        }

        this.reunion = reunion;
    }

    //tostring
    @Override
    public String toString() {
        return "Invitacion= "+"hora:" + hora + ", reunion:" + reunion.toString()".";
    }
}
