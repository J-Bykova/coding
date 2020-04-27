package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class FizzStringTestSuite {
    @Test
    public void should_return_Fizz_if_str_starts_with_f() {
        String input = "fig";
        String expected = "Fizz";
        Assert.assertEquals(expected, FizzString.fizzString(input));
    }

    @Test
    public void should_return_Buzz_if_str_ends_with_b() {
        String input = "dib";
        String expected = "Buzz";
        Assert.assertEquals(expected, FizzString.fizzString(input));
    }

    @Test
    public void should_return_FizzBuzz_if_starts_with_f_and_str_ends_with_b() {
        String input = "fib";
        String expected = "FizzBuzz";
        Assert.assertEquals(expected, FizzString.fizzString(input));
    }

    @Test
    public void should_return_str_if_str_does_not_starts_with_f_and_str_ends_with_b() {
        String input = "Hello";
        String expected = "Hello";
        Assert.assertEquals(expected, FizzString.fizzString(input));
    }
}
