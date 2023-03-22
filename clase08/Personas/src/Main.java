import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Persona a = new Persona(111,"Juan", "Perez", 24);
        Persona b = new Persona(122,"Ana", "Ruiz", 20);

        HashMap<Integer, Persona> plantel = new HashMap<>();

        plantel.put(a.getDocumento(), a);
        plantel.put(b.getDocumento(), b);

        System.out.println(plantel.get(12342));

        int suma = 0;
        for(Persona p: plantel.values()) {
            suma += p.getEdad();
        }

        float promedio = (float) suma / plantel.size();

        System.out.println("El promedio de las edades es: " + promedio);



    }
}