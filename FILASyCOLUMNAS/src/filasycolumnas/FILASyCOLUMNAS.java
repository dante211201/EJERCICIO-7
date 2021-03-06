/*
 *VAZQUEZ SILVA DANTE
 * 2S11
 */
package filasycolumnas;

public class FILASyCOLUMNAS {
    

    static int[][] generaArrayAleatorio(int filas, int columnas){
    int[][] matriz=new int[filas][columnas];
    int i,j;
        
    for (i=0 ; i < matriz.length ; i++){
    for (j=0 ; j < matriz[i].length ; j++){
    matriz[i][j] = (int)(Math.random()*10+1);
    }
    }

    return matriz;
    }
    
    static void muestraArray(int[][] matriz){
    int i,j;
        
        for (i=0; i < matriz.length ; i++){
        for (j=0 ; j < matriz[i].length ; j++){
        System.out.printf("%3d", matriz[i][j]);
        }
        System.out.println();
        }
    }
    

    static int[][] transponer(int[][] matriz){
        int[][] resultado=new int[matriz[0].length][matriz.length];
        int filas,columnas;
        
        for (columnas=0 ; columnas < matriz[0].length ; columnas++){
        for (filas=0 ; filas < matriz.length ; filas++){
        resultado[columnas][filas]=matriz[filas][columnas];
        }
        }

        return resultado;
    }
    
    public static void main(String[] args) {
    int [][]matriz;
        

        matriz=generaArrayAleatorio(9,5);
        System.out.println("Array Original...");
        muestraArray(matriz);

        System.out.println();

        System.out.println("Array transpuesto...");
        matriz=transponer(matriz);
        muestraArray(matriz);
    }
}