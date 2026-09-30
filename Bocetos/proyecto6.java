package principal;

import java.util.Scanner;
// Permite utilizar Scanner para leer datos del teclado.

public class proyecto6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creamos el Scanner para poder escribir datos por teclado.


        // NÚMERO DE JUGADORES

        int jugadores;
        // Variable donde guardaremos cuántos jugadores hay.

        do {

            System.out.print("¿Cuántos jugadores se van a registrar?");
            jugadores = sc.nextInt();
            // Pedimos el número de jugadores.

            if (jugadores <= 0) {
                System.out.println("Error. Debe ser un número mayor que 0.");
            }
            // Si escribe 0 o un número negativo, mostramos error.

        } while (jugadores <= 0);
        // Repetimos mientras el número sea incorrecto.


        // VARIABLES GENERALES

        int puntuacionTotal = 0;
        // Puntos de TODOS los jugadores.

        int enemigosTotal = 0;
        // Enemigos derrotados por TODOS.

        int mayorPuntuacion = 0;
        // Guardará la puntuación más alta.

        int jugadorMayor = 0;
        // Guardará qué jugador tiene esa puntuación.


        // REGISTRAMOS LOS JUGADORES

        for (int i = 1; i <= jugadores; i++) {
        // Repetimos esto una vez por cada jugador.
        // i = número del jugador.


            System.out.println("===== JUGADOR " + i + " =====");


            // NÚMERO DE PARTIDAS

            int partidas;
            // Guardamos cuántas partidas ha jugado este jugador.

            do {

                System.out.print("¿Cuántas partidas ha jugado? ");
                partidas = sc.nextInt();

                if (partidas <= 0) {
                    System.out.println("Error. Debe ser mayor que 0.");
                }

            } while (partidas <= 0);
            // Volvemos a preguntar si pone 0 o menos.


            // DATOS DEL JUGADOR

            int puntuacionJugador = 0;
            // Puntos acumulados SOLO de este jugador.

            int enemigosJugador = 0;
            // Enemigos acumulados SOLO de este jugador.


            // REGISTRAMOS LAS PARTIDAS

            for (int partida = 1; partida <= partidas; partida++) {
            // Repetimos una vez por cada partida.


                // PUNTOS

                int puntos;

                do {

                    System.out.print("Puntos conseguidos: ");
                    puntos = sc.nextInt();

                    if (puntos < 0) {
                        System.out.println("Error. Los puntos no pueden ser negativos.");
                    }

                } while (puntos < 0);
                // Pedimos puntos hasta que sean 0 o mayores.


                // ENEMIGOS

                int enemigos;

                do {

                    System.out.print("Enemigos derrotados: ");
                    enemigos = sc.nextInt();

                    if (enemigos < 0) {
                        System.out.println("Error. No puede ser negativo.");
                    }

                } while (enemigos < 0);
                // Pedimos enemigos hasta que sean 0 o mayores.


                // SUMAMOS

                puntuacionJugador = puntuacionJugador + puntos;
                // Añadimos los puntos de esta partida
                // a los puntos del jugador.

                enemigosJugador = enemigosJugador + enemigos;
                // Añadimos los enemigos de esta partida
                // a los enemigos del jugador.


                // BONUS

                if (puntos > 1000) {
                    // Si ESTA partida tiene más de 1000 puntos...

                    puntuacionJugador = puntuacionJugador + 100;
                    // ...añadimos 100 puntos extra.

                    System.out.println("¡Bonus de 100 puntos!");
                }

            }
            // Aquí terminan las partidas de este jugador.


            // MEDIA

            double media = (double) puntuacionJugador / partidas;
            // Calculamos los puntos de media por partida.


            // RESULTADOS DEL JUGADOR

            System.out.println("Puntuación total: " + puntuacionJugador);
            // Enseñamos los puntos del jugador.

            System.out.println("Enemigos derrotados: " + enemigosJugador);
            // Enseñamos sus enemigos.

            System.out.printf("Puntuación media por partida: %.2f%n", media);
            // Enseñamos la media con 2 decimales.


            // TOTALES GENERALES

            puntuacionTotal = puntuacionTotal + puntuacionJugador;
            // Añadimos los puntos de este jugador al total.

            enemigosTotal = enemigosTotal + enemigosJugador;
            // Añadimos sus enemigos al total.


            // JUGADOR CON MÁS PUNTOS

            if (puntuacionJugador > mayorPuntuacion) {
                // Comparamos sus puntos con el récord anterior.

                mayorPuntuacion = puntuacionJugador;
                // Guardamos la nueva puntuación más alta.

                jugadorMayor = i;
                // Guardamos qué jugador tiene esa puntuación.
            }

        }
        // Aquí terminan TODOS los jugadores.


        // RESULTADOS FINALES

        System.out.println("Jugador con mayor puntuación: Jugador " + jugadorMayor);
        // Mostramos quién tiene más puntos.

        System.out.println("Puntuación del mejor jugador: "+ mayorPuntuacion);
        // Mostramos sus puntos.

        System.out.println("Puntuación total de todos los jugadores: "+ puntuacionTotal);
        // Mostramos los puntos de todos juntos.

        System.out.println("Número total de enemigos derrotados: " + enemigosTotal);
        // Mostramos todos los enemigos juntos.


        sc.close();
        // Cerramos el Scanner.
    }
}