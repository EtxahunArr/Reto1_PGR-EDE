package ejercicios;

import java.util.Scanner;

public class CalculadoraDiariaDeCO2PorPersona_1 {

    public static void main(String[] args) {


        int contadorPersonas = 0;
        int opcion;
        int grupo;
        int usoPlancha;
        double kmConsumo = 0;
        double horasConsumo = 0;
        double consumoPersonal = 0;
        double consumoGrupal = 0;
        String nombre;
        Scanner teclado = new Scanner(System.in);

        while (true) {
        	System.out.println("Cuantas personas se registrarán?");
        	if (teclado.hasNextInt()) {
				grupo = teclado.nextInt();
				break;
			} else {
				System.out.println("Introduzca un numero");
				teclado.next();
			}
		}

        for (contadorPersonas = 0; contadorPersonas < grupo; contadorPersonas++) {

        	do {
	            System.out.println("Ingrese el nombre de la persona:");
	            nombre = teclado.next();
	            
	            if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
	            	System.out.println("Introduce solo letras");
	            }
	            
        	} while (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+"));
        	
        	consumoPersonal = 0;
            
        	do {
        		while (true) {
        			System.out.println("Menu:");
                    System.out.println("1. Consumo coche");
                    System.out.println("2. Consumo autobus");
                    System.out.println("3. Consumo bicicleta");
                    System.out.println("4. Consumo plancha");
                    System.out.println("5. Consumo ordenador");
                    System.out.println("6. Consumo movil");
                    System.out.println("7. Salir");
                    
                	if (teclado.hasNextInt()) {
        				opcion = teclado.nextInt();
        				break;
        			} else {
        				System.out.println("Introduzca un numero");
        				teclado.next();
        			}
        		}

                switch (opcion) {

                case 1:
                    System.out.println("Ingrese los km en coche:");

                    while(true) {
                    	
	                    if (teclado.hasNextInt()) {
	                    	kmConsumo = teclado.nextDouble();
	                    	
	                    	if (kmConsumo > 0) {
	                    		consumoPersonal = kmConsumo * 0.21 + consumoPersonal;
	                    		break;
	                    	} else {
	                    		System.out.println("Ingrese una cantidad valida");
	                    	}
	                    	
	                    } else {
	                        System.out.println("Ingrese un numero");
	                        teclado.next();
	                    }
                	}
                    break;

                case 2:
                	System.out.println("Ingrese los km en autobus:");

                    while(true) {
                    	
	                    if (teclado.hasNextInt()) {
	                    	kmConsumo = teclado.nextDouble();
	                    	
	                    	if (kmConsumo > 0) {
	                    		consumoPersonal = kmConsumo * 0.1 + consumoPersonal;
	                    		break;
	                    	} else {
	                    		System.out.println("Ingrese una cantidad valida");
	                    	}
	                    	
	                    } else {
	                        System.out.println("Ingrese un numero");
	                        teclado.next();
	                    }
                	}
                    break;

                case 3:
                	System.out.println("Ingrese los km en bicicleta:");

                    while(true) {
                    	
	                    if (teclado.hasNextInt()) {
	                    	kmConsumo = teclado.nextDouble();
	                    	
	                    	if (kmConsumo > 0) {
	                    		consumoPersonal = kmConsumo * 0 + consumoPersonal;
	                    		break;
	                    	} else {
	                    		System.out.println("Ingrese una cantidad valida");
	                    	}
	                    	
	                    } else {
	                        System.out.println("Ingrese un numero");
	                        teclado.next();
	                    }
                	}
                    break;

                case 4:
                	System.out.println("Usa la plancha? 1=SI/0=NO");

                    while(true) {
                    	
	                    if (teclado.hasNextInt()) {
	                    	usoPlancha = teclado.nextInt();
	                    	
	                    	if (usoPlancha == 1) {
	                    		System.out.println("Introduzca horas de uso:");
	                    		while(true) {
	                    			
	                    			if (teclado.hasNextInt()) {
	        	                    	horasConsumo = teclado.nextDouble();
	        	                    	
	        	                    	if (horasConsumo > 0) {
	        	                    		consumoPersonal = horasConsumo * 0.7 + consumoPersonal;
	        	                    		break;
	        	                    	} else {
	        	                    		System.out.println("Ingrese una cantidad valida");
	        	                    	}
	        	                    	
	        	                    } else {
	        	                        System.out.println("Ingrese un numero");
	        	                        teclado.next();
	        	                    }
	                    			
	                    		}
	                    		break;
	                    	} else if (usoPlancha == 0) {
	                    		break;
	                    	} else {
	                    		System.out.println("Ingrese 1=SI o 0=NO");
	                    	}
	                    	
	                    } else {
	                        System.out.println("Ingrese 1=SI o 0=NO");
	                        teclado.next();
	                    }
                	}
                    break;

                case 5:
                	System.out.println("Ingrese las horas de ordenador:");

                    while(true) {
                    	
	                    if (teclado.hasNextInt()) {
	                    	horasConsumo = teclado.nextDouble();
	                    	
	                    	if (horasConsumo > 0) {
	                    		consumoPersonal = horasConsumo * 0.08 + consumoPersonal;
	                    		break;
	                    	} else {
	                    		System.out.println("Ingrese una cantidad valida");
	                    	}
	                    	
	                    } else {
	                        System.out.println("Ingrese un numero");
	                        teclado.next();
	                    }
                	}
                    break;

                case 6:
                	System.out.println("Ingrese las horas de movil:");

                    while(true) {
                    	
	                    if (teclado.hasNextInt()) {
	                    	horasConsumo = teclado.nextDouble();
	                    	
	                    	if (horasConsumo > 0) {
	                    		consumoPersonal = horasConsumo * 0.02 + consumoPersonal;
	                    		break;
	                    	} else {
	                    		System.out.println("Ingrese una cantidad valida");
	                    	}
	                    	
	                    } else {
	                        System.out.println("Ingrese un numero");
	                        teclado.next();
	                    }
                	}
                    break;

                case 7:
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