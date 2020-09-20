package by.epam.javatr.dedik.day2.service;

import by.epam.javatr.dedik.day2.validation.ArrayValidator;
import by.epam.javatr.dedik.day2.validation.NumberValidator;

import java.util.Random;

public class NumberUtility {
    public int[] generateNumbers(String[] args) {
        NumberValidator numberValidator = new NumberValidator();
        ArrayValidator arrayValidator = new ArrayValidator();
        Random generator = new Random();


        int[] numbers = new int[0];
        if (arrayValidator.isEmpty(args) && numberValidator.isArraySize(args[0])) {
            int size = Integer.parseInt(args[0]);
            numbers = new int[size];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = generator.nextInt();
            }
        }
        return numbers;
    }

    public int[] toNumberArray(String[] array) {
        NumberValidator numberValidator = new NumberValidator();
        ArrayValidator arrayValidator = new ArrayValidator();
        int[] result = new int[0];
        if (!arrayValidator.isEmpty(array)) {
            result = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                if (numberValidator.isInteger(array[i])) {
                    result[i] = Integer.parseInt(array[i]);
                }
            }
        }
        return result;
    }

    public int calculateAmount(int[] array) {
        int result = 0;
        for (int element : array) {
            result += element;
        }
        return result;
    }

    public int calculateMultiplication(int[] array) {
        int result = 1;
        for (int element : array) {
            result *= element;
        }
        return result;
    }
}
