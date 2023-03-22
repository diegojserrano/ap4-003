import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {

        ArrayList<String> dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");

        System.out.println("Dias laborables");
        for(String d : dias)
            System.out.println(d);

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(4);
        listaNumeros.add(12);
        listaNumeros.add(6);
        listaNumeros.add(19);
        listaNumeros.add(19);

        System.out.println("Tamaño: "  + listaNumeros.size());

        System.out.println("Contiene el 6?: " + listaNumeros.contains(6));
        System.out.println("Contiene el 16?: " + listaNumeros.contains(16));

        System.out.println("Listado de todos: ");
        for(int i = 0; i < listaNumeros.size(); i++)
            System.out.println(listaNumeros.get(i));

        int suma = 0;
        for(Integer x: listaNumeros) {
            System.out.println(x);
            suma += x;
        }

        System.out.println("La suma es: " + suma);
    }
}