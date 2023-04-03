import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleado> plantel;

    public Empresa() {
        plantel = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado nuevo) {
        plantel.add(nuevo);
    }

    public float totalSueldos() {
        int suma = 0;

        for(Empleado e: plantel) {
            suma += e.calcularSueldo(); // Polimorfismo = mucha formas
            // porque el metodo calcularSueldo tiene tres formas distintas
            // tenemos la seguridad que siempre se ejecuta la version correcta del metodo
        }

        return suma;
        //return (float) plantel.stream().mapToDouble(Empleado::calcularSueldo).sum();
    }

}
