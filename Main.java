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

        //creacion de equipos
        Equipo equipo1 = new Equipo("SKT", LocalDate.of(2003,10,30), "Kim", "Jeong-soo",
                direccion, 9, "t", LocalDate.of(2019,10,30), "A", dt1);

        Equipo equipo2 = new Equipo("G2", LocalDate.of(2003,10,30), "Kim", "Jeong-soo",
                direccion, 9, "t", LocalDate.of(2019,10,30), "A", dt2);

        Equipo equipo3 = new Equipo("ISG", LocalDate.of(2003,10,30), "Kim", "Jeong-soo",
                direccion, 9, "t", LocalDate.of(2019,10,30), "A", dt3);

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

        //crear contratos de jugadores
        ContratoJugador contratoJugador1 = new ContratoJugador(LocalDate.of(2019,04,30), LocalDate.of(2020,01,29), equipo1);
        ContratoJugador contratoJugador2 = new ContratoJugador(LocalDate.of(2019,05,30), LocalDate.of(2020,02,29), equipo1);

        ContratoJugador contratoJugador3 = new ContratoJugador(LocalDate.of(2019,04,30), LocalDate.of(2020,01,29), equipo2);
        ContratoJugador contratoJugador4 = new ContratoJugador(LocalDate.of(2019,05,30), LocalDate.of(2020,02,29), equipo2);
        ContratoJugador contratoJugador5 = new ContratoJugador(LocalDate.of(2019,03,30), LocalDate.of(2020,01,29), equipo2);
        ContratoJugador contratoJugador6 = new ContratoJugador(LocalDate.of(2019,04,30), LocalDate.of(2020,01,29), equipo2);

        ContratoJugador contratoJugador7 = new ContratoJugador(LocalDate.of(2017,04,30), LocalDate.of(2020,01,29), equipo3);
        ContratoJugador contratoJugador8 = new ContratoJugador(LocalDate.of(2019,05,30), LocalDate.of(2020,02,29), equipo3);
        ContratoJugador contratoJugador9 = new ContratoJugador(LocalDate.of(2019,03,30), LocalDate.of(2020,01,29), equipo3);

        //crear contratos de equipos
        ContratoJugador contrato1Equipo1 = new ContratoJugador(jugador1, LocalDate.of(2019,04,30), LocalDate.of(2020,01,29));
        ContratoJugador contrato2Equipo1 = new ContratoJugador(jugador2, LocalDate.of(2019,05,30), LocalDate.of(2020,02,29));

        ContratoJugador contrato3Equipo2 = new ContratoJugador(jugador3, LocalDate.of(2019,04,30), LocalDate.of(2020,01,29));
        ContratoJugador contrato4Equipo2 = new ContratoJugador(jugador4, LocalDate.of(2019,05,30), LocalDate.of(2020,02,29));
        ContratoJugador contrato5Equipo2 = new ContratoJugador(jugador5, LocalDate.of(2019,03,30), LocalDate.of(2020,01,29));
        ContratoJugador contrato6Equipo2 = new ContratoJugador(jugador6, LocalDate.of(2019,04,30), LocalDate.of(2020,01,29));

        ContratoJugador contrato7Equipo3 = new ContratoJugador(jugador7, LocalDate.of(2017,04,30), LocalDate.of(2020,01,29));
        ContratoJugador contrato8Equipo3 = new ContratoJugador(jugador8, LocalDate.of(2019,05,30), LocalDate.of(2020,02,29));
        ContratoJugador contrato9Equipo3 = new ContratoJugador(jugador9, LocalDate.of(2019,03,30), LocalDate.of(2020,01,29));

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

        //agregar contrato a los jugadores
        jugador1.agregarContrato(contratoJugador1);
        jugador2.agregarContrato(contratoJugador2);
        jugador3.agregarContrato(contratoJugador3);
        jugador4.agregarContrato(contratoJugador4);
        jugador5.agregarContrato(contratoJugador5);
        jugador6.agregarContrato(contratoJugador6);
        jugador7.agregarContrato(contratoJugador7);
        jugador8.agregarContrato(contratoJugador8);
        jugador9.agregarContrato(contratoJugador9);

        //agregar contrato a los equipos
        equipo1.agregarContrato(contrato1Equipo1);
        equipo1.agregarContrato(contrato2Equipo1);

        equipo2.agregarContrato(contrato3Equipo2);
        equipo2.agregarContrato(contrato4Equipo2);
        equipo2.agregarContrato(contrato5Equipo2);
        equipo2.agregarContrato(contrato6Equipo2);

        equipo3.agregarContrato(contrato7Equipo3);
        equipo3.agregarContrato(contrato8Equipo3);
        equipo3.agregarContrato(contrato9Equipo3);

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
        for(Equipo equipo: liga){
            System.out.println(equipo.getNombre() + " tiene " + equipo.mostrarCantidadDeDefensores() + " defensores.") ;
        }

        System.out.println("------------Cantidad de Jugadores en los Equipos en una fecha en Especifico-------------");
        LocalDate fecha = LocalDate.of(2019,8,14);
        for(Equipo equipo: liga){
            System.out.println(equipo.getNombre() + " tenia " + equipo.devolverCantidadDeJugadoresEnUnaFechaEspecifica(fecha)+ " jugadores. En la fecha " + fecha ) ;
        }
    }
}
