/*Retomar el algoritmo anterior, modificándolo para que no se muestre siempre la misma cita de 
una película, sino que haya dos o tres y presente aleatoriamente una de ellas.*/

import java.util.Scanner;

public class Ejercicio8 {

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
                    int cita = (int) (Math.random() * 3) + 1;
                    switch (cita) {
                        case 1:
                            System.out.println("Que la fuerza te acompañe.");
                            break;
                        case 2:
                            System.out.println("No soy un Jedi como tú.");
                            break;
                        case 3:
                            System.out.println("¡Yo soy tu padre!");
                            break;
                    }
                    break;
                case 2:
                    int cita2 = (int) (Math.random() * 3) + 1;
                    switch (cita2) {
                        case 1:
                            System.out.println("Oh, sí... El pasado puede doler, pero tal como yo lo veo puedes huir de él o aprender de él.");
                            break;
                        case 2:
                            System.out.println("No te preocupes, todo saldrá bien.");
                            break;
                        case 3:
                            System.out.println("¡Simba, no te vayas!");
                            break;
                    }
                    break;
                case 3:
                    int cita3 = (int) (Math.random() * 3) + 1;
                    switch (cita3) {
                        case 1:
                            System.out.println("No son las habilidades lo que demuestra lo que somos, son nuestras decisiones.1");
                            break;
                        case 2:
                            System.out.println("¡No es verdad! ¡No es verdad! ¡No es verdad!");
                            break;
                        case 3:
                            System.out.println("¡No me digas que no has oído hablar de Harry Potter!");
                            break;
                    }
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