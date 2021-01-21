package ejercicioEquipoFootball;

import java.time.LocalDate;

public class Dt extends Persona{
    private String clubDirigido;
    private LocalDate fechaQueDirigioInicio;
    private LocalDate fechaQueDirigioFin;

    public Dt(String nombre, String apellido, int dni, Direccion direccion, int telefono, String email, String clubDirigido, LocalDate fechaQueDirigioInicio, LocalDate fechaQueDirigioFin) {
        super(nombre, apellido, dni, direccion, telefono, email);
        this.clubDirigido = clubDirigido;
        this.fechaQueDirigioInicio = fechaQueDirigioInicio;
        this.fechaQueDirigioFin = fechaQueDirigioFin;
    }

    public String getClubDirigido() {
        return clubDirigido;
    }

    public void setClubDirigido(String clubDirigido) {
        this.clubDirigido = clubDirigido;
    }

    public LocalDate getFechaQueDirigioInicio() {
        return fechaQueDirigioInicio;
    }

    public void setFechaQueDirigioInicio(LocalDate fechaQueDirigioInicio) {
        this.fechaQueDirigioInicio = fechaQueDirigioInicio;
    }

    public LocalDate getFechaQueDirigioFin() {
        return fechaQueDirigioFin;
    }

    public void setFechaQueDirigioFin(LocalDate fechaQueDirigioFin) {
        this.fechaQueDirigioFin = fechaQueDirigioFin;
    }
}
