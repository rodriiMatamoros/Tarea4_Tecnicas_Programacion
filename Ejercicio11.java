/* Dibujar una de las siguientes formas, según la elección del usuario:
Ejemplo de ejecución:
¿tamaño?
5
¿Carácter?
#
¿forma?
1 - rectángulo con relleno
2 - rectángulo sin relleno
3 - cruz de San Andrés
4 - triángulo rectángulo
5 - rombo
6 - ajedrezado 
*/

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Tamaño? ");
        int tam = sc.nextInt();

        System.out.print("¿Carácter? ");
        char caracter = sc.next().charAt(0);

        System.out.println("¿Que forma quieres?");
        System.out.println("1 - Rectángulo con relleno");
        System.out.println("2 - Rectángulo sin relleno");
        System.out.println("3 - Cruz de San Andrés");
        System.out.println("4 - Triángulo rectángulo");
        System.out.println("5 - Rombo");
        System.out.println("6 - Ajedrezado");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                for (int i = 1; i <= tam; i++) {
                    for (int j = 1; j <= tam; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= tam; i++) {
                    for (int j = 1; j <= tam; j++) {
                        if (i == 1 || i == tam || j == 1 || j == tam) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 3:
                for (int i = 1; i <= tam; i++) {
                    for (int j = 1; j <= tam; j++) {
                        if (i == j || i + j == tam + 1) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 4:
                // Triángulo rectángulo
                for (int i = 0; i < tam; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(caracter + " ");
                    }
                    System.out.println();
                }
                break;

            case 5:
                // Rombo
                for (int i = 1; i <= tam; i++) {
                    for (int j = 1; j <= tam - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i * 2 - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = tam - 1; i >= 1; i--) {
                    for (int j = 1; j <= tam - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i * 2 - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 6:
                for (int i = 0; i < tam; i++) {
                    for (int j = 0; j < tam; j++) {
                        if ((i+j)%2 == 0) {
                            System.out.print("#");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Opción inválida");
        }

        sc.close();
    }
}