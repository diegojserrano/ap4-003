// Cargar números enteros en un arreglo. Solicitar al usuario la cantidad
// de números que quiere cargar. Informar:
//        * La lista de todos los números ingresados
//        * La suma de todos

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = sc.nextInt();

        int numeros[];  // Declaración

        numeros = new int[n];  // Creación con tamaño n

        // Carga
        System.out.println("Ingrese " + n + " números");
        for(int i = 0; i < numeros.length ; i++) {
            // Cualquier cosa que le haga a numeros[i]
            // Se va a repetir en todos los casilleros
            numeros[i] = sc.nextInt();
        }

        System.out.println("Listado de los números ingresados");
        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Abreviatura: fori
        int suma = 0;
        for(int i = 0; i < numeros.length; i++) {
            // Que saque todos los números del vector
            // Y los sume dentro de la variable suma
            suma += numeros[i];
        }

        suma = 0;
        // Por cada número x perteneciente al arreglo "numeros"
        for(int x: numeros) {
            suma += x;
        }

        System.out.println("La suma de todos los números ingresados es: " + suma);
    }
}
