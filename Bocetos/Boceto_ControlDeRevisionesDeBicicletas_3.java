package ejercicios;

import java.util.Scanner;

public class Boceto_ControlDeRevisionesDeBicicletas_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diaHoy;
		int mesHoy;
		int añoHoy;
		int diaUlt;
		int mesUlt;
		int añoUlt;
		int numBicicleta;
		char continuar;
		int contadorRevision = 0;
		int contadorNoRevision = 0;		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca fecha de hoy (Dia):");
			diaHoy = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduzca fecha de hoy (Mes):");
			mesHoy = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduzca fecha de hoy (Año):");
			añoHoy = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduzca numero de identificacion de la bicicleta:");
			numBicicleta = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduzca fecha de la ultima revision (Dia):");
			diaUlt = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduzca fecha de la ultima revision (Mes):");
			mesUlt = Integer.parseInt(teclado.nextLine());
			System.out.println("Introduzca fecha de la ultima revision (Año):");
			añoUlt = Integer.parseInt(teclado.nextLine());
			
			
			if (añoUlt < añoHoy) {
				if (añoUlt < añoUlt-1 || mesUlt < mesHoy) {
					System.out.println("Esta bicicleta necesita revision");
					contadorRevision++;
				} else if (diaUlt < diaHoy && mesUlt == mesHoy) {
					System.out.println("Esta bicicleta necesita revision");
					contadorRevision++;
				} else {
					System.out.println("Esta bicicleta NO necesita revision");
					contadorNoRevision++;
				}
			} else {
				System.out.println("Esta bicicleta NO necesita revision");
				contadorNoRevision++;
			}
			
			System.out.println("Quiere introducir otra bicicleta? (S/N):");
			continuar = teclado.nextLine().charAt(0);
		} while (continuar == 'S' || continuar == 's');
		
		System.out.println("Bicicletas que necesitan revision: " + contadorRevision);
		System.out.println("Bicicletas que NO necesitan revision: " + contadorNoRevision);
		
		teclado.close();
	}
}