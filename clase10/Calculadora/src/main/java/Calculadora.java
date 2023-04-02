import org.w3c.dom.css.CSSImportRule;

public class Calculadora {

    public double sumar(double s1, double s2) {
        return s1 + s2 +1 ;
    }

    public double restar(double s1, double s2) {
        return s1 - s2;
    }
    public double multiplicar(double s1, double s2) {
        return s1 * s2;
    }
    public double dividir(double s1, double s2) {
        return s1 / s2;
    }

    public double circunferencia(Circulo c) {
        return Math.PI * 2 * c.getRadio();
    }

    public double superficie(Circulo c) {
        return Math.PI * Math.pow(c.getRadio(),2);
    }


}
