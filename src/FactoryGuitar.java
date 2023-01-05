import java.util.List;

public class FactoryGuitar {

    public Guitar buildGuitar(Builder builder, String model, Type type,
                              Wood woodB, Wood woodT) {

        GuitarSpec specs = new GuitarSpec(builder, model, type, woodB, woodT);
        return new Guitar("", 0, specs);

    }
}
