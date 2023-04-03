import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Administrativo extends Empleado {

    private boolean cumplioPresentismo;

    public Administrativo(int legajo, String nombre, float sueldoBasico, boolean cumplioPresentismo) {
        super(legajo, nombre, sueldoBasico);
        this.cumplioPresentismo = cumplioPresentismo;
    }

    @Override
    public float calcularSueldo() {
        float sueldo = getSueldoBasico();
        if (cumplioPresentismo) sueldo *= 1.13;
        return sueldo;
    }
}
