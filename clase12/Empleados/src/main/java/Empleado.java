import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class Empleado {

    private int legajo;
    private String nombre;
    private float sueldoBasico;

    // Un método abstacto ni siquiera tiene codigo (ni las llaves)
    // Esto obliga a que todas las derivadas lo sobreescriban
    public abstract float calcularSueldo();

}
