import jdk.dynalink.linker.GuardingTypeConverterFactory;

public class Main {

    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.addGuitar("001", 1500, Builder.FENDER,
                "Stratocaster", Type.ELECTRIC, Wood.MAPLE, Wood.SIRKA);
        inv.addGuitar("002", 600, Builder.MARTIN,
            "Lotus", Type.ACOUSTIC, Wood.COCOBOLO, Wood.COCOBOLO);
        inv.addGuitar("003", 4000, Builder.GIBSON,
                "Victus", Type.ELECTRIC, Wood.MAHOGANY, Wood.BRAZILIAN_ROSEWOOD);

        FactoryGuitar factory = new FactoryGuitar();
        Guitar targetGuitar = factory.buildGuitar(Builder.FENDER,"Stratocaster",
                Type.ELECTRIC, Wood.MAPLE, Wood.SIRKA);

        Guitar myNewGuitar = inv.search(targetGuitar);

        System.out.println(myNewGuitar);

//        System.out.println(inv.getGuitar("001"));
    }


}
