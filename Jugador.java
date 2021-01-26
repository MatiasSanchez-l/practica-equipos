package ejercicioEquipoFootball;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    private List<ContratoJugador> contratos;

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
        contratos = new ArrayList<>();
    }

    public void agregarContrato(ContratoJugador nuevoContrato){
        Boolean resultado = false;
        if(contratos.isEmpty()){
            contratos.add(nuevoContrato);
        }else{
            for (ContratoJugador contrato: contratos) {
                if(nuevoContrato.getFechaInicioContrato().isBefore(contrato.getFechaFinContrato()) &&
                        nuevoContrato.getFechaFinContrato().isAfter(contrato.getFechaInicioContrato()) ){
                    resultado = true;
                }
            }
            if(resultado) {
                System.out.println("El jugador ya tiene un contrato en esa fecha");
            }else {
                if(!contratos.contains(nuevoContrato)){
                    contratos.add(nuevoContrato);
                }else {
                    System.out.println("El jugador ya tiene ese contrato");
                }
            }
        }

    }

    public Boolean devolverSiUnJugadorJugoEnUnEquipoEnUnaFecha(LocalDate fecha, String nombreEquipo){
        Boolean resultado = false;
        for (ContratoJugador contrato: contratos) {
            if(fecha.isAfter(contrato.getFechaInicioContrato()) && fecha.isBefore(contrato.getFechaFinContrato()) &&
            nombreEquipo.equals(contrato.getEquipo().getNombre())){
                resultado = true;
            }
        }
        return resultado;
    }

    public List<ContratoJugador> getContratos() {
        return contratos;
    }

    public void setContratos(List<ContratoJugador> contratos) {
        this.contratos = contratos;
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
