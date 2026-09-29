package retocClase;
// Paquete donde está el programa.

import java.util.Scanner;
// Permite leer datos del teclado.

public class proyecto3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creamos el Scanner.


        // FECHA ACTUAL

        int diaActual;
        int mesActual;
        int anioActual;
        // Guardamos el día, mes y año de hoy.


        do {
            System.out.print("Introduce el día: ");
            diaActual = sc.nextInt();

            if (diaActual < 1 || diaActual > 31) {
                System.out.println("Error. El día debe estar entre 1 y 31.");
            }

        } while (diaActual < 1 || diaActual > 31);
        // El día debe estar entre 1 y 31.


        do {
            System.out.print("Introduce el mes: ");
            mesActual = sc.nextInt();

            if (mesActual < 1 || mesActual > 12) {
                System.out.println("Error. El mes debe estar entre 1 y 12.");
            }

        } while (mesActual < 1 || mesActual > 12);
        // El mes debe estar entre 1 y 12.


        do {
            System.out.print("Introduce el año: ");
            anioActual = sc.nextInt();

            if (anioActual < 0) {
                System.out.println("Error. El año no puede ser negativo.");
            }

        } while (anioActual < 0);
        // El año no puede ser negativo.


        // CONTADORES

        int necesitanRevision = 0;
        // Cuenta bicicletas que necesitan revisión.

        int noNecesitanRevision = 0;
        // Cuenta bicicletas que NO necesitan revisión.

        char continuar;
        // Guardará S o N.


        // REGISTRAMOS BICICLETAS

        do {
        // Este do while permite registrar una o varias bicicletas.


            // IDENTIFICACIÓN

            int id;

            do {
                System.out.print("Número de identificación de la bicicleta: ");
                id = sc.nextInt();

                if (id < 0) {
                    System.out.println("Error. El número no puede ser negativo.");
                }

            } while (id < 0);
            // El ID no puede ser negativo.


            // FECHA DE LA ÚLTIMA REVISIÓN

            int diaRevision;
            int mesRevision;
            int anioRevision;
            // Guardamos la fecha de la última revisión.


            do {
                System.out.print("Día: ");
                diaRevision = sc.nextInt();

                if (diaRevision < 1 || diaRevision > 31) {
                    System.out.println("Error. El día debe estar entre 1 y 31.");
                }

            } while (diaRevision < 1 || diaRevision > 31);


            do {
                System.out.print("Mes: ");
                mesRevision = sc.nextInt();

                if (mesRevision < 1 || mesRevision > 12) {
                    System.out.println("Error. El mes debe estar entre 1 y 12.");
                }

            } while (mesRevision < 1 || mesRevision > 12);


            do {
                System.out.print("Año: ");
                anioRevision = sc.nextInt();

                if (anioRevision < 0 || anioRevision > anioActual) {
                    System.out.println("Error. Introduce un año válido.");
                }

            } while (anioRevision < 0 || anioRevision > anioActual);
            // La revisión no puede ser de un año futuro.


            // ¿NECESITA REVISIÓN?

            boolean necesitaRevision = false;
            // Empezamos suponiendo que NO necesita revisión.


            if (anioActual - anioRevision > 1) {

                necesitaRevision = true;
                // Si han pasado más de un año,
                // necesita revisión.

            } else if (anioActual - anioRevision == 1) {

                // Ha pasado exactamente un año.
                // Ahora miramos el mes.

                if (mesActual > mesRevision) {

                    necesitaRevision = true;
                    // El mes actual ya ha pasado el mes de la revisión.

                } else if (mesActual == mesRevision
                        && diaActual > diaRevision) {

                    necesitaRevision = true;
                    // Mismo mes, pero el día actual es posterior.

                }
            }


            // RESULTADO

            if (necesitaRevision) {

                System.out.println("Esta bicicleta necesita revisión.");

                necesitanRevision++;
                // Sumamos 1 al contador.

            } else {

                System.out.println("Esta bicicleta NO necesita revisión.");

                noNecesitanRevision++;
                // Sumamos 1 al otro contador.
            }


            // ¿OTRA BICICLETA?

            do {

                System.out.print("¿Quiere registrar otra bicicleta? Conteste S o N: ");

                continuar = sc.next().toUpperCase().charAt(0);

                if (continuar != 'S' && continuar != 'N') {
                    System.out.println("Error. Debe introducir S o N.");
                }

            } while (continuar != 'S' && continuar != 'N');
            // Solo acepta S o N.


        } while (continuar == 'S');
        // Si escribe S, vuelve a registrar otra bicicleta.
        // Si escribe N, termina.


        // RESULTADOS FINALES

        System.out.println("Bicicletas que necesitan revisión: "
                + necesitanRevision);

        System.out.println("Bicicletas que no necesitan revisión: "
                + noNecesitanRevision);


        sc.close();
        // Cerramos el Scanner.
    }
}