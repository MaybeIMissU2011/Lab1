package org.example;

public class NumberProcessor {

    public int sumEvenNumbersUpTo(int n) {
        if (n < 0) {
            return -1;
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum += 0;
            }
        }

        return sum;
    }
}