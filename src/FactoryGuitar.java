import org.jetbrains.annotations.NotNull;

public class FactoryGuitar {

    public static Guitar buildGuitar(Builder builder, String model, Type type,
                              Wood woodB, Wood woodT) {

        GuitarSpec specs = new GuitarSpec(builder, model, type, woodB, woodT, 6);
        return new Guitar("", 0, specs);

    }
    public static @NotNull Guitar buildGuitar(String serialN, double price, Builder builder,
                                              String model, Type type,
                                              Wood woodB, Wood woodT) {

        GuitarSpec specs = new GuitarSpec(builder, model, type, woodB, woodT, 6);
        return new Guitar(serialN, price, specs);

    }
}
