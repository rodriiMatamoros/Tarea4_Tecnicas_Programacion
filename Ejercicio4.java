/*Su algoritmo debe generar un número entero aleatorio entre 1 y 100. El usuario tiene que
 encontrar este número. Con cada intento del usuario, se le debe indicar si el número es mayor,
  menor o igual al valor introducido. El programa finaliza cuando el usuario ha encontrado el número.*/

import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = r.nextInt(100) + 1;
        int intentos = 0;
        int valor;

        while(true) {
            System.out.print("¿En qué número entre 1 y 100 estoy pensando? ");
            valor = sc.nextInt();
            intentos++;
            if(valor == n) {
                break;
            } else if(valor < n) {
                System.out.println("Mayor");
            } else {
                System.out.println("Menor");
            }
        }

        System.out.println("Bravo, lo ha encontrado en " + intentos + " intentos");
    }
}
