    import java.io.IOException;
    import java.nio.file.*;
    import java.util.Scanner;

    public class Programa {

        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese el nombre del archivo: ");
            String nombre = sc.nextLine();

            System.out.println("Ingrese el texto a buscar: ");
            String buscado = sc.nextLine();

            Path archivo = Paths.get(nombre);

            if (Files.exists(archivo)) {
                int numeroLinea = 0;
                boolean encontre = false;
                for(String linea: Files.readAllLines(archivo)) {
                    numeroLinea++;
                    if (linea.contains(buscado)) {
                        encontre = true;
                        System.out.println("Linea " + numeroLinea + ": " + linea);
                    }
                }
                if (encontre == false)
                    System.out.println("El texto no existe");

            } else {
                System.out.println("El archivo no existe");
            }
        }
    }
