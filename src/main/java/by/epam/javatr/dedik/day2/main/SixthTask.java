package by.epam.javatr.dedik.day2.main;

import by.epam.javatr.dedik.day2.service.ConsolePrinter;
import by.epam.javatr.dedik.day2.service.StringUtility;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SixthTask {
    public static void main(String[] args) {
        StringUtility utility = new StringUtility();
        ConsolePrinter printer = new ConsolePrinter();
        Calendar startDate = utility.setUpDate(new GregorianCalendar());
        Calendar date = utility.calculateDate(args);

        printer.printDate(startDate, args);
        printer.printDate(date, args);
    }
}
