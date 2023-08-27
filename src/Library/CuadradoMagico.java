package Library;

/**
 * @author Cesar Elias Carpio Jimenez
 * Esta clase representa la generación y visualización de un cuadrado mágico.
 */
public class CuadradoMagico {
    
    /**
     * Genera y muestra un cuadrado mágico predefinido.
     */
    public static void CuadradoMagico(){
        int [][]filas = new int[3][3];
        int Fila = 3;
        int Columna = 3;
        
        // Inicialización de valores
        filas[0][0] = 1;
        filas[0][1] = 2;
        filas[0][2] = 5;
        filas[1][0] = 5;
        filas[1][1] = 1; 
        filas[2][0] = 2;
        filas[2][2] = 6;
   
        for(int i = 0 ; i < Fila; i++){
            for(int j = 0 ; j < Columna; j++){
                System.out.print("[" + filas[i][j] + "]");// Llamada a la función filas y muestra el resultado
            }
            System.out.println("");
        }
    }
}
