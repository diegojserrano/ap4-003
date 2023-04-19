import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item {

    private long codigo;
    private String descripcion;
    private float precioUnitario;
    private float cantidad;
    private boolean retirado;

    @Override
    public String toString() {
        return String.format("| %1s | %10d | %-15s | %7.2f | %5.2f | %8.2f |",
                (retirado?"\u2705":"\u274e"), codigo, descripcion, precioUnitario, cantidad, getSubtotal());
    }

    public float getSubtotal() {
        return precioUnitario * cantidad;
    }
}
