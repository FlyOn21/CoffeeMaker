package models.coffeeMachine.enums;

public enum CoffeeFortress {
    LIGHT,
    MEDIUM,
    STRONG;

    public static CoffeeFortress fromValue(int value) {
        return switch (value) {
            case 1 -> LIGHT;
            case 2 -> MEDIUM;
            case 3 -> STRONG;
            default -> throw new IllegalArgumentException("Invalid value: " + value);
        };
    }

    @Override
    public String toString() {
        return switch (this) {
            case LIGHT -> "Light";
            case MEDIUM -> "Medium";
            case STRONG -> "Strong";
        };
    }
}
