package principal;

import java.util.Scanner;

public class Calculadora_de_CO2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double coche=0; double c_coche=0;
	double autobus=0; double c_autobus=0;
	double bicicleta=0; double c_bicicleta=0;
	double plancha=0; double c_plancha=0; 
	double ordenador=0; double c_ordenador=0;
	double movil=0; double c_movil=0;
	int opcion=0; 
	int respuesta=0;
	double suma=0;
	double suma_g=0;
	int contador=1;

	
	Scanner cs=new Scanner(System.in);
	System.out.println("Introduce cuántas personas se van a registrar:");
	int personas=Integer.parseInt(cs.nextLine());
	
	while (contador<=personas) {
	do {
		System.out.println("MENU DE ACTIVIDADES");
		
		System.out.println("1.- Transporte en coche");
		System.out.println("2.- Transporte en autobús");
		System.out.println("3.- Transporte en bicicleta");
		System.out.println("4.- Uso de plancha");
		System.out.println("5.- Uso del ordenador");
		System.out.println("6.- Uso del móvil");
		System.out.println("7.- Salir");
		opcion=cs.nextInt();
		
		switch (opcion) {
			
		case 1:
			System.out.println("¿Cuántos km recorrió?");
			coche=cs.nextDouble();
			if (coche>0) {
			c_coche=coche*0.21; }
			else { System.out.println("Valor no válido, vuelva a introducirlo."); }
			break; 
			
		case 2:
			System.out.println("¿Cuántos km recorrió?");
			autobus=cs.nextDouble();
			if (autobus>0) {
			c_autobus=autobus*0.1; }
			else { System.out.println("Valor no válido, vuelva a introducirlo."); }
			break;
			
		case 3:
			System.out.println("¿Cuántos km recorrió?");
			bicicleta=cs.nextDouble();
			if (bicicleta>0) {
			c_bicicleta=bicicleta*0; }
			else { System.out.println("Valor no válido, vuelva a introducirlo."); }
			break;
			
		case 4: 
			System.out.println("¿Utilizó la plancha? (1=sí / 0=no)");
			respuesta=cs.nextInt();
			if (respuesta==1) {
				System.out.println("¿Cuántas horas la utilizó?");
				plancha=cs.nextDouble(); 
				if (plancha>0) {
				c_plancha=plancha*0.7; }
				else { System.out.println("Valor no válido, vuelva a introducirlo."); }
				break;
				}
			if (respuesta==0) 
				break; 				
								
		case 5:
			System.out.println("¿Cuántas horas lo utilizó?");
			ordenador=cs.nextDouble();
			if (ordenador>0) {
			c_ordenador=ordenador*0.08; }
			else { System.out.println("Valor no válido, vuelva a introducirlo."); }
			break;
			
		case 6: 
			System.out.println("¿Cuántas horas lo utilizó?");
			movil=cs.nextDouble();
			if (movil>0) {
			c_movil=movil*0.02; }
			else { System.out.println("Valor no válido, vuelva a introducirlo."); }
			break;
		case 7:
			break;
			default:
				break;
		
						}	
	}
	
	while (opcion!=7); {
	suma=c_coche+c_autobus+c_bicicleta+c_plancha+c_ordenador+c_movil;
		System.out.println("El consumo de CO2 de esta persona es de " + suma + " kg de CO2");
		contador++; suma_g=suma_g+suma;
	}
		}
	
	if (contador>=personas) {
		System.out.println("El consumo del grupo es de " + suma_g + " kg de CO2");
						   }
	
	
cs.close();
}
}
