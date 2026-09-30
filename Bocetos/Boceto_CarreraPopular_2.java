package ejercicios;

import java.util.Scanner;

public class Boceto_CarreraPopular_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String dni;
		boolean pareja;
		int numCarreras;
		int seg;
		int contadorSub1H = 0;
		int contadorParticipantes = 0;
		int contadorMas3Carreras = 0;
		boolean continuar;
		int sumaSeg = 0;
		int mediaMin;
		float mediaSeg;
		int mejorTiempoSeg = 999999999;
		int mejorTiempoMin;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca DNI:");
			dni = teclado.nextLine();
			System.out.println("Participa en pareja?(true/false):");
			pareja = Boolean.parseBoolean(teclado.nextLine());
			System.out.println("Cuantas carreras populares ha realizado anteriormente?:");
			numCarreras = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduzca minutos:");
			seg = 60 * Integer.parseInt(teclado.nextLine());
			System.out.println("Introduzca segundos:");
			seg = seg + Integer.parseInt(teclado.nextLine());
			
			if (seg < 3600) {
				System.out.println("Se ha completado en menos de 1H");
				contadorSub1H++;
			}
			
			System.out.println("Desea ingresar otro participante?(true/false):");
			continuar = Boolean.parseBoolean(teclado.nextLine());
			
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