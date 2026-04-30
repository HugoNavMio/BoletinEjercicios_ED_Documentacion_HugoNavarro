package com.hugonavarro.ejerciciosdocumentacion.futbol;

/**
 * Clase que representa la posesión actual de un balón de fútbol.
 */
public class Pelota {
    private Equipo equipoActual;
    private int indiceJugador;

    /**
     * Constructor de la clase Pelota.
     * @param equipoActual Equipo en posesión
     * @param indiceJugador Índice de un jugador con el balón
     */
    public Pelota(Equipo equipoActual, int indiceJugador) {
        this.equipoActual = equipoActual;
        this.indiceJugador = indiceJugador;
    }

    public Equipo getEquipoActual() {
        return equipoActual;
    }

    public void setEquipoActual(Equipo equipoActual) {
        this.equipoActual = equipoActual;
    }

    public int getIndiceJugador() {
        return indiceJugador;
    }

    public void setIndiceJugador(int indiceJugador) {
        this.indiceJugador = indiceJugador;
    }
}
