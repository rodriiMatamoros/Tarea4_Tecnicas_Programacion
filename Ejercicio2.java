/*El objetivo sigue siendo realizar el cálculo de la media de un conjunto de valores introducidos
 por el usuario, pero el usuario ya no tiene que indicar inicialmente el número de valores. 
 Introduce los valores y cuando ha terminado, introduce un valor concreto (-1), para 
 indicar que ha terminado de introducir valores.*/

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double media;
        int n = 0;

        while(true) {
            System.out.print("Ingrese el valor " + (n+1) + ": ");
            double valor = sc.nextDouble();
            if(valor == -1) {
                break;
            }
            sum += valor;
            n++;
        }

        media = sum/n;
        System.out.println("La media de los valores ingresados es: " + media);
    }
}
