package dev.sunilb;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FizzBuzzTest {

    @Test(dataProvider = "multipleofthree")
    public void shouldReturnFizzForThree(int inputNumber, boolean expectedResults) {
        assertEquals(FizzBuzz.fizzBuzz(inputNumber).equals("Fizz"), expectedResults);
    }

    @DataProvider(name = "multipleofthree")
    public static Object[][] multipleOfThree() {
        return new Object[][] {{3, true}, {6, true}, {111, true}};
    }

}
