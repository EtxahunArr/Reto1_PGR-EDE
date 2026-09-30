package principal;
import java.util.Scanner;
public class Cine_Diago {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int	contadorClientes=0;
		int contador=0;
		int infantil=0;
		int adulto=0;
		double 	adultocompra=0;
		double infantilcompra=0;
		int numero_entradas=0;
		
		double condescuentoadulto=0.0;
		double	condescuentoinfantil=0.0;
		double TotalRecaudado=0.0;
		
		int	maximoCliente=0;
		String nombre;
		String  clienteMaxi = "";
		double total=0.0;
		int totalinfantil=0;
		int  totaladulto=0;
		double totalsindescuento=0.0;
		
		System.out.println("Cuantos clientes se van a registrar:");
		contadorClientes=teclado.nextInt();
		
		while(contador<contadorClientes) {
			double preciocliente=0;
			System.out.println("Nombre:");
			teclado.nextLine();
			nombre=teclado.nextLine();
			System.out.println("Número de entradas adulto:");
			adulto=teclado.nextInt();
			totaladulto= totaladulto+adulto;
			adultocompra=adulto*9;
			System.out.println("Número de entradas infantiles:");
			infantil=teclado.nextInt();
			totalinfantil=totalinfantil+infantil;
			infantilcompra=infantil*6;
			numero_entradas=adulto+infantil;
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
		
		System.out.println("Número total de entradas adulto: " + totaladulto);
		System.out.println("Número total de entradas infantil: "+ totalinfantil);
		System.out.println("Dinero total recaudado: " + total);
		System.out.println("El cliente que compró más entradas: " + clienteMaxi);
		
		teclado.close();
	}

}

