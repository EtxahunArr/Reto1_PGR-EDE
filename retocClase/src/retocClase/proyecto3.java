package retocClase;

import java.util.Scanner;

public class proyecto3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int diaActual;
        int mesActual;
        int anioActual;

        do {
            System.out.print("Introduce el día: ");
            diaActual = sc.nextInt();

            if (diaActual < 1 || diaActual > 31) {
                System.out.println("Error. El día debe estar entre 1 y 31.");
            }

        } while (diaActual < 1 || diaActual > 31);


        do {
            System.out.print("Introduce el mes: ");
            mesActual = sc.nextInt();

            if (mesActual < 1 || mesActual > 12) {
                System.out.println("Error. El mes debe estar entre 1 y 12.");
            }

        } while (mesActual < 1 || mesActual > 12);


        do {
            System.out.print("Introduce el año: ");
            anioActual = sc.nextInt();

            if (anioActual < 0) {
                System.out.println("Error. El año no puede ser negativo.");
            }

        } while (anioActual < 0);


        int necesitanRevision = 0;
        int noNecesitanRevision = 0;
        char continuar;


        do {

            int id;

            do {
                System.out.print("Número de identificación de la bicicleta: ");
                id = sc.nextInt();

                if (id < 0) {
                    System.out.println("Error. El número no puede ser negativo.");
                }

            } while (id < 0);


            int diaRevision;
            int mesRevision;
            int anioRevision;


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


            boolean necesitaRevision = false;


            if (anioActual - anioRevision > 1) {

                necesitaRevision = true;

            } else if (anioActual - anioRevision == 1) {

                if (mesActual > mesRevision) {

                    necesitaRevision = true;

                } else if (mesActual == mesRevision && diaActual > diaRevision) {

                    necesitaRevision = true;
                }
            }


            if (necesitaRevision) {

                System.out.println("Esta bicicleta necesita revisión.");

                necesitanRevision = necesitanRevision + 1;

            } else {

                System.out.println("Esta bicicleta NO necesita revisión.");

                noNecesitanRevision = noNecesitanRevision + 1;
            }


            do {

                System.out.print("¿Quiere registrar otra bicicleta? Conteste S o N: ");

                continuar = sc.next().toUpperCase().charAt(0);

                if (continuar != 'S' && continuar != 'N') {
                    System.out.println("Error. Debe introducir S o N.");
                }

            } while (continuar != 'S' && continuar != 'N');


        } while (continuar == 'S');


        System.out.println("Bicicletas que necesitan revisión: "
                + necesitanRevision);

        System.out.println("Bicicletas que no necesitan revisión: "
                + noNecesitanRevision);


        sc.close();
    }
}

