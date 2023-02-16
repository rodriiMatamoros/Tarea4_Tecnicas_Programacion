/*Esta vez, el ordenador debe adivinar un número elegido por el usuario. El usuario le indica 
si el número es mayor (+), menor (-) o si lo ha encontrado (=).*/

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n;
        int min = 1;
        int max = 100;
        int valor;
        int intentos = 0;

        System.out.print("Elija un número del 1 al 100, luego presione cualquier tecla.");
        sc.nextLine();

        while(true) {
            n = r.nextInt(max - min + 1) + min;
            System.out.println("Pruebo con " + n + ", ¿es mayor, menor o es el número (+/-/=)?");
            valor = sc.nextLine().charAt(0);
            intentos++;
            if(valor == '=') {
                break;
            } else if(valor == '+') {
                min = n + 1;
            } else {
                max = n - 1;
            }
        }

    
        System.out.println("Fenomenal, lo he encontrado después de " + intentos + " intentos.");
    }
}