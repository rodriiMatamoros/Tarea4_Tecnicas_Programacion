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
6 - ajedrezado*/

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anchura;
        int altura;
        char caracter;
        int i;
        int j;

        System.out.print("¿Anchura? ");
        anchura = sc.nextInt();
        System.out.print("¿Altura? ");
        altura = sc.nextInt();
        System.out.print("¿Carácter? ");
        caracter = sc.next().charAt(0);

        for(i = 0; i < altura; i++) {
            for(j = 0; j < anchura; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
