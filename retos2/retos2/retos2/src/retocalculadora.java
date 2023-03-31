import java.util.Scanner;
    

public class retocalculadora {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        String[][] a = new String[5][4];

        for (int N = 0; N < 5; N++) {
            for (int C = 0; C < 4; C++) {
                System.out.print("Numeros y simbolos de la calculadora [" + N + "][" + C + "]: ");
                a[N][C] = lectura.nextLine();
            }
        }

        System.out.println("Esta es su calculadora:");
        for (int N = 0; N < 5; N++) {
            for (int C = 0; C < 4; C++) {
                System.out.print(a[N][C] + " ");
            }
            System.out.println();
        }
    }
}
 

