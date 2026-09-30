package principal;

import java.util.Scanner;

public class Reto1_4_Cine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	String nombre; 
	double numero_max=0;
	String nombre_max = "";
	
	int opcion=0; 
	double suma=0;
	double suma_g=0;
	int contador=1;
	double total_adulto=0;
	double total_infantil=0;
	double total_cliente=0;
	
	Scanner cs=new Scanner(System.in);
	System.out.println("Introduce cuántos clientes se van a registrar:");
	int clientes=Integer.parseInt(cs.nextLine());
	
	while (contador<=clientes) {
		double adulto=0;  
		double infantil=0;
		double dinero_adulto=0;
		double dinero_infantil=0;
		
		System.out.println("Introduzca su nombre: ");
		cs.nextLine();
		nombre=cs.nextLine();
	do {
		
		
		System.out.println("-CARTELERA-");
		
		System.out.println("-->Escoga sus entradas.");
		
		System.out.println("1.- Adulto");
		System.out.println("2.- Infantil");
		System.out.println("3.- Salir");
		opcion=cs.nextInt();
		
		switch (opcion) {
			
		case 1:
			System.out.println("¿Cuántas entradas quiere comprar?");
			adulto=cs.nextDouble();
			dinero_adulto=adulto*9;
			break; 
			
		case 2:
			System.out.println("¿Cuántas entradas quiere comprar?");
			infantil=cs.nextDouble();
			dinero_infantil=infantil*6;
			break;
			
		case 3:
			break;
			
			default:
				System.out.println("Por favor, introduzca un valor válido.");
				break;
		
						}	
	}
	
	while (opcion!=3); 
		suma = dinero_adulto+dinero_infantil;
		total_cliente=adulto+infantil;
		System.out.println(nombre);
		
	System.out.println("Número de entradas de adulto: " + adulto);
	System.out.println("Número de entradas de infantil: " + infantil);
	System.out.println("Número de total de entradas: " + total_cliente);
	System.out.println("Precio a pagar: " + suma);
	
	total_adulto = total_adulto + adulto;
	total_infantil = total_infantil + infantil;
		
	
	contador++; 
	suma_g = suma_g+suma;
	if (total_cliente>numero_max) {
		numero_max=total_cliente;
		nombre_max=nombre;
		
								  }
	 				   }
		
	
	if (contador>=clientes) {
		System.out.println("El dinero total recaudado es " + suma_g);
		System.out.println("El número total de entradas de adulto es " + total_adulto);
		System.out.println("El número total de entradas infantiles es " + total_infantil);
		System.out.println("El cliente que ha comprado más entradas ha sido " + nombre_max);
		
						   }
	
	
cs.close();
}
}
