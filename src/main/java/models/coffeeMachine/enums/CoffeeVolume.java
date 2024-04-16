package models.coffeeMachine.enums;

public enum CoffeeVolume {
    SMALL,
    MEDIUM,
    BIG;

    public static CoffeeVolume fromValue (int value) {
        return switch (value) {
            case 1 -> SMALL;
            case 2 -> MEDIUM;
            case 3 -> BIG;
            default -> throw new IllegalArgumentException("Invalid value: " + value);
        };
    }

    @Override
    public String toString() {
        return switch (this) {
            case SMALL -> "Small";
            case MEDIUM -> "Medium";
            case BIG -> "Big";
        };
    }
}
