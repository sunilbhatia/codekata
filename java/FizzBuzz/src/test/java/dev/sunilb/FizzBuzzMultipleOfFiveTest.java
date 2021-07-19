package dev.sunilb;

import org.testng.annotations.*;
import static org.testng.Assert.assertEquals;

public class FizzBuzzMultipleOfFiveTest {

    @Test(dataProvider = "multipleoffive")
    public void shouldReturnBuzzForFive(int inputNumber, boolean expectedResults) {
        assertEquals(FizzBuzz.fizzBuzz(inputNumber).equals("Buzz"), expectedResults);
    }

    @DataProvider(name = "multipleoffive")
    public static Object[][] multipleOfFive() {
        return new Object[][] {{5, true}, {10, true}, {110, true}};
    }

}
