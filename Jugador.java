package ejercicioEquipoFootball;

import java.time.LocalDate;

public class Jugador extends Persona{
    private String club;
    private LocalDate fechaQueJugo;
    private LocalDate fechaDebut;
    private LocalDate fechaNacimiento;
    private int cantidadPartidos;
    private int cantidadGoles;
    private int peso;
    private float altura;
    private String posicion;

    public Jugador(String nombre, String apellido, int dni, Direccion direccion, int telefono, String email, String club, LocalDate fechaQueJugo,
                   LocalDate fechaDebut, LocalDate fechaNacimiento, int cantidadPartidos, int cantidadGoles, int peso, float altura, String posicion) {
        super(nombre, apellido, dni, direccion, telefono, email);
        this.club = club;
        this.fechaQueJugo = fechaQueJugo;
        this.fechaDebut = fechaDebut;
        this.fechaNacimiento = fechaNacimiento;
        this.cantidadPartidos = cantidadPartidos;
        this.cantidadGoles = cantidadGoles;
        this.peso = peso;
        this.altura = altura;
        this.posicion = posicion;
    }



    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public LocalDate getFechaQueJugo() {
        return fechaQueJugo;
    }

    public void setFechaQueJugo(LocalDate fechaQueJugo) {
        this.fechaQueJugo = fechaQueJugo;
    }

    public LocalDate getFechaDebut() {
        return fechaDebut;
    }

    public void setFechaDebut(LocalDate fechaDebut) {
        this.fechaDebut = fechaDebut;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCantidadPartidos() {
        return cantidadPartidos;
    }

    public void setCantidadPartidos(int cantidadPartidos) {
        this.cantidadPartidos = cantidadPartidos;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
