import org.jetbrains.annotations.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.addGuitar("001", 1500, Builder.FENDER,
                "Stratocaster", Type.ELECTRIC, Wood.MAPLE, Wood.SIRKA);
        inv.addGuitar("002", 600, Builder.MARTIN,
                "Lotus", Type.ACOUSTIC, Wood.COCOBOLO, Wood.COCOBOLO);
        inv.addGuitar("003", 4000, Builder.GIBSON,
                "Victus", Type.ELECTRIC, Wood.MAHOGANY, Wood.BRAZILIAN_ROSEWOOD);
        inv.addGuitar("004", 600, Builder.FENDER,
                "Stratocaster", Type.ELECTRIC, Wood.MAPLE, Wood.SIRKA);

        Guitar targetGuitar = FactoryGuitar.buildGuitar(Builder.FENDER, "Stratocaster",
                Type.ELECTRIC, Wood.MAPLE, Wood.SIRKA);

        List<Guitar> myNewGuitar = inv.search(targetGuitar);

        System.out.println(arrayToString(myNewGuitar));

//        System.out.println(inv.getGuitar("001"));
    }
    public static String arrayToString(List<Guitar> array) {
        String str = "";
        for (Guitar guitar : array) {
            str += guitar.toString();
            str += "------\n";
        }
        // removing last line separator
        str = str.substring(0,str.length()-7);
        return str;
    }



}
