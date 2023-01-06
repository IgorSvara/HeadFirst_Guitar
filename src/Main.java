import java.util.*;

public class Main {

    public static void main(String[] args) {
        Inventory inv = new Inventory();

        GuitarSpec spec001 = new GuitarSpec(Builder.FENDER,
                "Stratocaster", Type.ELECTRIC, Wood.MAPLE, Wood.SIRKA,6 );
        GuitarSpec spec002 = new GuitarSpec(Builder.MARTIN,
                "Lotus", Type.ACOUSTIC, Wood.COCOBOLO, Wood.COCOBOLO, 6 );
        GuitarSpec spec003 = new GuitarSpec(Builder.GIBSON,
                "Victus", Type.ELECTRIC, Wood.MAHOGANY, Wood.BRAZILIAN_ROSEWOOD,6 );
        GuitarSpec spec004 = new GuitarSpec(Builder.FENDER,
                "Stratocaster", Type.ELECTRIC, Wood.MAPLE, Wood.SIRKA,6 );

        Guitar guitar001 = new Guitar("001", 1500, spec001);
        Guitar guitar002 = new Guitar("002", 600, spec002);
        Guitar guitar003 = new Guitar("003", 4000, spec003);
        Guitar guitar004 = new Guitar("004", 1250, spec004);

        inv.addGuitar(guitar001);
        inv.addGuitar(guitar002);
        inv.addGuitar(guitar003);
        inv.addGuitar(guitar004);


        GuitarSpec targetSpec = new GuitarSpec(Builder.FENDER, "Stratocaster",
                Type.ELECTRIC, Wood.MAPLE, Wood.SIRKA, 6);

        List<Guitar> myNewGuitar = inv.searchBySpec(targetSpec);

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
