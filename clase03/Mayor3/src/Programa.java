import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n1, n2, n3, mayor;

        System.out.println("Ingrese tres números:");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();
/*
        // Estrategia 1: Descartamos los que no son mayores
        if (n1 > n2) { // n2 no es el mas grande, lo podemos descartar
            if (n1 > n3) {
                mayor = n1;
            } else {
                mayor = n3;
            }
        } else {  // n1 no es el mayor, lo descarto
            if (n2 > n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }
        }

        // Estrategia 2: Suponemos que el mayor es el primero
        if (n1 > n2 && n1 > n3) { // Si es mayor al segundo Y tambien al tercero
            mayor = n1;
        } else {  // El primero no es el mayor, lo descarto
            if (n2 > n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }
        }
*/
        // Estrategia 3:
        if (n1 > n2) {
            mayor = n1;
        } else {
            mayor = n2;
        }

        if (n3 > mayor) {
            mayor = n3;
        }

        System.out.println("El mayor es: " + mayor);
    }
}
