import java.util.*;

public class Inventory {

    final private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(String serialN, double price, Builder builder,
                          String model, Type type, Wood woodB, Wood woodT) {

        Guitar g = FactoryGuitar.buildGuitar(serialN, price, builder,
                model, type, woodB, woodT);

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

    public List<Guitar> search(Guitar gSearch) {
        List<Guitar> matchingGuitars = new ArrayList<>();
        for(Guitar g : guitars) {
            if (gSearch.getSpec().equals(g.getSpec())) {
                matchingGuitars.add(g);
            }
        }
        return matchingGuitars;
    }
}


