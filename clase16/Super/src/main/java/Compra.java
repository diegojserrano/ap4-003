import lombok.Getter;

import java.util.HashMap;


@Getter
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

        listado += String.format("|%52s | %8.2f |", "Total \uf90a" , getTotal());
        return listado;
    }

    public float getTotal() {
        float suma = 0;

        for(Item it: items.values())
            suma += it.getSubtotal();

        return suma;

        //return (float)items.values().stream().mapToDouble(Item::subtotal).sum();
    }

    public int getCantidadRetirados() {
        int c = 0;
        for (Item it: items.values())
            if (it.isRetirado())
                c++;
        return c;
    }

}
