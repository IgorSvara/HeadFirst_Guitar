public enum Type {
    ACOUSTIC, ELECTRIC;

    @Override
    public String toString() {
        return switch(this) {
            case ACOUSTIC -> "acoustic";
            case ELECTRIC -> "electric";
            default -> throw new IllegalStateException("Unexpected value: " + this);
        };
    }
}
