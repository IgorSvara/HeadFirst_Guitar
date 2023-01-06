import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter @AllArgsConstructor @EqualsAndHashCode
public class GuitarSpec {

    private final Builder builder;
    private final String model;
    private final Type type;
    private final Wood backWood;
    private final Wood topWood;
    private final int numStrings;

    @Override
    public String toString() {
        return "Guitar: " + getBuilder() + " " + getModel() + "\n" +
                "GuitarSpec{" +
                "type=" + getType() +
                ", backWood=" + getBackWood() +
                ", topWood=" + getTopWood() +
                "}\n";
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj.getClass() != GuitarSpec.class) return false;
//
//        GuitarSpec gs = (GuitarSpec) obj;
//        if (this.getBuilder() != gs.getBuilder()) return false;
//        if (!this.getModel().equals(gs.getModel())) return false;
//        if (this.getType() != gs.getType()) return false;
//        if (this.getTopWood() != gs.getTopWood()) return false;
//        if (this.getBackWood() != gs.getBackWood()) return false;
//
//        return true;
//    }
}

