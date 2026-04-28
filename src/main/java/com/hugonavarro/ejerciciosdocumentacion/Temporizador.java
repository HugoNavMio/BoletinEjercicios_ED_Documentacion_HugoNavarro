package com.hugonavarro.ejerciciosdocumentacion;

/**
 * Clase que representa un Temporizador.
 */
public class Temporizador {
    /**
     * Segundos del temporizador.
     */
    private int segundos;

    /**
     * Obtiene los segundos iniciales.
     *
     * @param segundosIniciales Número de los segundos iniciales
     */
    public Temporizador(int segundosIniciales) {
        this.segundos = segundosIniciales;
    }

    /**
     * Incrementa los segundos extras.
     *
     * @param segundosExtra Número de los segundos extra
     * @throws IllegalArgumentException Si hubiesen números negativos
     */
    public void incrementar(int segundosExtra) {
        if (segundosExtra < 0) {
            throw new IllegalArgumentException("No se permiten valores negativos");
        }
        segundos += segundosExtra;
    }

    /**
     * Reinicia el temporizador.
     */
    public void reiniciar() {
        segundos = 0;
    }

    /**
     * Obtiene los segundos totales.
     * @return Devuelve los segundos totales
     */
    public int getSegundos() {
        return segundos;
    }
}