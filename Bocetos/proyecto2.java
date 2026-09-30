package retocClase;
// Paquete del programa.

import java.util.Scanner;
// Para leer datos del teclado.

public class proyecto2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creamos el Scanner.


        int participantes = 0;
        // Cuenta cuántas personas participan.

        int menos60 = 0;
        // Cuenta cuántos terminan en menos de 60 minutos.

        int masDe3Carreras = 0;
        // Cuenta cuántos tienen más de 3 carreras anteriores.

        double sumaTiempos = 0;
        // Guarda la suma de los tiempos de todos.

        double mejorTiempo = 0;
        // Guarda el mejor tiempo.

        char continuar;
        // Guardará S o N.


        do {
        // Repetimos mientras el usuario quiera añadir participantes.


            participantes++;
            // Cada vez que entramos aquí hay un nuevo participante.
            // Por eso aumentamos el contador.


            System.out.print("Introduce el DNI: ");
            String dni = sc.next();
            // Guardamos el DNI.


            int modalidad;

            do {
                System.out.println("1. Individual");
                System.out.println("2. Por parejas");
                System.out.print("Elige una opción: ");

                modalidad = sc.nextInt();

                if (modalidad != 1 && modalidad != 2) {
                    System.out.println("Error. Introduce 1 o 2.");
                }

            } while (modalidad != 1 && modalidad != 2);
            // Solo permite elegir 1 o 2.


            int carrerasAnteriores;

            do {
                System.out.print("¿En cuántas carreras ha participado anteriormente? ");

                carrerasAnteriores = sc.nextInt();

                if (carrerasAnteriores < 0) {
                    System.out.println("Error. No puede ser negativo.");
                }

            } while (carrerasAnteriores < 0);
            // Las carreras anteriores no pueden ser negativas.


            if (carrerasAnteriores > 3) {
                masDe3Carreras++;
            }
            // Si tiene más de 3 carreras,
            // aumentamos el contador en 1.


            int minutos;

            do {
                System.out.print("Introduce los minutos: ");

                minutos = sc.nextInt();

                if (minutos < 0) {
                    System.out.println("Error. Los minutos no pueden ser negativos.");
                }

            } while (minutos < 0);
            // Los minutos no pueden ser negativos.


            int segundos;

            do {
                System.out.print("Introduce los segundos (0-59): ");

                segundos = sc.nextInt();

                if (segundos < 0 || segundos > 59) {
                    System.out.println("Error. Los segundos deben estar entre 0 y 59.");
                }

            } while (segundos < 0 || segundos > 59);
            // Los segundos tienen que estar entre 0 y 59.


            int tiempoSegundos = minutos * 60 + segundos;
            // Convertimos todo el tiempo a segundos.


            if (tiempoSegundos < 3600) {

                menos60++;

                System.out.println("Ha terminado en menos de 60 minutos.");

            } else {

                System.out.println("No ha terminado en menos de 60 minutos.");
            }
            // 60 minutos = 3600 segundos.
            // Si tarda menos, aumentamos menos60.


            sumaTiempos = sumaTiempos + tiempoSegundos;
            // Añadimos el tiempo de este participante
            // a la suma de todos.


            if (participantes == 1 || tiempoSegundos < mejorTiempo) {

                mejorTiempo = tiempoSegundos;
            }
            // Si es el primer participante, su tiempo es el mejor.
            // Si no es el primero, comprobamos si ha tardado menos
            // que el mejor tiempo anterior.


            do {
                System.out.print("¿Quieres registrar otro participante? (S/N): ");

                continuar = sc.next().toUpperCase().charAt(0);

                if (continuar != 'S' && continuar != 'N') {
                    System.out.println("Error. Introduce S o N.");
                }

            } while (continuar != 'S' && continuar != 'N');
            // Solo acepta S o N.


        } while (continuar == 'S');
        // Si escribe S, volvemos a registrar otro participante.


        double tiempoMedio = sumaTiempos / participantes;
        // Sumamos todos los tiempos y dividimos
        // entre el número de participantes.


        System.out.println("Número total de participantes: "
                + participantes);

        System.out.println("Participantes en menos de 60 minutos: "
                + menos60);

        System.out.println("Participantes con más de 3 carreras anteriores: "
                + masDe3Carreras);

        System.out.printf("Tiempo medio: %.2f segundos%n",
                tiempoMedio);

        System.out.printf("Mejor tiempo: %.2f segundos%n",
                mejorTiempo);


        sc.close();
    }
}