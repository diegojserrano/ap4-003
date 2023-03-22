// Ingresar números.
// Informar:
//       Suma de todos
//       Cantidad de números ingresados
//       Promedio de todos

// Alternativa 1: ingresar hasta que cargue un 0
// Alternativa 2: ingresar primero la cantidad de números

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int x;
        int suma = 0;
        int cantidad = 0;

        /*
        System.out.println("Ingrese números, termina cuando cargue un 0");
        // Ingreso el primer número
        x = teclado.nextInt();

        while (x != 0){
            System.out.println("Ud. cargó un " + x);
            suma += x; // Acumulador
            cantidad += 1; // Contador
            x = teclado.nextInt();
        }

        float promedio = (float)suma / cantidad;
        */

        System.out.println("Ingrese la cantidad de números");
        cantidad = teclado.nextInt();

        System.out.println("Ingrese " + cantidad + " números");
        for(int i = 0; i < cantidad; i+=1) // Va a dar tantas vueltas como diga la variable cantidad
        {
            x = teclado.nextInt();
            System.out.println("Ud. cargó un " + x);
            suma += x; // Acumulador
        }

        float promedio = (float)suma / cantidad;

        System.out.println("Ud. cargó " + cantidad + " números");
        System.out.println("Suman " + suma);
        System.out.println("Y el promedio es " + promedio);


    }


}
