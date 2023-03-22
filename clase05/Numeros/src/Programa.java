import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws IOException {

        Path archivo = Paths.get("numeros.txt");

        if (Files.exists(archivo)) {
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextInt()) {

                int n = lector.nextInt();
                System.out.println(n);
            }
        }
    }
}
