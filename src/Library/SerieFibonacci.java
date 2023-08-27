
package Library;
import java.util.*;

/**
 * @author Cesar Elias Carpio Jimenez
 * Esta clase genera una serie Fibonacci basada en la entrada del usuario.
 */
public class SerieFibonacci {

    /**
     * Genera e imprime una serie Fibonacci basada en la entrada del usuario.
     *
     * @return El valor de n (siempre es 0 en este caso)
     */
    public static int SerieFibonacci() {
        int n = 0;

        Scanner entrada = new Scanner(System.in);

        try {
            int Num_Uno = 0, Num_Dos = 1, Num_Tres = 0;
            // Número de términos en la serie Fibonacci
           System.out.println("Ingrese la cantidad de terminos en la serie Fibonacci: ");
            int NumTermino = entrada.nextInt();
            System.out.println("Serie de Fibonacci con " + NumTermino + " términos:");
            
            for (int i = 0; i < NumTermino; i++) {
                System.out.print(Num_Uno + " , ");
                Num_Tres = Num_Uno + Num_Dos;
                Num_Uno = Num_Dos;
                Num_Dos = Num_Tres;
            }

        } catch (InputMismatchException e) {
            System.out.println("Error. Debe ingresar un valor numérico entero.");
        }
        
        entrada.close();
        return n;
    } 
}