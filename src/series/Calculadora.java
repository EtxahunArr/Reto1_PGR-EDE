package series;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        int contadorPersonas = 0;
        double consumoGrupal = 0;

        int opcion;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantas personas son");

        int grupo = teclado.nextInt();

        for (contadorPersonas = 0; contadorPersonas < grupo; contadorPersonas++) {

            double coche = 0;
            double consumoCoche = 0;

            double autobus = 0;
            double consumoAutobus = 0;

            double bicicleta = 0;
            double consumoBicicleta = 0;

            double consumoPlancha = 0;

            double ordenador = 0;
            double consumoOrdenador = 0;

            double movil = 0;
            double consumoMovil = 0;

            String nombre;

            System.out.println("Ingrese el nombre de la persona:");
            nombre = teclado.next();

            do {

                System.out.println("Menu");
                System.out.println("1. consumo coche");
                System.out.println("2. consumo autobus");
                System.out.println("3. consumo bicicleta");
                System.out.println("4. consumo plancha");
                System.out.println("5. consumo ordenador");
                System.out.println("6. consumo movil");
                System.out.println("7. salir");

                opcion = teclado.nextInt();

                switch (opcion) {

                case 1:

                    System.out.println("1. Ingrese los km en coche");

                    coche = teclado.nextDouble();

                    if (coche > 0) {
                        consumoCoche = coche * 0.21;
                    } else {
                        System.out.println("Vuelva a ingresar una cantidad valida");
                    }

                    break;

                case 2:

                    System.out.println("2. Ingrese los km en autobus");

                    autobus = teclado.nextDouble();

                    if (autobus > 0) {
                        consumoAutobus = autobus * 0.10;
                    } else {
                        System.out.println("Vuelva a ingresar una cantidad valida");
                    }

                    break;

                case 3:

                    System.out.println("3. Ingrese los km en bicicleta");

                    bicicleta = teclado.nextDouble();

                    if (bicicleta > 0) {
                        consumoBicicleta = bicicleta * 0;
                    } else {
                        System.out.println("Vuelva a ingresar una cantidad valida");
                    }

                    break;

                case 4:

                    System.out.println("4. Uso de plancha 1=si/0=no");

                    int usoPlancha = teclado.nextInt();

                    if (usoPlancha == 1) {

                        System.out.println("Consumo de horas");

                        double horasPlancha = teclado.nextDouble();

                        if (horasPlancha > 0) {
                            consumoPlancha = horasPlancha * 0.70;
                        } else {
                            System.out.println("Vuelva a ingresar una cantidad valida");
                        }
                    }

                    break;

                case 5:

                    System.out.println("5. Horas de uso del ordenador");

                    ordenador = teclado.nextDouble();

                    if (ordenador > 0) {
                        consumoOrdenador = ordenador * 0.08;
                    } else {
                        System.out.println("Vuelva a ingresar una cantidad valida");
                    }

                    break;

                case 6:

                    System.out.println("6. Consumo de movil");

                    movil = teclado.nextDouble();

                    if (movil > 0) {
                        consumoMovil = movil * 0.02;
                    } else {
                        System.out.println("Vuelva a ingresar una cantidad valida");
                    }

                    break;

                case 7:

                    System.out.println("Salir");

                    break;

                default:

                    System.out.println("Opcion no valida");

                    break;
                }

            } while (opcion != 7);

            double consumoPersonal = consumoCoche
                    + consumoAutobus
                    + consumoBicicleta
                    + consumoPlancha
                    + consumoOrdenador
                    + consumoMovil;

            System.out.println("Consumo personal total es: " + consumoPersonal);

            consumoGrupal = consumoGrupal + consumoPersonal;
        }

        System.out.println("Consumo grupal total es: " + consumoGrupal);

        teclado.close();
    }
}


