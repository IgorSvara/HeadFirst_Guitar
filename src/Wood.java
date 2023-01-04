public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
    MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SIRKA;

    @Override
    public String toString() {
        return switch(this) {
            case ALDER -> "alder";
            case CEDAR -> "cedar";
            case MAPLE -> "maple";
            case SIRKA -> "sirka";
            case COCOBOLO -> "cocobolo";
            case MAHOGANY -> "mahogany";
            case ADIRONDACK -> "adirondack";
            case INDIAN_ROSEWOOD -> "indian rosewood";
            case BRAZILIAN_ROSEWOOD -> "brazilian rosewood";
            default -> throw new IllegalArgumentException("Unexpected value: \" + this");
        };
    }
}
