package principal;
import java.util.Scanner;
public class Cine_Mejorado {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int	contadorClientes=0;
		int contador=0;
		int infantil=0;
		int adulto=0;
		double 	adultocompra=0;
		double infantilcompra=0;
		
		boolean salir=true;
			
		int	maximoCliente=0;
		String nombre = "";
		String  clienteMaxi = "";
		double total=0.0;
		int totalinfantil=0;
		int  totaladulto=0;
		
	while(salir==true) {
		System.out.println("Cuantos clientes se van a registrar:");
		if(teclado.hasNextInt()) {
			contadorClientes=teclado.nextInt();
			if (contadorClientes>0) {
				teclado.nextLine(); 
				break;
			} else {
				System.out.println("Debe ser un número mayor a 0.");
				 }
								 
		} else {
			System.out.println("Introduzca un número entero.");
			teclado.next();
			 }
					   }
		while(contador<contadorClientes) {
			// Algunas variables que quiero que se reinicien en cada vuelta.
			double totalsindescuento=0.0;
			int numero_entradas=0;
			double condescuentoadulto=0.0;
			double	condescuentoinfantil=0.0;
			double TotalRecaudado=0.0;
			double preciocliente=0;
			
			while (salir==true) {
				System.out.println("Nombre:");
					if (teclado.hasNextInt()){ 
					System.out.println("Introduzca su nombre por favor.");
					teclado.nextLine();
					 
				
				if (teclado.hasNextLine()) {
						nombre=teclado.nextLine(); 
						break; }
									
								}	
			}
			while(salir==true) {
				System.out.println("Número de entradas adulto:");
					if (teclado.hasNextInt()) {
						adulto=teclado.nextInt();
						 
					if (adulto>=0) {
						totaladulto= totaladulto+adulto;
					adultocompra=adulto*9;
					break; }
					else {
						System.out.println("Los valores negativos no son válidos.");
					}
					} else {
						System.out.println("Introduce un número entero.");
						teclado.next();
						 }
							   }
			while (salir==true) {				 
				System.out.println("Número de entradas infantiles:");
					if (teclado.hasNextInt()) {
						infantil=teclado.nextInt();
						
					if (infantil>=0) {
						totalinfantil=totalinfantil+infantil;
						infantilcompra=infantil*6;
						numero_entradas=adulto+infantil;
						teclado.nextLine();
						break;		     	  }
					else {
						System.out.println("Los valores negativos no son válidos.");
					}
					} else {
						System.out.println("Introduce un número entero.");
						teclado.next();
						 }
								 }
			if( numero_entradas >5) {
				
				condescuentoadulto=adultocompra*0.90;
				condescuentoinfantil=infantilcompra*0.90;
				TotalRecaudado=TotalRecaudado+condescuentoadulto+condescuentoinfantil;
				totalsindescuento=adultocompra+infantilcompra;
				
				System.out.println("Número de entradas de adulto: " + adulto);
				System.out.println("Número de entradas infantiles: " + infantil);
				System.out.println("Número total de entradas: " + numero_entradas);
				System.out.println("Precio a pagar: " + TotalRecaudado);
				
				preciocliente=TotalRecaudado;
				
			}	else {
				
				totalsindescuento=	totalsindescuento+adultocompra+infantilcompra;
				
				System.out.println("Número de entradas de adulto: " + adulto);
				System.out.println("Número de entradas infantiles: " + infantil);
				System.out.println("Número total de entradas: " + numero_entradas);
				System.out.println("Precio a pagar: " + totalsindescuento);
				
				preciocliente=totalsindescuento;
			}

			if(numero_entradas>maximoCliente) {
				maximoCliente = numero_entradas;
				clienteMaxi=nombre;
			}
			total= total+preciocliente;
			contador++;
		
		}
		System.out.println("--> EN TOTAL");
		System.out.println("Número total de entradas adulto: " + totaladulto);
		System.out.println("Número total de entradas infantil: "+ totalinfantil);
		System.out.println("Dinero total recaudado: " + total);
		System.out.println("El cliente que compró más entradas: " + clienteMaxi);
		
		teclado.close();
	}

}
