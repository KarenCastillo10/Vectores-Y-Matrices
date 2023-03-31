
import java.util.Scanner;

public class retomaquina {
/*ponemos un identificador publico estatico void con un valor no retornable y caracteres para que los tenga como argumentos */
    public static void main(String[] args) {
        /*ponemos un scanner para que lea e imprima junto con un objeto lectura */
        Scanner lectura = new Scanner(System.in);
        /*Primero la declaramos para reservar un espacio que es la matriz. Utilizamos dos pares de
        corchetes y se crea un objeto tipo array con una dimension matriz */
        /*en este caso como son 16 espacios los que vamos a utilizar pondremos dos matrices tipo string de 4x4 cuenta con unas filas y unas columnas*/
        String[][] b = new String[4][4];
        String[][] a = new String[4][4];

        /* creamos un ciclo para rellenar matrices  */
        /*utilizamos un bucle for dentro de otro bucle for, el primer bucle recorrerá las filas de la matriz y
        el segundo bucle, recorrerá las columnas de la misma.*/
        /*cuenta con un valor inicial que es cero y el valor final que es menor y mayor a 4 segurn el ciclo un for para la fila y otro for para la calunma */

        for (int D = 0; D < 4; D++) {
            for (int M = 0; M < 4; M++) {
                System.out.print("Producto que desea [" + D + "][" + M + "]: ");
                b[D][M] = lectura.nextLine();
                System.out.print("valor del producto [" + D + "][" + M + "]: ");
                a[D][M] = lectura.nextLine();
            }
        }
        /*creamos un sysout para imprimir los productos  */
        System.out.println("Estos son los productos:");
        /*utilizamos un bucle for dentro de otro bucle for, el
        primer bucle recorrerá las filas de la matriz y el segundo bucle, recorrerá las
        columnas de la misma.y le ponemos un contador para que cuente las filas y los productos introducidos*/
        
        int contador = 1;
        for (int D = 0; D < 4; D++) {
            for (int M = 0; M < 4; M++) {
                System.out.println(contador + ": " + b[D][M] + ": " + a[D][M]);
                contador++;
            }
        }
    }
}