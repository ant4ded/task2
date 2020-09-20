package by.epam.javatr.dedik.day2.service;

import by.epam.javatr.dedik.day2.validation.NameValidator;

import java.util.Scanner;

public class Hello {
    public void hello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        sayHello(name);
    }

    public void sayHello(String name) {
        NameValidator validator = new NameValidator();
        if (validator.isName(name)) {
            System.out.printf("Hello, %s.", name);
        }
    }
}
