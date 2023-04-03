import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Vendedor extends Empleado {

    private float totalVentas;

    public Vendedor(int legajo, String nombre, float sueldoBasico, float totalVentas) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }

    @Override
    public float calcularSueldo() {
        return getSueldoBasico() + totalVentas * 0.01f;
    }
}
