package org.example;

public class CustomFunctionalInterfaces {
    @FunctionalInterface
    interface StringOperation {
        String apply(String str);
    }

    @FunctionalInterface
    interface IntegerOperation {
        int apply(int n);
    }

    public static void main(String[] args) {
        // Reversing a string using recursion
        StringOperation reverse = (str) -> reverseString(str);
        System.out.println("Reversed: " + reverse.apply("Lambda"));

        // Doubling an integer
        IntegerOperation doubleIt = (n) -> n * 2;
        System.out.println("Doubled: " + doubleIt.apply(5));
    }

    private static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
