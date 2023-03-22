import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese dos números: ");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        int mayor;

        if (numero1 == numero2) {
            System.out.println("Son iguales");
        } else { // Acá es porque son distinto

            //if (numero1 > numero2) {
            //    mayor = numero1;
            //} else {
            //   mayor = numero2;
            //}

            // En cada rama (la verdadera y la falsa) lo único que hago es asignar
            // la misma variable:

            mayor = (numero1 > numero2)? numero1: numero2;

            System.out.println("El mayor es " + mayor);
        }
    }
}
