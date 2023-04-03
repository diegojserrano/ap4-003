import lombok.AllArgsConstructor;
import lombok.Data;
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

    @Override
    public String toString() {
        return String.format("| %10d | %-15s | %7.2f | %5.2f | %8.2f |",
                codigo, descripcion, precioUnitario, cantidad, subtotal());
    }

    public float subtotal() {
        return precioUnitario * cantidad;
    }
}
