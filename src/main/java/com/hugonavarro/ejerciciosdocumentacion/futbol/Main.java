package com.hugonavarro.ejerciciosdocumentacion.futbol;

/**
 * Clase Main que sería el punto de entrada.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Equipo betis = GeneradorEquipos.generarEquipo("Real Betis");
            Equipo valencia = GeneradorEquipos.generarEquipo("Valencia C. F.");

            Narrador narrador = new Narrador();

            Partido partido = new Partido(betis, valencia, narrador);
            partido.jugar();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("El partido fue interrumpido");
        }
    }
}
