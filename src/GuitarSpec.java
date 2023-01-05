public class GuitarSpec {
    private final Builder builder;
    private final String model;
    private final Type type;
    private final Wood backWood;
    private final Wood topWood;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    @Override
    public String toString() {
        return "Guitar: " + getBuilder() + " " + getModel() + "\n" +
                "GuitarSpec{" +
                "type=" + getType() +
                ", backWood=" + getBackWood() +
                ", topWood=" + getTopWood() +
                "}\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != GuitarSpec.class) return false;

        GuitarSpec gs = (GuitarSpec) obj;
        if (this.getBuilder() != gs.getBuilder()) return false;
        if (!this.getModel().equals(gs.getModel())) return false;
        if (this.getType() != gs.getType()) return false;
        if (this.getTopWood() != gs.getTopWood()) return false;
        if (this.getBackWood() != gs.getBackWood()) return false;
        return true;
    }
}

