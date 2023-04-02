import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Path archivo = Paths.get("personas2.txt");
        Scanner lector = new Scanner(archivo);

        lector.useDelimiter("[;\\n]");

        Padron listadoElecciones = new Padron();

        while (lector.hasNextInt()) {

            /* Alternativa 1

            int doc = lector.nextInt();
            String nom = lector.next();
            String ape = lector.next();
            int edad = lector.nextInt();
            */

            // Alternativa 2
            String linea = lector.nextLine();
            String []datos = linea.split(";");
            int doc = Integer.parseInt(datos[0]);
            String nom = datos[1];
            String ape = datos[2];
            int edad  = Integer.parseInt(datos[3]);

            Persona nueva = new Persona(doc, nom, ape, edad);
            listadoElecciones.agregarPersona(nueva);
            System.out.println(nueva);
        }

        lector.close();

        // Recién acá terminó el ingreso de datos

        // Mostrar la cantidad de personas ingresadas
        System.out.println("Se cargaron " + listadoElecciones.cantidadPersonas()  + " personas");
        // Mostrar el promedio de edades de todas
        System.out.println("Promedio de edades: " + listadoElecciones.promedioEdades());
        // Buscar dos personas
        Persona encontrada = listadoElecciones.buscarPersona(83494736);
        if (encontrada != null)
            System.out.println("La persona fue encontrada: " + encontrada);
        else
            System.out.println("La persona no existe");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un nombre: ");
        String nombreBuscado = teclado.nextLine();
        List<Persona> enc = listadoElecciones.buscarPorNombre(nombreBuscado);
        if (enc.isEmpty())
            System.out.println("No se encontró nadie");
        else {
            for(Persona p: enc) {
                System.out.println(p);
            }
        }
    }
}