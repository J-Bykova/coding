package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class FizzString2TestSuite {
    @Test
    public void should_return_string_form_of_number() {
        int inputNum = 1;
        String expectedStr = "1!";
        Assert.assertEquals(expectedStr, FizzString2.fizzString2(inputNum));
    }

    @Test
    public void if_number_is_divisible_by_3_should_return_Fizz() {
        int inputNum = 3;
        String expectedStr = "Fizz!";
        Assert.assertEquals(expectedStr, FizzString2.fizzString2(inputNum));
    }

    @Test
    public void if_number_is_divisible_by_5_should_return_Buzz() {
        int inputNum = 5;
        String expectedStr = "Buzz!";
        Assert.assertEquals(expectedStr, FizzString2.fizzString2(inputNum));
    }

    @Test
    public void if_number_is_divisible_by_3_and_5_should_return_FizzBuzz() {
        int inputNum = 15;
        String expectedStr = "FizzBuzz!";
        Assert.assertEquals(expectedStr, FizzString2.fizzString2(inputNum));
    }
}
