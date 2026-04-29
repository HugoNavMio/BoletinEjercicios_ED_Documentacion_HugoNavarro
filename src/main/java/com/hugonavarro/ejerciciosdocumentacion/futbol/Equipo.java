package com.hugonavarro.ejerciciosdocumentacion.futbol;

/**
 * Clase que representa a un equipo de fútbol.
 */
public class Equipo {
    private String nombre;
    private Jugador[] jugadores;
    private int goles;

    /**
     * Constructor de la clase Equipo.
     * @param nombre Nombre de un equipo
     * @param jugadores Array de 11 jugadores que debe tener un equipo
     * @throws IllegalArgumentException Si un equipo no tuviese exactamente 11 jugadores
     */
    public Equipo(String nombre, Jugador[] jugadores) {
        if (jugadores.length != 11) {
            throw new IllegalArgumentException("El equipo debe tener 11 jugadores");
        }

        this.nombre = nombre;
        this.jugadores = jugadores;
        this.goles = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public Jugador getJugador(int indice) {
        return jugadores[indice];
    }

    public void intercambiarJugadores(int i, int j) {
        Jugador temp = jugadores[i];
        jugadores[i] = jugadores[j];
        jugadores[j] = temp;
    }

    public int getGoles() {
        return goles;
    }

    public void marcarGol() {
        goles++;
    }
}
