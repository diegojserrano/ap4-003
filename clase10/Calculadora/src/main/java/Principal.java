public class Principal {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        System.out.println(c.sumar(32,56));

        Punto origen = new Punto(0,0);

        System.out.println(origen);


        Circulo c1 = new Circulo(10, new Punto(0,0));

        System.out.println(c1);
        System.out.println(c.circunferencia(c1));
    }
}
