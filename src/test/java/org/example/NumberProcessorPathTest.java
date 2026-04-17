package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberProcessorPathTest {

    @Test
    void testPathNegativeInput() {
        NumberProcessor processor = new NumberProcessor();
        assertEquals(-1, processor.sumEvenNumbersUpTo(-1));
    }

    @Test
    void testPathZeroInputLoopNotExecuted() {
        NumberProcessor processor = new NumberProcessor();
        assertEquals(0, processor.sumEvenNumbersUpTo(0));
    }

    @Test
    void testPathOnlyOddBranchInsideLoop() {
        NumberProcessor processor = new NumberProcessor();
        assertEquals(0, processor.sumEvenNumbersUpTo(1));
    }

    @Test
    void testPathOddThenEven() {
        NumberProcessor processor = new NumberProcessor();
        assertEquals(2, processor.sumEvenNumbersUpTo(2));
    }

    @Test
    void testPathMultipleIterations() {
        NumberProcessor processor = new NumberProcessor();
        assertEquals(6, processor.sumEvenNumbersUpTo(4));
    }
}