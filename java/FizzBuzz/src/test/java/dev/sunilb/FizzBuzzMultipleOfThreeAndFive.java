package dev.sunilb;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class FizzBuzzMultipleOfThreeAndFive {

    @Test(dataProvider = "multipleofthreeandfive")
    public void shouldReturnFizzBuzzForFive(int inputNumber, boolean expectedResults) {
        assertEquals(FizzBuzz.fizzBuzz(inputNumber).equals("FizzBuzz"), expectedResults);
    }

    @DataProvider(name = "multipleofthreeandfive")
    public static Object[][] multipleOfThreeAndFive() {
        return new Object[][]{{15, true}, {30, true}, {45, true}};
    }

}
