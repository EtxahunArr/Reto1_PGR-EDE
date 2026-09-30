package retocClase;
// Paquete donde está el programa.

import java.util.Scanner;
// Permite leer datos del teclado.

public class proyecto4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creamos el Scanner.


        // NÚMERO DE CLIENTES

        int clientes;

        do {
            System.out.print("¿Cuántos clientes se van a registrar? ");
            clientes = sc.nextInt();

            if (clientes <= 0) {
                System.out.println("Error. Debe ser un número mayor que 0.");
            }

        } while (clientes <= 0);
        // Repetimos hasta que introduzca un número válido.


        // VARIABLES GENERALES

        double dineroTotal = 0;
        // Dinero conseguido entre TODOS los clientes.

        int totalAdultos = 0;
        // Total de entradas de adulto.

        int totalInfantiles = 0;
        // Total de entradas infantiles.

        int maxEntradas = 0;
        // Mayor número de entradas comprado por un cliente.

        int clienteMasEntradas = 0;
        // Número del cliente que compró más entradas.


        // REGISTRAMOS LOS CLIENTES

        for (int i = 1; i <= clientes; i++) {
        // Repetimos una vez por cada cliente.


            // ENTRADAS DE ADULTO

            int adultos;

            do {
                System.out.print("Número de entradas de adulto: ");
                adultos = sc.nextInt();

                if (adultos < 0) {
                    System.out.println("Error. No puede ser negativo.");
                }

            } while (adultos < 0);
            // No permitimos números negativos.


            // ENTRADAS INFANTILES

            int infantiles;

            do {
                System.out.print("Número de entradas infantiles: ");
                infantiles = sc.nextInt();

                if (infantiles < 0) {
                    System.out.println("Error. No puede ser negativo.");
                }

            } while (infantiles < 0);


            // TOTAL DE ENTRADAS

            int totalEntradas = adultos + infantiles;
            // Sumamos las entradas de adulto y las infantiles.


            // PRECIO

            double precio = adultos * 9 + infantiles * 6;
            // Adulto cuesta 9 €.
            // Infantil cuesta 6 €.


            // DESCUENTO

            if (totalEntradas >= 5) {
                precio = precio * 0.90;
                // Si compra 5 o más entradas,
                // paga el 90% del precio.
                // Es decir, tiene un 10% de descuento.

                System.out.println("Se aplica un descuento del 10%.");
            }


            // MOSTRAMOS LOS DATOS

            System.out.println("Entradas de adulto: " + adultos);
            System.out.println("Entradas infantiles: " + infantiles);
            System.out.println("Total de entradas: " + totalEntradas);

            System.out.printf("Precio a pagar: %.2f euros%n", precio);
            // %.2f muestra el precio con 2 decimales.


            // SUMAMOS LOS DATOS GENERALES

            dineroTotal =dineroTotal+precio;
            // Añadimos lo que ha pagado este cliente
            // al dinero total.

            totalAdultos =totalAdultos+adultos;
            // Añadimos sus entradas de adulto al total.

            totalInfantiles=totalInfantiles+infantiles;
            // Añadimos sus entradas infantiles al total.


            // BUSCAMOS AL CLIENTE CON MÁS ENTRADAS

            if (totalEntradas > maxEntradas) {

                maxEntradas = totalEntradas;
                // Guardamos el nuevo máximo.

                clienteMasEntradas = i;
                // Guardamos qué cliente tiene ese máximo.
            }

        }


        // RESULTADOS FINALES

        System.out.printf("Dinero total recaudado: %.2f euros%n",
                dineroTotal);
        // Dinero de TODOS los clientes.

        System.out.println("Número total de entradas de adulto: "
                + totalAdultos);
        // Todas las entradas de adulto.

        System.out.println("Número total de entradas infantiles: "
                + totalInfantiles);
        // Todas las entradas infantiles.

        System.out.println("El cliente que compró más entradas fue el cliente "
                + clienteMasEntradas
                + " con "
                + maxEntradas
                + " entradas.");
        // Mostramos el cliente que compró más entradas.


        sc.close();
        // Cerramos el Scanner.
    }
}