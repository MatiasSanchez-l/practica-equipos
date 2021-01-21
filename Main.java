package ejercicioEquipoFootball;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //creacion de direccion
        Direccion direccion = new Direccion("J", 4, "J", "J");

        //creacion de dts
        Dt dt1 = new Dt("A", "A", 123, direccion, 8, "o", "SKT",
                LocalDate.of(2018,10,30), LocalDate.of(2019,10,30));

        Dt dt2 = new Dt("B", "B", 183, direccion, 9, "y", "G2",
                LocalDate.of(2018,10,30), LocalDate.of(2019,10,30));

        Dt dt3 = new Dt("T", "O", 173, direccion, 8, "p", "ISG",
                LocalDate.of(2018,10,30), LocalDate.of(2019,10,30));

        //creacion de jugadores
        Jugador jugador1 = new Jugador("Faker", "t", 7, direccion, 7, "t", "SKT",
                LocalDate.of(2019,10,30), LocalDate.of(2019,10,30), LocalDate.of(2019,10,30),
                22, 26,56,1.56f,"atacante");

        Jugador jugador2 = new Jugador("Bengi", "t", 7, direccion, 7, "t", "SKT",
                LocalDate.of(2019,10,30), LocalDate.of(2019,10,30), LocalDate.of(2019,10,30),
                22, 26,56,1.56f,"soporte");

        Jugador jugador3 = new Jugador("Huni", "t", 7, direccion, 7, "t", "SKT",
                LocalDate.of(2019,10,30), LocalDate.of(2019,10,30), LocalDate.of(2019,10,30),
                22, 26,56,1.56f,"atacante");

        Jugador jugador4 = new Jugador("Caps", "t", 7, direccion, 7, "t", "G2",
                LocalDate.of(2019,10,30), LocalDate.of(2019,10,30), LocalDate.of(2019,10,30),
                22, 26,56,1.56f,"defensor");

        Jugador jugador5 = new Jugador("Rekkles", "t", 7, direccion, 7, "t", "G2",
                LocalDate.of(2019,10,30), LocalDate.of(2019,10,30), LocalDate.of(2019,10,30),
                22, 26,56,1.56f,"atacante");

        Jugador jugador6 = new Jugador("Perkz", "t", 7, direccion, 7, "t", "G2",
                LocalDate.of(2019,10,30), LocalDate.of(2019,10,30), LocalDate.of(2019,10,30),
                22, 26,56,1.56f,"atacante");


        Jugador jugador7 = new Jugador("Buggax", "t", 7, direccion, 7, "t", "ISG",
                LocalDate.of(2019,10,30), LocalDate.of(2019,10,30), LocalDate.of(2019,10,30),
                22, 26,56,1.56f,"soporte");


        Jugador jugador8 = new Jugador("Wara", "t", 7, direccion, 7, "t", "ISG",
                LocalDate.of(2019,10,30), LocalDate.of(2019,10,30), LocalDate.of(2019,10,30),
                22, 26,56,1.56f,"defensor");


        Jugador jugador9 = new Jugador("Seiya", "t", 7, direccion, 7, "t", "ISG",
                LocalDate.of(2019,10,30), LocalDate.of(2019,10,30), LocalDate.of(2019,10,30),
                22, 26,56,1.56f,"defensor");

        //creacion de equipos
        Equipo equipo1 = new Equipo("SKT", LocalDate.of(2003,10,30), "Kim", "Jeong-soo",
                direccion, 9, "t", LocalDate.of(2019,10,30), "A", dt1);

        Equipo equipo2 = new Equipo("G2", LocalDate.of(2003,10,30), "Kim", "Jeong-soo",
                direccion, 9, "t", LocalDate.of(2019,10,30), "A", dt2);

        Equipo equipo3 = new Equipo("ISG", LocalDate.of(2003,10,30), "Kim", "Jeong-soo",
                direccion, 9, "t", LocalDate.of(2019,10,30), "A", dt3);

        //agregar jugadores a los equipos
        equipo1.agregarJugador(jugador1);
        equipo1.agregarJugador(jugador2);

        equipo2.agregarJugador(jugador3);
        equipo2.agregarJugador(jugador4);
        equipo2.agregarJugador(jugador5);
        equipo2.agregarJugador(jugador6);

        equipo3.agregarJugador(jugador7);
        equipo3.agregarJugador(jugador8);
        equipo3.agregarJugador(jugador9);

        //agregar los equipos a una lista
        List<Equipo> liga = new ArrayList<>();

        liga.add(equipo1);
        liga.add(equipo2);
        liga.add(equipo3);

        //Mostrar cantidad de jugadores de los equipos. con equipos ordenados por nombre
        Collections.sort(liga);

        System.out.println("------------Cantidad Jugadores-------------");
        for(Equipo equipo: liga){
            System.out.println(equipo.getNombre() + " tiene " + equipo.mostrarCantidadDeJugadores() + " jugadores.") ;
        }
        System.out.println("------------Cantidad Defensores-------------");
        //mostrar cantidad defensores
        for(Equipo equipo: liga){
            System.out.println(equipo.getNombre() + " tiene " + equipo.mostrarCantidadDeDefensores() + " defensores.") ;
        }
    }
}
