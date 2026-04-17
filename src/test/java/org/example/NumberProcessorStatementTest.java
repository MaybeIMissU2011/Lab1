package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberProcessorStatementTest {

    @Test
    void testNegativeInput() {
        NumberProcessor processor = new NumberProcessor();
        assertEquals(-1, processor.sumEvenNumbersUpTo(-3));
    }

    @Test
    void testPositiveInputCoversLoopAndBothBranches() {
        NumberProcessor processor = new NumberProcessor();
        assertEquals(6, processor.sumEvenNumbersUpTo(4)); // 2 + 4 = 6
    }
}