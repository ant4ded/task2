package by.epam.javatr.dedik.day2.validation;

import java.time.Year;

public class NumberValidator {
    public static final int MAX_ARRAY_SIZE = 50;
    public static final int LOWER_LIMIT_YEAR = 300;
    public static final int UPPER_LIMIT_YEAR = 100;

    public boolean isInteger(String number) {
        boolean result = true;
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }

    public boolean isArraySize(String size) {
        return isInteger(size) && Integer.parseInt(size) <= MAX_ARRAY_SIZE;
    }

    public boolean isDay(String day) {
        return isInteger(day) && Integer.parseInt(day) < 31;
    }

    public boolean isMonth(String month) {
        return isInteger(month) && Integer.parseInt(month) <= 12 && Integer.parseInt(month) > 0;
    }

    public boolean isYear(String year) {
        return isInteger(year) && (Integer.parseInt(year) < LOWER_LIMIT_YEAR ||
                Integer.parseInt(year) > UPPER_LIMIT_YEAR);
    }
}
