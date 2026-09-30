package retocClase;
// Paquete donde está guardado el programa.

import java.util.Scanner;
// Permite leer datos del teclado.

public class retoextra {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creamos Scanner.


        // NÚMERO DE ALUMNOS

        int alumnos;

        do {
            System.out.print("¿Cuántos alumnos hay? ");
            alumnos = sc.nextInt();

            if (alumnos <= 0) {
                // No puede haber 0 ni números negativos.
                System.out.println("Error. Debe ser mayor que 0.");
            }

        } while (alumnos <= 0);
        // Repite hasta introducir un número mayor que 0.


        // CONTADOR DE ALUMNOS NO PROTEGIDOS

        int noProtegidos = 0;
        // Aquí contamos cuántos alumnos NO tienen la pauta completa.


        // REGISTRAMOS CADA ALUMNO

        for (int i = 1; i <= alumnos; i++) {
            // Se repite una vez por cada alumno.

            System.out.println();
            System.out.println("===== ALUMNO " + i + " =====");


            // Preguntamos si ha pasado la COVID

            int covid;

            do {
                System.out.print("¿Ha pasado la COVID? (1 = sí, 0 = no): ");
                covid = sc.nextInt();

                if (covid != 0 && covid != 1) {
                    // Solo se permite 0 o 1.
                    System.out.println("Error. Introduce 1 o 0.");
                }

            } while (covid != 0 && covid != 1);
            // Sigue preguntando si no es 0 ni 1.


            // NÚMERO DE VACUNAS

            int vacunas;

            do {
                System.out.print("¿Cuántas vacunas tiene? ");
                vacunas = sc.nextInt();

                if (vacunas < 0) {
                    // No puede tener vacunas negativas.
                    System.out.println("Error. No puede ser negativo.");
                }

            } while (vacunas < 0);


            // COMPROBAMOS SI TIENE LA PAUTA COMPLETA

            boolean pautaCompleta = false;
            // Al principio suponemos que NO tiene la pauta completa.


            if (covid == 1 && vacunas >= 1) {
                // Si ha pasado la COVID y tiene al menos 1 vacuna...
                pautaCompleta = true;

            } else if (covid == 0 && vacunas >= 2) {
                // Si NO ha pasado la COVID y tiene al menos 2 vacunas...
                pautaCompleta = true;
            }


            // RESULTADO

            if (!pautaCompleta) {
                // ! significa "NO".
                // Por tanto: si NO tiene la pauta completa...

                System.out.println("El alumno NO tiene la pauta completa.");

                noProtegidos++;
                // Sumamos 1 al contador.
                // Es lo mismo que:
                // noProtegidos = noProtegidos + 1;

            } else {

                System.out.println("El alumno tiene la pauta completa.");


                // MES DE LA ÚLTIMA VACUNA

                int mesVacuna;

                do {
                    System.out.print(
                        "Introduce el mes de la última vacuna (1-12): "
                    );

                    mesVacuna = sc.nextInt();

                    if (mesVacuna < 1 || mesVacuna > 12) {
                        // El mes debe estar entre 1 y 12.
                        System.out.println(
                            "Error. El mes debe estar entre 1 y 12."
                        );
                    }

                } while (mesVacuna < 1 || mesVacuna > 12);


                // AÑO DE LA ÚLTIMA VACUNA

                int anioVacuna;

                do {
                    System.out.print(
                        "Introduce el año de la última vacuna: "
                    );

                    anioVacuna = sc.nextInt();

                    if (anioVacuna < 0) {
                        System.out.println(
                            "Error. El año no puede ser negativo."
                        );
                    }

                } while (anioVacuna < 0);


                // CALCULAMOS HASTA CUÁNDO ESTÁ PROTEGIDO

                int mesProteccion = mesVacuna + 6;
                // Sumamos 6 meses al mes de la vacuna.

                int anioProteccion = anioVacuna;
                // De momento el año es el mismo.


                if (mesProteccion > 12) {
                    // Si nos hemos pasado de diciembre...

                    mesProteccion = mesProteccion - 12;
                    // Volvemos al principio de los meses.

                    anioProteccion++;
                    // Pasamos al año siguiente.
                }


                System.out.println(
                    "El alumno estará protegido hasta el mes "
                    + mesProteccion
                    + " del año "
                    + anioProteccion
                );
            }
        }


        // RESULTADO FINAL

        System.out.println();
        System.out.println("=================================");
        System.out.println("       RESULTADO FINAL");
        System.out.println("=================================");

        System.out.println(
            "Alumnos que no tienen la pauta completa: "
            + noProtegidos
        );

        sc.close();
        // Cerramos Scanner.
    }
}