package by.epam.javatr.dedik.day2.validation;

public class NameValidator {
    public boolean isName(String name) {
        boolean result = true;
        if (!Character.isUpperCase(name.charAt(0))) {
            result = false;
        } else {
            for (int i = 0; i < name.length(); i++) {
                if (isNumber(String.valueOf(name.charAt(i)))) {
                    result = false;
                }
            }
        }
        return result;
    }

    public boolean isNumber(String number) {
        boolean result = true;
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }
}
