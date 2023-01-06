import java.util.*;

public class Inventory {

    final private List<Guitar> guitars;

    public Inventory() {
        guitars = new ArrayList<>();
    }

    public void addGuitar(Guitar newGuitar) {

        guitars.add(newGuitar);
    }
    public Guitar searchBySerialNum(String  serialN) {
        for(Guitar g : guitars) {
            if (serialN.equals(g.getSerialNumber())) {
                return g;
            }
        }
        return null;
    }

    public List<Guitar> searchBySpec(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new ArrayList<>();
        for(Guitar g : guitars) {
            if (searchSpec.equals(g.getSpec())) {
                matchingGuitars.add(g);
            }
        }
        return matchingGuitars;
    }
}


