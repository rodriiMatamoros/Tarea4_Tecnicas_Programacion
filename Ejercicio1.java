/*Este algoritmo calcula la media de valores (por ejemplo, de las notas), introducidos por el usuario.
En primer lugar, el usuario indica el número de valores cuyo promedio desea conocer. Seguidamente, 
introduce todos estos valores. Finalmente, se muestra la media de estos valores.*/

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de valores que desea promediar: ");
        int n = sc.nextInt();
        double sum = 0.0;
        double media;

        for(int i=0; i<n; i++) {
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            double valor = sc.nextDouble();
            sum += valor;
        }

        media = sum/n;
        System.out.println("La media de los valores ingresados es: " + media);
    }
}

