package by.epam.javatr.dedik.day2.service;

import by.epam.javatr.dedik.day2.validation.ArrayValidator;

import java.util.Calendar;

public class ConsolePrinter {
    public void printArgs(String[] args) {
        for (String arg : args) {
            System.out.printf("%s ", arg);
        }
    }

    public void printNumbersWithJump(int[] numbers) {
        for (int number : numbers) {
            System.out.printf("%d ", number);
        }
    }

    public void printNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public void printEqualsPasswords(boolean result) {
        System.out.printf("Is correct password: %s", result);
    }

    public void printAmountAndMultiplication(int amount, int multiplication) {
        System.out.printf("Amount %s%n", amount);
        System.out.printf("Multiplication %s", multiplication);
    }

    public void printDate(Calendar calendar, String[] args) {
        ArrayValidator validator = new ArrayValidator();
        if (!validator.isEmpty(args)) {
            System.out.println(args[1]+ calendar.get(Calendar.MONTH) + ":"
                    + calendar.get(Calendar.MONTH) + ":"
                    + calendar.get(Calendar.YEAR));
        }
    }
}
