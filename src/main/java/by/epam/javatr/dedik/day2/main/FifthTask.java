package by.epam.javatr.dedik.day2.main;

import by.epam.javatr.dedik.day2.service.ConsolePrinter;
import by.epam.javatr.dedik.day2.service.NumberUtility;

public class FifthTask {
    public static void main(String[] args) {
        NumberUtility utility = new NumberUtility();
        ConsolePrinter printer = new ConsolePrinter();
        int[] numbers = utility.toNumberArray(args);
        int amount = utility.calculateAmount(numbers);
        int multiplication = utility.calculateMultiplication(numbers);
        printer.printAmountAndMultiplication(amount, multiplication);
    }
}
