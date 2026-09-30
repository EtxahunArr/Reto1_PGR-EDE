package ejercicios;

import java.util.Scanner;

public class CarreraPopular_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String dni;
		boolean pareja;
		int numCarreras;
		int seg;
		int segMin;
		int contadorSub1H = 0;
		int contadorParticipantes = 0;
		int contadorMas3Carreras = 0;
		boolean continuar = false;
		int sumaSeg = 0;
		int mediaMin;
		float mediaSeg;
		int mejorTiempoSeg = 2147483647;
		int mejorTiempoMin;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca DNI:");
			
			while (true) {
				dni = teclado.nextLine();
				if (dni.matches("\\d{8}[A-Za-z]")) {
					break;
				} else {
					System.out.println("Introduzca un DNI valido:");
				}
			}
			
			while (true) {
				System.out.println("Participa en pareja?(true/false):");
				if (teclado.hasNextBoolean()) {
					pareja = teclado.nextBoolean();
					break;
				} else {
					System.out.println("Error, introduzca true o false.");
					teclado.next();
				}
			}
				
			while (true) {
				System.out.println("Cuantas carreras populares ha realizado anteriormente?:");
			    if (teclado.hasNextInt()) {
			        numCarreras = teclado.nextInt();

			        if (numCarreras >= 0) {
			            break;
			        } else {
			            System.out.println("El numero no puede ser negativo.");
			        }
			        
			    } else {
			        System.out.println("Eso no es un numero.");
			        teclado.next();
			    }
			}
			
			System.out.println("Introduzca minutos:");
			
			while (true) {
			    if (teclado.hasNextInt()) {
			    	segMin = 60 *  teclado.nextInt();
			    	
			        if (segMin >= 0) {
			            break;
			        }
			        
			    } else {
			        teclado.next();
			    }
			    System.out.println("Introduzca un numero de minutos valido:");
			}
			
			System.out.println("Introduzca segundos:");
			
			while (true) {
			    if (teclado.hasNextInt()) {
			    	seg = teclado.nextInt();
			    	
			        if (seg > 0) {
			        	seg = seg + segMin;
			            break;
			        }
			        
			    } else {
			        teclado.next();
			    }
			    System.out.println("Introduzca un numero de segundos valido:");
			}
			
			if (seg < 3600) {
				System.out.println("Se ha completado en menos de 1H");
				contadorSub1H++;
			}
			
			while (true) {
				System.out.println("Desea ingresar otro participante?(true/false):");
				if (teclado.hasNextBoolean()) {
					continuar = teclado.nextBoolean();
					teclado.nextLine();
					break;
				} else {
					System.out.println("Error, introduzca true o false.");
					teclado.next();
				}
			}
			
			contadorParticipantes++;
			sumaSeg = sumaSeg + seg;
			
			if (numCarreras > 3) {
				contadorMas3Carreras++;
			}
			if (seg < mejorTiempoSeg) {
				mejorTiempoSeg = seg;
			}
		} while(continuar == true);
		
		mediaSeg = sumaSeg / contadorParticipantes;
		mediaMin = (int) (mediaSeg / 60);
		mediaSeg = mediaSeg % 60;
		mejorTiempoMin = mejorTiempoSeg / 60;
		mejorTiempoSeg = mejorTiempoSeg % 60;
		
		System.out.println("Participantes registrados: " + contadorParticipantes);
		System.out.println("Cantidad de carreras sub 60min: " + contadorSub1H);
		System.out.println("Participantes que han participado en mas de 3 carreras: " + contadorMas3Carreras);
		System.out.println("Media de tiempo de las carreras: " + mediaMin + "min " + mediaSeg + "s");
		System.out.println("Mejor tiempo: " + mejorTiempoMin + "min " + mejorTiempoSeg + "s");
		
		teclado.close();
	}
}