package ejercicios;

import java.util.Scanner;

public class Gimnasio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dias;
		int mins;
		int sumaMins = 0;
		int totalMins = 0;
		int totalDias = 0;
		int mediaMins;
		int maxMins = 0;
		int usuarios = 0;
		int contador1H = 0;
		int contadorUser = 0;
		int contadorDia = 0;
        Scanner teclado = new Scanner(System.in);
        
        
        while(true) {
	        System.out.println("Cantidad de usuarios a registrar:");
	        
	        if (teclado.hasNextInt()) {
	        	usuarios = teclado.nextInt();
	        	
				if (usuarios > 0) {
					break;					
				} else {
					System.out.println("Introduzca un numero positivo");
				}
				
			} else {
				System.out.println("Introduzca un numero");
				teclado.next();
			}
		}
        
        
        while (contadorUser < usuarios) {
        	
        	while(true) {
    	        System.out.println("Dias acudidios en la semana al gimnasio:");
    	        
    	        if (teclado.hasNextInt()) {
    	        	dias = teclado.nextInt();
    	        	
    				if (dias >= 0 && dias <= 7) {
    					break;					
    				} else {
    					System.out.println("Introduzca un numero valido");
    				}
    				
    			} else {
    				System.out.println("Introduzca un numero");
    				teclado.next();
    			}
    		}
        	
        	while (contadorDia < dias) {
        		
        		while(true) {
        	        System.out.println("Minutos acudidios al gimnasio en el dia " + (contadorDia+1) + ":");
        	        
        	        if (teclado.hasNextInt()) {
        	        	mins = teclado.nextInt();
        	        	
        				if (mins > 0) {
        					break;					
        				} else {
        					System.out.println("Introduzca un numero positivo");
        				}
        				
        			} else {
        				System.out.println("Introduzca un numero");
        				teclado.next();
        			}
        		}
        		
        		if (mins > 60) {
        			contador1H++;
        		}
        		
        		sumaMins = sumaMins + mins;
        		contadorDia++;
        	}
        	
        	contadorDia = 0;
        	mediaMins = sumaMins / dias;
        	
        	System.out.println("Total minutos: " + sumaMins);
        	System.out.println("Media minutos por dia: " + mediaMins);
        	System.out.println("Dias con mas de 1H de entrenamiento: " + contador1H);
        	
        	if (sumaMins >= 300) {
        		System.out.println("Objetivo semanal alcanzado");
        	}
        	
        	if (maxMins < sumaMins) {
        		maxMins = sumaMins;
        	}
        	
        	totalDias = totalDias + dias;
        	totalMins = totalMins + sumaMins;
        	sumaMins = 0;
        	contador1H = 0;
        	contadorUser++;
        	
        }

        System.out.println("El maximo tiempo registrado: " + maxMins);
        System.out.println("Numero total de minutos: " + totalMins);
        System.out.println("Numero total de dias entrenados" + totalDias);
        
        teclado.close();
	}
}