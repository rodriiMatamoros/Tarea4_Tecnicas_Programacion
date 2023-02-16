/*Observe atentamente el siguiente algoritmo:

Algo Trampa  
Variable numIntento : entero <- 1  
Variable valorIntroducido : texto  
Constante MAX_INTENTOS : entero <- 5  
Inicio  
   valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")  
   MientrasQue valorIntroducido ≠ "París" o MAX_INTENTOS - numIntentos ≠ 0 
         escribir("Respuesta incorrecta")  
         escribir("Solo quedan " & MAX_INTENTOS - numIntentos &  
" intento(s)")  
         valorIntroducido <- introducir("¿Cuál es la capital de Francia? ") 
   FMq  
   Si MAX_INTENTOS - numIntento ≠ 0 Entonces  
         escribir("Bravo")  
   Si no  
         escribir("Revise sus conocimientos en geografía")  
   FSi  
Fin 
¿Qué hace?

Corrija este algoritmo para que logre lo que se podría esperar.*/


/*El algoritmo es un juego de preguntas y respuestas en el que el usuario tiene que adivinar la capital de Francia. 
Si el usuario ingresa la respuesta correcta, el programa muestra el mensaje "Bravo". Si el usuario ingresa una respuesta 
incorrecta, el programa muestra el mensaje "Respuesta incorrecta" y el número de intentos restantes. El usuario tiene un
 máximo de 5 intentos para adivinar la respuesta correcta. Si el usuario no puede adivinar la respuesta correcta después 
 de 5 intentos, el programa muestra el mensaje "Revise sus conocimientos en geografía". El programa usa un bucle mientras-que 
 para verificar si la respuesta ingresada es incorrecta y si aún quedan intentos.*/
 

 import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        final int MAX_INTENTOS = 5;
        int numIntento = 1;
        String valorIntroducido;
        
        Scanner scanner = new Scanner(System.in);
        
        while (numIntento <= MAX_INTENTOS) {
            System.out.print("¿Cuál es la capital de Francia? ");
            valorIntroducido = scanner.nextLine();
            if (!valorIntroducido.equalsIgnoreCase("París")) {
                System.out.println("Respuesta incorrecta");
                System.out.println("Solo quedan " + (MAX_INTENTOS - numIntento) + " intento(s)");
                numIntento++;
            } else {
                System.out.println("¡Bravo! ¡Has acertado!");
                break;
            }
        }
        
        if (numIntento > MAX_INTENTOS) {
            System.out.println("¡Agotaste tus intentos! La respuesta correcta es 'París'.");
        }
        
        scanner.close();
    }
}
