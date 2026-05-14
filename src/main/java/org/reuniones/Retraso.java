package org.reuniones;

import java.time.Instant;

public class Retraso extends  Asistencia {
    private Instant hora = Instant.now();

    public Instant getHora() {
        return hora;
    }

    public void setHora(Instant hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Retraso:" + hora;
    }
}
