package utils;

public class InputValidation {
    public enum ValidationType {
        COFFEE_NUMBER, FORTRESS_NUMBER, VOLUME_NUMBER
    }

    public static boolean isValid(String number, ValidationType type, int max) {
        if (!number.matches("^\\d+$")) {
            return false;
        }
        int num = Integer.parseInt(number);
        if (type == ValidationType.COFFEE_NUMBER) {
            return num >= 0 && num <= max;
        } else if (type == ValidationType.FORTRESS_NUMBER || type == ValidationType.VOLUME_NUMBER) {
            return num >= 1 && num <= max;
        }
        return false;
    }
}
