import java.io.IOException;
import java.nio.file.*;

public class Programa {
    public static void main(String[] args) throws IOException {

        Path archivo =  Paths.get("saludo.txt");

        if (Files.exists(archivo)) {
            System.out.println(Files.size(archivo));
            for(String linea:  Files.readAllLines(archivo)) {
                System.out.println(linea);
            }
        }
        else {
            System.out.println("El archivo no existe");
        }

    }

}
