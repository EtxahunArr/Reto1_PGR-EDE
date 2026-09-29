package series;

import java.util.Scanner;

public class Videojuego {

    public static void main(String[] args) {

        int usuarios = 0;
        int contador = 0;

        int npartidas = 0;
        int contadorPartidas = 0;

        int puntosObtenidos = 0;
        int enemigosDerrotados = 0;

        // Datos del jugador actual
        double totalPuntosObtenidos = 0;
        int totalEnemigosDerrotados = 0;
        double puntuacionmedia = 0.0;

        // Datos de TODOS los jugadores
        double totalpuntos = 0.0;
        int totalEnemigosTodos = 0;

        // Para buscar el jugador con mayor puntuación
        double mayorPuntuacion = 0;
        int jugadorMayor = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantos usuarios se van a registrar");
        usuarios = teclado.nextInt();

        while(contador < usuarios) {

            System.out.println("Numero de partidas");
            npartidas = teclado.nextInt();

            // Reiniciamos los datos del jugador
            totalPuntosObtenidos = 0;
            totalEnemigosDerrotados = 0;
            contadorPartidas = 0;

            while(contadorPartidas < npartidas) {

                System.out.println("Cantidad de puntos obtenidos");
                puntosObtenidos = teclado.nextInt();

                // Sumamos los puntos de la partida
                totalPuntosObtenidos += puntosObtenidos;

                // Bonus de esa partida
                if(puntosObtenidos > 1000) {
                    totalPuntosObtenidos = totalPuntosObtenidos + 100;

                }

               
                System.out.println("Numero de enemigos derrotados");
                enemigosDerrotados = teclado.nextInt();

                // Sumamos los enemigos de la partida
                totalEnemigosDerrotados += enemigosDerrotados;

                contadorPartidas++;
            }

            
            
            
            System.out.println("Puntuacion total incluyendo bonus: "
                    + totalPuntosObtenidos);
            // Calculamos la media del jugador
            puntuacionmedia =
                    (double) totalPuntosObtenidos / contadorPartidas;


            System.out.println("Enemigos derrotados: "
                    + totalEnemigosDerrotados);

            System.out.println("Puntuacion media por partida: "
                    + puntuacionmedia);

            // Sumamos la puntuacion de este jugador
            // al total de todos los jugadores
            totalpuntos = totalpuntos + totalPuntosObtenidos;

            // Sumamos los enemigos de este jugador
            // al total de todos los jugadores
            totalEnemigosTodos =
                    totalEnemigosTodos + totalEnemigosDerrotados;

            // Comprobamos si es el jugador con mayor puntuacion
            if(totalPuntosObtenidos > mayorPuntuacion) {

                mayorPuntuacion = totalPuntosObtenidos;

                jugadorMayor = contador + 1;
            }

            contador++;
        }

        System.out.println("--------------------------------");

        System.out.println("Jugador con mayor puntuacion: "
                + jugadorMayor);

        System.out.println("Puntuacion del jugador con mayor puntuacion: "
                + mayorPuntuacion);

        System.out.println("Puntuacion total de todos los jugadores: "
                + totalpuntos);

        System.out.println("Numero total de enemigos derrotados: "
                + totalEnemigosTodos);
    }
}