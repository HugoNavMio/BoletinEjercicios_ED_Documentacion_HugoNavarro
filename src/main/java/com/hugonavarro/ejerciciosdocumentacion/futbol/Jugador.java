package com.hugonavarro.ejerciciosdocumentacion.futbol;

/**
 * Clase que representa a un jugador de fútbol.
 */
public class Jugador {
    private int dorsal;
    private String nombreCompleto;
    private int portero;
    private int defensa;
    private int regate;
    private int pase;
    private int tiro;

    /**
     * Constructor de la clase Jugador.
     * @param dorsal Dorsal de un jugador
     * @param nombreCompleto Nombre y apellidos de un jugador
     * @param portero Habilidad de un jugador como portero (0-100)
     * @param defensa Habilidad de un jugador que defiende (0-100)
     * @param regate Habilidad de un jugador que regatea (0-100)
     * @param pase Habilidad de un jugador que realiza pases (0-100)
     * @param tiro Habilidad de un jugador que realiza tiros (0-100)
     */
    public Jugador(int dorsal, String nombreCompleto,  int portero, int defensa, int regate, int pase, int tiro) {
        this.dorsal = dorsal;
        this.nombreCompleto = nombreCompleto;
        this.portero = portero;
        this.defensa = defensa;
        this.regate = regate;
        this.pase = pase;
        this.tiro = tiro;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getPortero() {
        return portero;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getRegate() {
        return regate;
    }

    public int getPase() {
        return pase;
    }

    public int getTiro() {
        return tiro;
    }

    @Override
    public String toString() {
        return nombreCompleto + " (#" + dorsal + ")";
    }
}
