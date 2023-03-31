    import java.util.Scanner;
    public class retopalindromo {
        
    /*ponemos un identificador publico estatico void con un valor no retornable y caracteres para que los
     tenga como argumentos */

    public static void main(String[] args) {
            /*ponemos un scanner para que lea e imprima junto con un objeto lectura */
        Scanner lectura = new Scanner(System.in);
     /*imprimimimos lo que queremos que el usuario ingrese */
        System.out.println("Ingrese una palabra: ");
        /*le pondremos una variable palabra y le diremos que sea igual a lectura */
        String palabra = lectura.nextLine();
        /*le pondremos un boolean que rectificara si es verdader o falso el palindromo ingresado donde true es verdadero y
         false es falso*/
        boolean esPalindromo = true;
        /*Creamos un ciclo donde sea igual a cero y menor a 2 */
        for (int i = 0; i < 2; i++) {
        /* una condicion para si el caracter en la posicion i de la cadena palabra es diferente del 
        caracter de la posicion en el extremo opuesto, utilizamos un charAt para acceder a 
        un caracter de una posicion especificada */
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
        /* si no es palindromo le dira que es falso */
                esPalindromo = false;
                break;
            }
        }
    /*si cumple con la condicion le dira que es un palindromo si no la cumple le dira que la palabra no es un palindromo */
        if (esPalindromo) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }
}

