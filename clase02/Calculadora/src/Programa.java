// Importación del Scanner para poder usarlo
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        // Hacer que el programa sume dos números
        // Para declarar una variable: tipo nombre = valor inicial;

        // Para cargar por teclado hay que crear un scanner

        Scanner teclado = new Scanner(System.in);

        System.out.println("Cargue dos números: ");

        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();


        int suma = numero1 + numero2;
        int diferencia = numero1 - numero2;
        int producto = numero1 * numero2;
        // (float) se llama "molde" o "cast"
        // Con eso el operador de división se encuentra a la izquierda con un float
        // y a la derecha con un int


        // Ctrl + D : duplica
        System.out.println("Para los números " + numero1 + " y " + numero2);
        System.out.println("La suma es " + suma);
        System.out.println("La diferencia es " + diferencia);
        System.out.println("El producto es " + producto);

        // No voy a dividir si me cargaron un 0.
        if (numero2 != 0) { // Solo en este caso puedo dividir
            float cociente = (float) numero1 / numero2;
            System.out.println("El cociente es " + cociente);
        }
        else { // Y si no:
            System.out.println("No puedo dividir por 0!");
        }

    }
}
