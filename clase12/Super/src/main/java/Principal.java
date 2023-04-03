import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        Path archivo = Paths.get("ticket.csv");
        Scanner lector = new Scanner(archivo);
        Compra c = new Compra();

        lector.useDelimiter("[,\\n]");

        while(lector.hasNextLong()) {
            long cod = lector.nextLong();
            String desc = lector.next();
            float precio = lector.nextFloat();
            float cant = lector.nextFloat();

            Item nuevo = new Item(cod, desc, precio, cant);
            c.agregarItem(nuevo);
        }

        lector.close();

        System.out.println(c);

    }
}
