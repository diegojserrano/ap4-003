public class Programa {
    public static void main(String[] args) {

        Persona a = new Persona(11, "Pedro", "Gomez", 1987);
        Persona b = new Persona(22, "Ana", "Marquez",1991);

        a.setEmail("aaa@hotmail.com");

        System.out.println(a);
        System.out.println(b);
    }
}
