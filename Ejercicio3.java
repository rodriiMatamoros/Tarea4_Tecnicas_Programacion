//Modificar el algoritmo anterior para mostrar además el porcentaje de notas superiores a 10/20.
import java.util.Scanner;

class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double media;
        int n = 0;
        int n10 = 0;

        while(true) {
            System.out.print("Ingrese el valor " + (n+1) + ": ");
            double valor = sc.nextDouble();
            if(valor == -1) {
                break;
            }
            sum += valor;
            n++;
            if(valor >= 10) {
                n10++;
            }
        }

        media = sum/n;
        System.out.println("La media de los valores ingresados es: " + media);
        System.out.println("El porcentaje de notas superiores a 10 es: " + (n10*100/n) + "%");
    }
}