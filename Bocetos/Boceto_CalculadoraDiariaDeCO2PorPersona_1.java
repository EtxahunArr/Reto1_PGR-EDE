package ejercicios;

import java.util.Scanner;

public class Boceto_CalculadoraDiariaDeCO2PorPersona_1 {

    public static void main(String[] args) {


        int contadorPersonas = 0;
        int opcion;
        int grupo;
        double kmConsumo = 0;
        double horasConsumo = 0;
        double consumoPersonal = 0;
        double consumoGrupal = 0;
        String nombre;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Cuantas personas se registrarán?");
        grupo = teclado.nextInt();

        for (contadorPersonas = 0; contadorPersonas < grupo; contadorPersonas++) {

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
                    kmConsumo = teclado.nextDouble();

                    if (kmConsumo > 0) {
                    	consumoPersonal = kmConsumo * 0.21 + consumoPersonal;
                    } else {
                        System.out.println("Vuelva a ingresar una cantidad valida");
                    }
                    break;

                case 2:
                    System.out.println("2. Ingrese los km en autobus");
                    kmConsumo = teclado.nextDouble();

                    if (kmConsumo > 0) {
                    	consumoPersonal = kmConsumo * 0.10 + consumoPersonal;
                    } else {
                        System.out.println("Vuelva a ingresar una cantidad valida");
                    }
                    break;

                case 3:

                    System.out.println("3. Ingrese los km en bicicleta");
                    kmConsumo = teclado.nextDouble();

                    if (kmConsumo > 0) {
                    	consumoPersonal = kmConsumo * 0 + consumoPersonal;
                    } else {
                        System.out.println("Vuelva a ingresar una cantidad valida");
                    }
                    break;

                case 4:
                    System.out.println("4. Uso de plancha 1=si/0=no");
                    int usoPlancha = teclado.nextInt();

                    if (usoPlancha == 1) {
                        System.out.println("Consumo de horas");
                        horasConsumo = teclado.nextDouble();

                        if (horasConsumo > 0) {
                        	consumoPersonal = horasConsumo * 0.70 + consumoPersonal;
                        } else {
                            System.out.println("Vuelva a ingresar una cantidad valida");
                        }
                    }
                    break;

                case 5:
                    System.out.println("5. Horas de uso del ordenador");
                    horasConsumo = teclado.nextDouble();

                    if (horasConsumo > 0) {
                    	consumoPersonal = horasConsumo * 0.08 + consumoPersonal;
                    } else {
                        System.out.println("Vuelva a ingresar una cantidad valida");
                    }
                    break;

                case 6:
                    System.out.println("6. Consumo de movil");
                    horasConsumo = teclado.nextDouble();

                    if (horasConsumo > 0) {
                    	consumoPersonal = horasConsumo * 0.02 + consumoPersonal;
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

            System.out.println("Consumo personal total es: " + consumoPersonal);
            consumoGrupal = consumoGrupal + consumoPersonal;
        }

        System.out.println("Consumo grupal total es: " + consumoGrupal);

        teclado.close();
    }
}