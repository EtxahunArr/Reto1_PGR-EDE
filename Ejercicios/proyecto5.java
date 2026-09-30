package principal;

import java.util.Scanner;
// Permite leer datos del teclado.

public class proyecto5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Creamos el Scanner para leer lo que escriba el usuario.


        int usuarios;

        do {
            System.out.print("¿Cuántos usuarios se van a registrar? ");
            usuarios = sc.nextInt();

            if (usuarios <= 0) {
                System.out.println("Error. Debe ser mayor que 0.");
            }

        } while (usuarios <= 0);
        // Pedimos usuarios y repetimos si pone 0 o menos.


        int totalMinutos = 0;
        // Minutos de TODOS los usuarios.

        int totalDias = 0;
        // Días de TODOS los usuarios.

        int mayorMinutos = 0;
        // Guarda la mayor cantidad de minutos.

        int usuarioMayor = 0;
        // Guarda qué usuario tiene esa cantidad.


        for (int i = 1; i <= usuarios; i++) {
        // Repetimos una vez por cada usuario.


            int dias;

            do {
                System.out.print("¿Cuántos días ha acudido al gimnasio? ");
                dias = sc.nextInt();

                if (dias <= 0 || dias > 7) {
                    System.out.println("Error. Debe estar entre 1 y 7 días.");
                }

            } while (dias <= 0 || dias > 7);
            // El usuario solo puede poner entre 1 y 7 días.


            int minutosUsuario = 0;
            // Guarda los minutos de ESTE usuario.

            int diasMas60 = 0;
            // Cuenta cuántos días ha hecho MÁS de 60 minutos.


            for (int dia = 1; dia <= dias; dia++) {
            // Repetimos por cada día que haya indicado.


                int minutos;

                do {
                    System.out.print("Minutos realizados el día " + dia + ": ");
                    minutos = sc.nextInt();

                    if (minutos < 0) {
                        System.out.println("Error. Los minutos no pueden ser negativos.");
                    }

                } while (minutos < 0);
                // No permite minutos negativos.


                minutosUsuario = minutosUsuario + minutos;
                // Sumamos los minutos de este día
                // a los minutos totales del usuario.


                if (minutos > 60) {
                    diasMas60++;
                }
                // Si ese día hizo más de 60 minutos,
                // aumentamos el contador en 1.

            }


            double media = (double) minutosUsuario / dias;
            // Calculamos la media de minutos por día.


            System.out.println("Total de minutos: " + minutosUsuario);
            // Mostramos los minutos totales del usuario.

            System.out.printf("Media de minutos por día: %.2f%n", media);
            // Mostramos la media con 2 decimales.

            System.out.println("Días con más de 60 minutos: " + diasMas60);
            // Mostramos cuántos días superó los 60 minutos.


            if (minutosUsuario > 300) {
                System.out.println("Ha alcanzado el objetivo semanal.");
            } else {
                System.out.println("No ha alcanzado el objetivo semanal.");
            }
            // Si supera 300 minutos, consigue el objetivo.


            totalMinutos = totalMinutos + minutosUsuario;
            // Añadimos los minutos de este usuario
            // al total de TODOS.

            totalDias = totalDias + dias;
            // Añadimos los días de este usuario
            // al total de TODOS.


            if (minutosUsuario > mayorMinutos) {
                mayorMinutos = minutosUsuario;
                usuarioMayor = i;
            }
            // Comparamos los minutos de este usuario
            // con el récord anterior.
            // Si son mayores, guardamos este usuario.

        }


        System.out.println("Usuario que realizó más minutos: Usuario "
                + usuarioMayor);
        // Mostramos qué usuario hizo más minutos.

        System.out.println("Minutos realizados por ese usuario: "
                + mayorMinutos);
        // Mostramos cuántos minutos hizo.

        System.out.println("Total de minutos entre todos los usuarios: "
                + totalMinutos);
        // Mostramos los minutos de todos juntos.

        System.out.println("Total de días de entrenamiento registrados: "
                + totalDias);
        // Mostramos los días de todos juntos.


        sc.close();
        // Cerramos el Scanner.
    }
}