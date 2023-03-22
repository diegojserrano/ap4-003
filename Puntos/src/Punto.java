public class Punto {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int cuadrante() {
        if (x == 0 && y == 0) return 0; // 0 = origen
        if (x == 0) return -1; // -1 = eje de ordenadas
        if (y == 0) return -2; // -2 = eje de las abscisas
        if (x > 0) {
            return (y > 0)? 1: 4;
        } else {
            return (y > 0)? 2: 3;
        }
    }

    public String toString() {
        return "(" + x + "," + y + ") está en el cuadrante " + cuadrante() + " y su distancia al origen es de " + distanciaAlOrigen();
    }

    private double distanciaAlOrigen() {
        // Teorema de Pitagoras: raiz cuadrada de la suma de los cuadrados de las coordenadas
        return Math.sqrt(x * x + y * y);
    }
}
