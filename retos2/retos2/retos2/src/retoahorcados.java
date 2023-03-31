import java.util.Scanner;

public class retoahorcados {
    public static void main(String[] args) {
        //* se importa la clase escanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        //*Se define un array de palabras secretas y numero de intentos
        String[] palabras = {"amarillo", "azul", "blanco"};
        int intentos = 6;
        int aleatorio = (int) (Math.random() * palabras.length);
         //*Se genera un número aleatorio entre 0 y el número de palabras secretas menos uno
        String palabra = palabras[aleatorio];
         //*creamos un array de caracteres  del mismo tamaño que la palabra secreta
        char[] palabraOculta = new char[palabra.length()];
       
        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_';
        }
        boolean adivino = false;
        //* imprimimos lo que queremos que digite y sepa el usuario
        while (intentos > 0 & !adivino) {
            System.out.println("Tienes " + intentos + " intentos restantes");
            System.out.println("La palabra a adivinar es: " + String.valueOf(palabraOculta));

            System.out.print("Introduce una letra: ");
            char letra = sc.next().charAt(0);

            boolean acerto = false;
        //* creamos los ciclos 
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    palabraOculta[i] = letra;
                    acerto = true;
                }
            }

            if (!acerto) {
                intentos--;
                System.out.println("La letra " + letra + " no está en la palabra secreta.");
            } else {
                if (String.valueOf(palabraOculta).indexOf('_') == -1) {
                    adivino = true;
                }
            }
        }
        //*imprimimos pra decirle si gano o perdio

        if (adivino) {
            System.out.println("¡Felicidades! Adivinaste la palabra secreta: " + palabra);
        } else {
            System.out.println("Lo siento, no adivinaste la palabra secreta: " + palabra);
        }
    }
}
          

    
    







