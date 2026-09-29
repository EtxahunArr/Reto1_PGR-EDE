package retocClase;
// Indica el paquete donde está guardado el programa.

import java.util.Scanner;
// Permite utilizar Scanner para leer datos del teclado.

public class proyecto1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creamos Scanner para pedir datos al usuario.

        // Número de personas
        int personas;

        do {
            System.out.print("¿Cuántas personas se van a registrar? ");
            personas = sc.nextInt();

            if (personas <= 0) {
                // No permitimos 0 ni números negativos.
                System.out.println("Error. Introduce un número mayor que 0.");
            }

        } while (personas <= 0);
        // Se repite hasta introducir un número mayor que 0.


        // CO2 total de todas las personas
        double co2TotalGrupo = 0;
        // Aquí acumulamos el CO2 de todas las personas.


        // Repetimos el proceso para cada persona
        for (int i = 1; i <= personas; i++) {

            System.out.println();
            System.out.println("===== PERSONA " + i + " =====");

            // CO2 de la persona
            double co2Persona = 0;
            // Empieza en 0 y vamos sumando sus actividades.

            int opcion;


            // Mostramos el menú
            do {

                System.out.println();
                System.out.println("1. Transporte en coche");
                System.out.println("2. Transporte en autobús");
                System.out.println("3. Transporte en bicicleta");
                System.out.println("4. Uso de plancha");
                System.out.println("5. Uso del ordenador");
                System.out.println("6. Uso del móvil");
                System.out.println("7. Finalizar actividades");

                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();


                switch (opcion) {
                // Según el número elegido, entra en un case.


                case 1:

                    // Kilómetros realizados en coche
                    double kmCoche;

                    do {
                        System.out.print("¿Cuántos km has recorrido en coche? ");
                        kmCoche = sc.nextDouble();

                        if (kmCoche < 0) {
                            System.out.println("Error. No puede ser negativo.");
                        }

                    } while (kmCoche < 0);
                    // Repite mientras los kilómetros sean negativos.


                    // Calculamos el CO2 del coche
                    co2Persona = co2Persona + kmCoche * 0.21;
                    // Cada km de coche produce 0.21 kg de CO2.

                    break;
                    // Sale de este case.


                case 2:

                    // Kilómetros realizados en autobús
                    double kmBus;

                    do {
                        System.out.print("¿Cuántos km has recorrido en autobús? ");
                        kmBus = sc.nextDouble();

                        if (kmBus < 0) {
                            System.out.println("Error. No puede ser negativo.");
                        }

                    } while (kmBus < 0);


                    // Calculamos el CO2 del autobús
                    co2Persona = co2Persona + kmBus * 0.10;
                    // Cada km de autobús produce 0.10 kg de CO2.

                    break;


                case 3:

                    // Kilómetros realizados en bicicleta
                    double kmBici;

                    do {
                        System.out.print("¿Cuántos km has recorrido en bicicleta? ");
                        kmBici = sc.nextDouble();

                        if (kmBici < 0) {
                            System.out.println("Error. No puede ser negativo.");
                        }

                    } while (kmBici < 0);


                    // La bicicleta no produce CO2
                    co2Persona = co2Persona + kmBici * 0;
                    // Multiplicar por 0 hace que no se añada CO2.

                    break;


                case 4:

                    // Preguntamos si ha utilizado la plancha
                    int plancha;

                    do {
                        System.out.print("¿Has utilizado la plancha? (1 = sí, 0 = no): ");
                        plancha = sc.nextInt();

                        if (plancha != 0 && plancha != 1) {
                            // Solo se permiten 0 o 1.
                            System.out.println("Error. Introduce 1 o 0.");
                        }

                    } while (plancha != 0 && plancha != 1);


                    // Si ha utilizado la plancha
                    if (plancha == 1) {
                        // Solo preguntamos las horas si respondió 1.

                        double horasPlancha;

                        do {
                            System.out.print("¿Cuántas horas has utilizado la plancha? ");
                            horasPlancha = sc.nextDouble();

                            if (horasPlancha < 0) {
                                System.out.println("Error. No puede ser negativo.");
                            }

                        } while (horasPlancha < 0);


                        // Calculamos el CO2 de la plancha
                        co2Persona = co2Persona + horasPlancha * 0.70;
                        // Cada hora de plancha produce 0.70 kg.
                    }

                    break;


                case 5:

                    // Horas utilizando el ordenador
                    double horasOrdenador;

                    do {
                        System.out.print("¿Cuántas horas has utilizado el ordenador? ");
                        horasOrdenador = sc.nextDouble();

                        if (horasOrdenador < 0) {
                            System.out.println("Error. No puede ser negativo.");
                        }

                    } while (horasOrdenador < 0);


                    // Calculamos el CO2 del ordenador
                    co2Persona = co2Persona + horasOrdenador * 0.08;
                    // Cada hora produce 0.08 kg de CO2.

                    break;


                case 6:

                    // Horas utilizando el móvil
                    double horasMovil;

                    do {
                        System.out.print("¿Cuántas horas has utilizado el móvil? ");
                        horasMovil = sc.nextDouble();

                        if (horasMovil < 0) {
                            System.out.println("Error. No puede ser negativo.");
                        }

                    } while (horasMovil < 0);


                    // Calculamos el CO2 del móvil
                    co2Persona = co2Persona + horasMovil * 0.02;
                    // Cada hora produce 0.02 kg de CO2.

                    break;


                case 7:

                    // Terminamos las actividades de esta persona
                    System.out.println("Finalizando actividades...");

                    break;
                    // No hace falta hacer nada más.


                default:

                    // Si introduce una opción que no existe
                    System.out.println("Error. Esa opción no existe.");
                }

            } while (opcion != 7);
            // El menú sigue apareciendo hasta elegir 7.


            // Mostramos el CO2 de esta persona
            System.out.printf(
                "CO2 emitido por la persona %d: %.2f kg%n",
                i, co2Persona
            );

            // Sumamos el CO2 al total del grupo
            co2TotalGrupo = co2TotalGrupo + co2Persona;
        }


        // Mostramos el CO2 total
        System.out.printf(
            "%nCO2 total del grupo: %.2f kg%n",
            co2TotalGrupo
        );

        sc.close();
        // Cerramos Scanner.
    }
}