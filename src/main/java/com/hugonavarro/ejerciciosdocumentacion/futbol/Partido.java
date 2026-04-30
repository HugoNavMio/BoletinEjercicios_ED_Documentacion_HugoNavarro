package com.hugonavarro.ejerciciosdocumentacion.futbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase que simula un partido de fútbol.
 */
public class Partido {
    private Equipo equipoA;
    private Equipo equipoB;
    private Pelota pelota;
    private Narrador narrador;
    private Random random = new Random();

    public Partido(Equipo equipoA, Equipo equipoB, Narrador narrador) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.narrador = narrador;

        Equipo inicial = random.nextBoolean() ? equipoA : equipoB;
        this.pelota = new Pelota(inicial, 5);
    }

    /**
     * Inicio de un partido de fútbol.
     * @throws InterruptedException Si sleep es interrumpido
     */
    public void jugar() throws InterruptedException {
        long inicio = System.currentTimeMillis();
        long duracion = 3 * 60 * 1000;

        while (System.currentTimeMillis() - inicio < duracion) {
            ejecutarTurno();
            Thread.sleep(2000);
        }

        narrador.narrarResultadoFinal(equipoA, equipoB);
    }

    private void ejecutarTurno() {
        Equipo atacante = pelota.getEquipoActual();
        Equipo defensor = atacante == equipoA ? equipoB : equipoA;

        int indice = pelota.getIndiceJugador();

        Jugador jugadorActual = atacante.getJugador(indice);

        Accion accion = elegirAccion(indice);

        switch (accion) {
            case PASE -> hacerPase(atacante, defensor, indice, jugadorActual);
            case REGATE -> hacerRegate(atacante, defensor, indice, jugadorActual);
            case TIRO -> hacerTiro(atacante, defensor, indice, jugadorActual);
        }
    }

    private Accion elegirAccion(int indice) {
        List<Accion> acciones = new ArrayList<>();

        if (indice < 10) {
            acciones.add(Accion.PASE);
            acciones.add(Accion.REGATE);
        }

        if (indice >= 7) {
            acciones.add(Accion.TIRO);
        }

        return acciones.get(random.nextInt(acciones.size()));
    }

    private void hacerPase(Equipo atacante, Equipo defensor, int indice, Jugador jugador) {
        Jugador rival = defensor.getJugador(10 - indice);

        if (comparar(jugador.getPase(), rival.getDefensa())) {
            pelota.setIndiceJugador(indice + 1);
            narrador.narrarPase(jugador, atacante.getJugador(indice + 1));
        } else {
            narrador.narrarRobo(jugador, rival);
            cambioPosesion(defensor, 10 - indice);
        }
    }

    private void hacerRegate(Equipo atacante, Equipo defensor, int indice, Jugador jugador) {
        Jugador rival = defensor.getJugador(10 - indice);

        if (comparar(jugador.getRegate(), rival.getDefensa())) {
            atacante.intercambiarJugadores(indice, indice + 1);
            pelota.setIndiceJugador(indice + 1);
            narrador.narrarRegate(atacante.getJugador(indice + 1));
        } else {
            narrador.narrarRobo(jugador, rival);
            cambioPosesion(defensor, 10 - indice);
        }
    }

    private void hacerTiro(Equipo atacante, Equipo defensor, int indice, Jugador jugador) {
        Jugador portero = defensor.getJugador(0);

        double tiroCalculado = jugador.getTiro() * (1 - (10 - indice) * 0.10);

        narrador.narrarTiro(jugador);

        if (comparar((int) tiroCalculado, portero.getPortero())) {
            atacante.marcarGol();
            narrador.narrarGol(jugador, atacante);

            cambioPosesion(defensor, 5);
        } else {
            narrador.narrarParada(portero);
            cambioPosesion(defensor, 0);
        }
    }

    private boolean comparar(int atacante, int defensor) {
        atacante = aplicarAleatoriedad(atacante);
        defensor = aplicarAleatoriedad(defensor);

        return atacante > defensor;
    }

    private int aplicarAleatoriedad(int valor) {
        double factor = 0.9 + random.nextDouble() * 0.2;
        return (int) (valor * factor);
    }

    private void cambioPosesion(Equipo nuevoEquipo, int indice) {
        pelota.setEquipoActual(nuevoEquipo);
        pelota.setIndiceJugador(indice);
    }
}
