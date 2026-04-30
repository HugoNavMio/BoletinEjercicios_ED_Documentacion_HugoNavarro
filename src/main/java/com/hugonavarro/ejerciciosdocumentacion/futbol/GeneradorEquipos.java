package com.hugonavarro.ejerciciosdocumentacion.futbol;

import net.datafaker.Faker;

import java.util.Random;

/**
 * Clase que representa a un generador de equipos de fútbol de forma aleatoria.
 */
public class GeneradorEquipos {
    private static final Faker faker = new Faker();
    private static final Random random = new Random();

    public static Equipo generarEquipo(String nombre) {
        Jugador[] jugadores = new Jugador[11];

        for (int i = 0; i < 11; i++) {
            jugadores[i] = new Jugador(
                    i + 1,
                    faker.name().fullName(),
                    i == 0 ? randomStat(70, 100) : randomStat(0, 30),
                    randomStat(40, 100),
                    randomStat(40, 100),
                    randomStat(40, 100),
                    randomStat(40, 100)
            );
        }

        return new Equipo(nombre, jugadores);
    }

    private static int randomStat(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
