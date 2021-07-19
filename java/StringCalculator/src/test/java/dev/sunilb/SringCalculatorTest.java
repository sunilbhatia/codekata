package dev.sunilb;

import org.testng.annotations.*;
import static org.testng.Assert.*;

public class SringCalculatorTest {

    @Test
    public void shouldReturnZeroForEmptyString() {
        assertEquals(StringCalculator.add(""), 0);
    }

    @Test
    public void shouldReturnSameNumberForOneParameter() {
        assertEquals(StringCalculator.add("1"), 1);
        assertEquals(StringCalculator.add("2"), 2);
    }

    @Test
    public void shouldReturnSumForTwoParameters() {
        assertEquals(StringCalculator.add("1,2"), 3);
        assertEquals(StringCalculator.add("3,5"), 8);
    }

    @Test
    public void shouldReturnSumForNParameters() {
        assertEquals(StringCalculator.add("1,2,3"), 6);
        assertEquals(StringCalculator.add("3,5,7"), 15);
        assertEquals(StringCalculator.add("   3 , 5 , 7"), 15);
    }

    @Test
    public void shouldReturnSumForNParametersWithNewLineSeperator() {
        assertEquals(StringCalculator.add("1\n2"), 3);
        assertEquals(StringCalculator.add("3\n5"), 8);
        assertEquals(StringCalculator.add("2,\n3"), 5);
    }

    @Test (expectedExceptions = RuntimeException.class)
    public void showThrowRuntimeExceptionForLastElementAsBlank() {
        assertEquals(StringCalculator.add("1,2,"), 3);
    }

}