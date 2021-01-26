package ejercicioEquipoFootball;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Equipo implements Comparable<Equipo> {
    private String nombre;
    private LocalDate fechaFundacion;
    private String nombrePresidente;
    private String apellidoPresidente;
    private Direccion direccion;
    private int telefono;
    private String email;
    private LocalDate fechaPrimeraDivision;
    private String categoria;
    private Dt dt;
    private List<Jugador> jugadores;
    private List<ContratoJugador> contratos;

    public Equipo(String nombre, LocalDate fechaFundacion, String nombrePresidente, String apellidoPresidente, Direccion direccion, int telefonos,
                  String emails, LocalDate fechaPrimeraDivision, String categoria, Dt dt) {
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.nombrePresidente = nombrePresidente;
        this.apellidoPresidente = apellidoPresidente;
        this.direccion = direccion;
        this.telefono = telefonos;
        this.email = emails;
        this.fechaPrimeraDivision = fechaPrimeraDivision;
        this.categoria = categoria;
        this.dt = dt;
        this.jugadores = new ArrayList<>();
        contratos = new ArrayList<>();
    }

    public void agregarContrato(ContratoJugador nuevoContrato){
        if(contratos.isEmpty()){
            contratos.add(nuevoContrato);
        }else {
            if(!contratos.contains(nuevoContrato)){
                contratos.add(nuevoContrato);
            }else {
                System.out.println("El equipo ya tiene ese contrato");
            }
        }
    }

    public int devolverCantidadDeJugadoresEnUnaFechaEspecifica(LocalDate fecha){
        int resultado= 0;
        for (ContratoJugador contrato: contratos) {
            Boolean jugadorJugoEnEquipo = contrato.getJugador().devolverSiUnJugadorJugoEnUnEquipoEnUnaFecha(fecha, this.nombre);
            if (jugadorJugoEnEquipo){
                resultado++;
            }
        }
        return resultado;
    }


    public void agregarJugador(Jugador jugador){
        if(!jugadores.contains(jugador)){
                jugadores.add(jugador);
        }else {
            System.out.println("El jugador que quiere agregar al equipo ya existe");
        }
    }

    public int mostrarCantidadDeJugadores()
    {
        return jugadores.size();
    }

    public int mostrarCantidadDeDefensores(){
        int cantidadDefensores = 0;
        for (Jugador jugador: jugadores) {
            if(jugador.getPosicion().toLowerCase(Locale.ROOT).equals("defensor")){
                cantidadDefensores++;
            }
        }
        return cantidadDefensores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }

    public String getApellidoPresidente() {
        return apellidoPresidente;
    }

    public void setApellidoPresidente(String apellidoPresidente) {
        this.apellidoPresidente = apellidoPresidente;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaPrimeraDivision() {
        return fechaPrimeraDivision;
    }

    public void setFechaPrimeraDivision(LocalDate fechaPrimeraDivision) {
        this.fechaPrimeraDivision = fechaPrimeraDivision;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Dt getDt() {
        return dt;
    }

    public void setDt(Dt dt) {
        this.dt = dt;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public int compareTo(Equipo o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
