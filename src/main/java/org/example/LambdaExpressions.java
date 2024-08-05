package org.example;

public class LambdaExpressions {
    @FunctionalInterface
    interface ArithmeticOperation {
        double operate(double a, double b);
    }

    public static void main(String[] args) {
        // Addition
        ArithmeticOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(5, 3));

        // Subtraction
        ArithmeticOperation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.operate(5, 3));

        // Multiplication
        ArithmeticOperation multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.operate(5, 3));

        // Division
        ArithmeticOperation division = (a, b) -> a / b;
        System.out.println("Division: " + division.operate(5, 3));
    }
}
