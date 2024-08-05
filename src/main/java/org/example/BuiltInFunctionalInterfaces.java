package org.example;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaces {

    public static void main(String[] args) {
        // Predicate: checks if a number is positive
        Predicate<Integer> isPositive = (n) -> n > 0;
        System.out.println("Is 5 positive? " + isPositive.test(5));
        System.out.println("Is -3 positive? " + isPositive.test(-3));

        // Function: converts a string to uppercase
        Function<String, String> toUpperCase = (str) -> str.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.apply("lambda"));

        // Consumer: prints a message
        Consumer<String> printMessage = (msg) -> System.out.println("Message: " + msg);
        printMessage.accept("Hello, Lambda!");

        // Supplier: supplies a random number
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());
    }
}

