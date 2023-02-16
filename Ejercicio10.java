/*El arte ASCII consiste en hacer un diseño usando solo caracteres. Una de las formas más primitivas 
de este arte son los emoticonos: los caracteres :-) dibujan una carita sonriente. Escriba un algoritmo 
que muestre un rectángulo realizado en arte ASCII según los deseos del usuario.*/


import java.util.Scanner;

public class Ejercicio10 {

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








