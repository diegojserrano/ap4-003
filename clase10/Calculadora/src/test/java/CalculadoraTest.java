import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void sumar() {
        Calculadora c = new Calculadora();

        assertEquals (4, c.sumar(2,2), "Estaba sumando dos mas dos");
        assertEquals (0, c.sumar(0,0));
        assertEquals (2.53, c.sumar(2.3,0.23));
        assertEquals (0.000002, c.sumar(0.000001, 0.000001));

    }


}