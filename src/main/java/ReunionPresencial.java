import java.time.Duration;
import java.time.Instant;

public class ReunionPresencial extends Reunion {
    private String sala;

    public ReunionPresencial(java.time.LocalDate fecha, Instant horaPrevista,
                             Duration duracionPrevista, tipoReunion tipoReunion,
                             Empleado organizador, String sala) {
        super(fecha, horaPrevista, duracionPrevista, tipoReunion, organizador);

        if (sala==null) {
            throw new IllegalArgumentException("Error, la sala no puede ser nula");
        }

        this.sala= sala;
    }

    //getter y setter
    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        if (sala==null) {
            throw new IllegalArgumentException("Error, la sala no puede ser nula");
        }

        this.sala = sala;
    }
}
