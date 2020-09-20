package by.epam.javatr.dedik.day2.service;

import by.epam.javatr.dedik.day2.validation.ArrayValidator;
import by.epam.javatr.dedik.day2.validation.NumberValidator;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StringUtility {
    public static final int DAY = 13;
    public static final int MONTH = 06;
    public static final int YEAR = 2020;
    private static final String PASSWORD = "4567895";

    public String[] reverse(String[] args) {
        ArrayValidator validator = new ArrayValidator();
        String[] result = new String[args.length];
        if (!validator.isEmpty(args)) {
            for (int i = 0, j = args.length - 1; j >= 0; i++, j--) {
                result[i] = args[j];
            }
        }
        return result;
    }

    public boolean isCorrectPassword(String[] password) {
        boolean result = false;
        ArrayValidator validator = new ArrayValidator();
        if (!validator.isEmpty(password) && password.equals(PASSWORD)) {
            result = true;
        }
        return result;
    }

    public Calendar calculateDate(String[] args) {
        ArrayValidator arrayValidator = new ArrayValidator();
        NumberValidator numberValidator = new NumberValidator();
        Calendar calendar = new GregorianCalendar();
        if (!arrayValidator.isEmpty(args) && numberValidator.isDay(args[0])) {
            setUpDate(calendar);
            calendar.add(Calendar.DAY_OF_MONTH, Integer.parseInt(args[0]));
        }
        return calendar;
    }

    public Calendar setUpDate(Calendar calendar) {
        calendar.set(Calendar.YEAR, YEAR);
        calendar.set(Calendar.MONTH, MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, DAY);
        return calendar;
    }

    public Calendar toDate(String[] args) {
        ArrayValidator validator = new ArrayValidator();
        Calendar calendar = new GregorianCalendar();
        if (!validator.isEmpty(args)) {
            calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(args[0]));
            calendar.set(Calendar.MONTH, Integer.parseInt(args[1]));
            calendar.set(Calendar.YEAR, Integer.parseInt(args[2]));
        }
        return calendar;
    }

    public boolean isToday(Calendar calendar) {
        Calendar today = setUpDate(new GregorianCalendar());
        return today.get(Calendar.YEAR) == calendar.get(Calendar.YEAR) &&
                today.get(Calendar.MONTH) == calendar.get(Calendar.MONTH) &&
                today.get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH);
    }
}
