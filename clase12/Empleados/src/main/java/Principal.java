public class Principal {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        empresa.agregarEmpleado(new Obrero(1,"Juan", 100000,23));
        empresa.agregarEmpleado(new Administrativo(2, "Jorge", 100000, true));
        empresa.agregarEmpleado(new Vendedor(3, "Ana", 100000, 5000000));

        //115
        //113
        //150
        //Suma 378

        System.out.println(empresa.totalSueldos());
    }
}
