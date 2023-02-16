//El programa debe mostrar un menú con una lista de películas y una opción para salir. Si el usuario elige una de las películas, el programa mostrará una cita de esa película. Luego, el usuario puede elegir otra película o salir. Si el usuario elige salir, el programa mostrará un mensaje antes de salir.

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Star Wars");
            System.out.println("2. El Rey León");
            System.out.println("3. Harry Potter");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Que la fuerza te acompañe.");
                    break;
                case 2:
                    System.out.println("Oh, sí... El pasado puede doler, pero tal como yo lo veo puedes huir de él o aprender de él.");
                    break;
                case 3:
                    System.out.println("No son las habilidades lo que demuestra lo que somos, son nuestras decisiones.1");
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 4);
    }
}

