import java.sql.Array;
import java.util.*;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(String serialN, double price, Builder builder,
                          String model, Type type, Wood bWood, Wood fWood) {

        GuitarSpec gs = new GuitarSpec(builder, model, type, bWood, fWood);
        Guitar g = new Guitar(serialN, price, gs);

        guitars.add(g);
    }
    public Guitar getGuitar(String  serialN) {
        for(Guitar g : guitars) {
            if (serialN.equals(g.getSerialNumber())) {
                return g;
            }
        }
        return null;
    }

    public Guitar search(Guitar gSearch) {
        for(Guitar g : guitars) {
            if (gSearch.getSpec().equals(g.getSpec())) {
                return g;
            }
        }
        return null;
    }
}


