package ejercicioEquipoFootball;

import java.time.LocalDate;

public class ContratoJugador {
    private Equipo equipo;
    private Jugador jugador;
    private LocalDate fechaInicioContrato;
    private LocalDate fechaFinContrato;

    public ContratoJugador(LocalDate fechaInicioContrato, LocalDate fechaFinContrato , Equipo equipo) {
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaFinContrato = fechaFinContrato;
        this.equipo = equipo;
    }

    public ContratoJugador(Jugador jugador, LocalDate fechaInicioContrato, LocalDate fechaFinContrato) {
        this.jugador = jugador;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public LocalDate getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(LocalDate fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public LocalDate getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(LocalDate fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }
}
