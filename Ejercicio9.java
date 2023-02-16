//Escriba un programa que haga que el usuario escriba un múltiplo de tres y no se detenga hasta que el número sea correcto.

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int intentos = 0;

        while(true) {
            System.out.print("Escriba un múltiplo de 3: ");
            n = sc.nextInt();
            intentos++;
            if(n % 3 == 0) {
                break;
            } else {
                System.out.println("Error " + n + " no es un múltiplo de 3");
            }
        }

        System.out.println("Ok: " + n + " es un múltiplo de 3");
    }
}
