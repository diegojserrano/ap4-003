import java.util.HashMap;


public class Compra {

    private HashMap<Long,Item> items;

    public Compra() {
        items = new HashMap<>();
    }

    public void agregarItem(Item nuevo) {
        items.put(nuevo.getCodigo(), nuevo);
    }

    @Override
    public String toString() {
        String listado = "Ticket:\n";
        for(Item it: items.values()) {
            listado += it.toString() + "\n";
        }

        listado += String.format("|%52s | %8.2f |", "Total \uf90a" ,total());
        return listado;
    }

    public float total() {
        float suma = 0;

        for(Item it: items.values())
            suma += it.subtotal();

        return suma;

        //return (float)items.values().stream().mapToDouble(Item::subtotal).sum();
    }
}
