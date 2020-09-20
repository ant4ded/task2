package by.epam.javatr.dedik.day2.main;

import by.epam.javatr.dedik.day2.service.ConsolePrinter;
import by.epam.javatr.dedik.day2.service.StringUtility;

public class FourthTask {
    public static void main(String[] args) {
        StringUtility utility = new StringUtility();
        ConsolePrinter printer = new ConsolePrinter();
        boolean result = utility.isCorrectPassword(args);
        printer.printEqualsPasswords(result);
    }
}
