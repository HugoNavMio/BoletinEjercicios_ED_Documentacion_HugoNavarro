package com.hugonavarro.ejerciciosdocumentacion.futbol;

/**
 * Clase que representa a un narrador que narra partidos de fútbol.
 */
public class Narrador {
    public void narrarPase(Jugador origen, Jugador destino) {
        System.out.println(origen + " combina con " + destino);
    }

    public void narrarRobo(Jugador atacante, Jugador defensor) {
        System.out.println(atacante + " pierde el balón. " + defensor + " recupera la pelota.");
    }

    public void narrarRegate(Jugador jugador) {
        System.out.println(jugador + " supera a su rival con un regate supremo.");
    }

    public void narrarTiro(Jugador jugador) {
        System.out.println(jugador + " chuta hacia la portería y...");
    }

    public void narrarParada(Jugador portero) {
        System.out.println(portero + " realiza una gran parada.");
    }

    public void narrarGol(Jugador jugador, Equipo equipo) {
        System.out.println("¡¡¡GOOOOOOOOOOL DE " + jugador + "!!! ¡GOLAZO PARA EL EQUIPO " + equipo.getNombre() + "!");
    }

    public void narrarResultadoFinal(Equipo a, Equipo b) {
        System.out.println("\n----- FINAL DEL PARTIDO -----");
        System.out.println(a.getNombre() + " " + a.getGoles() + " - " + b.getGoles() + " " + b.getNombre());
    }
}
