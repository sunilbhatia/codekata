package dev.sunilb;

import org.testng.annotations.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public void shouldThrowRuntimeExceptionForLastElementAsBlank() {
        assertEquals(StringCalculator.add("1,2,"), 3);
    }

    @Test
    public void shouldReturnSumForCustomDelimiter() {
        assertEquals(StringCalculator.add("//;\n1;3"), 4);
//        assertEquals(StringCalculator.add("//|\n1|2|3"), 6); //TODO: Need to figure out a way to solve for regex char seperators
        assertEquals(StringCalculator.add("//sep\n2sep5"), 7);
    }

}
