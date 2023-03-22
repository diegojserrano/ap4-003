public class Programa {

    public static void main(String[] args) {

        // Con el molde de las Personas voy a crear una persona nueva
        // Para poder usar cada uno de los objetos creados defino
        // variables de tipo "Referencia a Persona"

        Persona a = new Persona(111,"Juan", "Perez");

        Persona b = new Persona(122,"Juana", "Pereza");

        //a.setDocumento(111);
        //a.setNombre("Juan");
        //a.setApellido("Perez");

        //b.setDocumento(122);
        //b.setNombre("Juana");
        //b.setApellido("Pereza");


        System.out.println(a.getDocumento() + " " + a.getNombre() + " " + a.getApellido());
        System.out.println(b.getDocumento() + " " + b.getNombre() + " " + b.getApellido());

        a.setNombre("Pedro");

        System.out.println(a.getDocumento() + " " + a.getNombre() + " " + a.getApellido());

    }
}
