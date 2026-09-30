package ejercicios;

import java.util.Scanner;

public class Videojuego_6 {

    public static void main(String[] args) {

        int usuarios = 0;
        int contadorUser = 0;
        int nPartidas = 0;
        int contadorPartidas = 0;
        int contadorBonus = 0;
        int puntosObtenidos = 0;
        int enemigosDerrotados = 0;
        double totalPuntosUser = 0;
        int totalEnemigosUser = 0;
        double puntuacionMediaUser = 0.0;
        double totalPuntos = 0.0;
        int totalEnemigos = 0;
        double mayorPuntuacion = 0;
        int jugadorMayor = 0;
        Scanner teclado = new Scanner(System.in);

        while(true) {
	        System.out.println("Cuantos usuarios se van a registrar?");
	        
	        if (teclado.hasNextInt()) {
	        	usuarios = teclado.nextInt();
	        	
				if (usuarios > 0) {
					break;					
				} else {
					System.out.println("Introduzca un numero positivo");
				}
				
			} else {
				System.out.println("Introduzca un numero entero");
				teclado.next();
			}
		}

        while(contadorUser < usuarios) {

        	totalPuntosUser = 0;
            totalEnemigosUser = 0;
            contadorPartidas = 0;
        	
        	while(true) {
    	        System.out.println("Introduzca el numero de partidas jugadas");
    	        
    	        if (teclado.hasNextInt()) {
    	        	nPartidas = teclado.nextInt();
    	        	
    				if (nPartidas > 0) {
    					break;					
    				} else {
    					System.out.println("Introduzca un numero positivo");
    				}
    				
    			} else {
    				System.out.println("Introduzca un numero entero");
    				teclado.next();
    			}
        	}

	            while(contadorPartidas < nPartidas) {
	
	            	while(true) {
	        	        System.out.println("Introduzca cantidad de puntos obtenidos en la partida " + (contadorPartidas+1) + ":");
	        	        
	        	        if (teclado.hasNextInt()) {
	        	        	puntosObtenidos = teclado.nextInt();
	        	        	
	        				if (puntosObtenidos >= 0) {
	        					break;					
	        				} else {
	        					System.out.println("Introduzca un numero positivo");
	        				}
	        				
	        			} else {
	        				System.out.println("Introduzca un numero entero");
	        				teclado.next();
	        			}
	            	}
	            	
	            	while(true) {
	        	        System.out.println("Introduzca el numero de enemigos derrotados en la partida " + (contadorPartidas+1) + ":");
	        	        
	        	        if (teclado.hasNextInt()) {
	        	        	enemigosDerrotados = teclado.nextInt();
	        	        	
	        				if (enemigosDerrotados >= 0) {
	        					break;					
	        				} else {
	        					System.out.println("Introduzca un numero positivo");
	        				}
	        				
	        			} else {
	        				System.out.println("Introduzca un numero entero");
	        				teclado.next();
	        			}
	            	}
	
	                if(puntosObtenidos >= 1000) {
	                	puntosObtenidos = puntosObtenidos + 100;
	                	contadorBonus++;
	                }
	
	                totalEnemigosUser = totalEnemigosUser + enemigosDerrotados;
	                totalPuntosUser = totalPuntosUser + puntosObtenidos;
	                contadorPartidas++;
	            }
            
	        puntuacionMediaUser = (double) totalPuntosUser / nPartidas;
            
            System.out.println("Puntuacion total: " + (totalPuntosUser - contadorBonus * 100));
            System.out.println("BONUS +" + (contadorBonus * 100));
            System.out.println("Enemigos derrotados: " + totalEnemigosUser);
            System.out.println("Puntuacion media por partida: " + puntuacionMediaUser);
            
            totalPuntos = totalPuntos + totalPuntosUser;

            totalEnemigos = totalEnemigos + totalEnemigosUser;

            if(totalPuntosUser > mayorPuntuacion) {
                mayorPuntuacion = totalPuntosUser;
                jugadorMayor = contadorUser + 1;
            }

            contadorUser++;
        }

        System.out.println("Puntuacion total de todos los jugadores: " + totalPuntos);
        System.out.println("Numero total de enemigos derrotados: " + totalEnemigos);
        System.out.println("La mejor puntuacion es del Jugador" + jugadorMayor + " con un total de  " + mayorPuntuacion + " PUNTOS!");
        
        teclado.close();
    }
}