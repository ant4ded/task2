package by.epam.javatr.dedik.day2.main;

import by.epam.javatr.dedik.day2.service.ConsolePrinter;
import by.epam.javatr.dedik.day2.service.NumberUtility;

public class ThirdTask {
    public static void main(String[] args) {
        NumberUtility utility = new NumberUtility();
        ConsolePrinter printer = new ConsolePrinter();
        int[] numbers = utility.generateNumbers(args);
        printer.printNumbersWithJump(numbers);
        printer.printNumbers(numbers);
    }
}
