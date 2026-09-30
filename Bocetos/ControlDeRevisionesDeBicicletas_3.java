package principal;

import java.util.Scanner;

public class ControlDeRevisionesDeBicicletas_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diaHoy = 0;
		int mesHoy;
		int añoHoy;
		int diaUlt = 0;
		int mesUlt;
		int añoUlt;
		int numBicicleta;
		boolean diaValido = false;
		String entrada;
		char continuar;
		int contadorRevision = 0;
		int contadorNoRevision = 0;		
		Scanner teclado = new Scanner(System.in);
		
		do {
			while (true) {
				System.out.println("Introduzca fecha de hoy (Año):");
				if (teclado.hasNextInt()) {
					añoHoy = teclado.nextInt();
					
					if (añoHoy >= 2026) {
						break;
					} else {
						System.out.println("Introduzca un año valido");
					}
		
				} else {
					System.out.println("Introduzca un año valido");
					teclado.next();
				}
			}
			
			while (true) {
				System.out.println("Introduzca fecha de hoy (Mes):");
				if (teclado.hasNextInt()) {
					mesHoy = teclado.nextInt();
					
					if (mesHoy <= 12 && mesHoy >= 1) {
						break;
					} else {
						System.out.println("Introduzca un año valido");
					}
		
				} else {
					System.out.println("Introduzca un mes valido");
					teclado.next();
				}
			}
			
			while (!diaValido) {
				System.out.println("Introduzca fecha de hoy (Dia):");
				if (teclado.hasNextInt()) {
					diaHoy = teclado.nextInt();
					
					switch (mesHoy) {
					case 1, 3, 5, 7, 8, 10, 12:
						if (diaHoy >= 1 && diaHoy <= 31) {
							diaValido = true;
							break;
						}
					case 4, 6, 9, 11:
						if (diaHoy >= 1 && diaHoy <= 30) {
							diaValido = true;
							break;
						}
					case 2:
						if (diaHoy >= 1 && diaHoy <= 28) {
							diaValido = true;
							break;
						} else if (añoHoy % 4 == 0 && diaHoy == 29) {
							diaValido = true;
							break;
						}
					default:
						break;
					}
					
					if (!diaValido) {
			            System.out.println("Introduzca un dia valido");
			        }
		
				} else {
					System.out.println("Introduzca un dia valido");
					teclado.next();
				}
			}
			
			while (true) {
				System.out.println("Introduzca numero de identificacion de la bicicleta:");
				if (teclado.hasNextInt()) {
					numBicicleta = teclado.nextInt();
					break;
				} else {
					System.out.println("Introduzca un numero valido");
					teclado.next();
				}
			}
			
			while (true) {
				System.out.println("Introduzca fecha de la ultima revision (Año):");
				if (teclado.hasNextInt()) {
					añoUlt = teclado.nextInt();
					
					if (añoUlt <= añoHoy && añoUlt >= 1950) {
						break;
					} else {
						System.out.println("Introduzca un año valido");
					}
		
				} else {
					System.out.println("Introduzca un año valido");
					teclado.next();
				}
			}
			
			while (true) {
				System.out.println("Introduzca fecha de la ultima revision (Mes):");
				if (teclado.hasNextInt()) {
					mesUlt = teclado.nextInt();
					
					if (mesUlt <= 12 && mesUlt >= 1) {
						if (añoHoy == añoUlt && mesHoy >= mesUlt) {
							break;
						} else if (añoHoy == añoUlt) {
							System.out.println("Introduzca un mes valido");
						} else {
							break;
						}
					} else {
						System.out.println("Introduzca un mes valido");
					}
		
				} else {
					System.out.println("Introduzca un mes valido");
					teclado.next();
				}
			}
			
			diaValido = false;
			
			while (!diaValido) {
				System.out.println("Introduzca fecha de hoy (Dia):");
				if (teclado.hasNextInt()) {
					diaUlt = teclado.nextInt();
					
					switch (mesUlt) {
					case 1, 3, 5, 7, 8, 10, 12:
						if (diaUlt >= 1 && diaUlt <= 31) {
							diaValido = true;
							break;
						}
					case 4, 6, 9, 11:
						if (diaUlt >= 1 && diaUlt <= 30) {
							diaValido = true;
							break;
						}
					case 2:
						if (diaUlt >= 1 && diaUlt <= 28) {
							diaValido = true;
							break;
						} else if (añoUlt % 4 == 0 && diaUlt == 29) {
							diaValido = true;
							break;
						}
					default:
						break;
					}
					
					if (añoHoy == añoUlt && mesHoy == mesUlt && diaHoy < diaUlt) {
			        	diaValido = false;
			        } if (!diaValido) {
			            System.out.println("Introduzca un dia valido");
			        }
		
				} else {
					System.out.println("Introduzca un dia valido");
					teclado.next();
				}
			}
			
//------------------------------------------------------------------------------------------------------//
			
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
			
			teclado.nextLine();
			
			while (true) {
			    System.out.println("Quiere introducir otra bicicleta? (S/N):");
			    entrada = teclado.nextLine();

			    if (entrada.length() == 1 && 
			        (entrada.charAt(0) == 'S' || entrada.charAt(0) == 'N' ||
			         entrada.charAt(0) == 's' || entrada.charAt(0) == 'n')) {

			        continuar = entrada.charAt(0);
			        break;

			    } else {
			        System.out.println("Error, introduzca S o N.");
			    }
			}
		
		} while (continuar == 'S' || continuar == 's');
		
		System.out.println("Bicicletas que necesitan revision: " + contadorRevision);
		System.out.println("Bicicletas que NO necesitan revision: " + contadorNoRevision);
		
		teclado.close();
	}
}