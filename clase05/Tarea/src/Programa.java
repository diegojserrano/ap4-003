import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        Path archivo = Paths.get("numeros.txt");
        
        Scanner lector = new Scanner(archivo);
        
        int cantidad = lector.nextInt();
        
        int []numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = lector.nextInt();
        }
        
        for (int x: numeros) {
            System.out.println(x);
        }
    }
}
