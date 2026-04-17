package org.example;

public class Main {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();

        int n = 6;
        int result = processor.sumEvenNumbersUpTo(n);

        if (result == -1) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Sum of even numbers from 1 to " + n + " is: " + result);
        }
    }
}