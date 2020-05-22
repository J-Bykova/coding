package work_with_warmup.second_level;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTestSuite {
    @Test
    public void test1() {
        String inputStr = "";
        int inputNum = 4;
        String expected = "";
        Assert.assertEquals(expected, FrontTimes.frontTimes(inputStr, inputNum));
    }

    @Test
    public void test2() {
        String inputStr = "A";
        int inputNum = 4;
        String expected = "AAAA";
        Assert.assertEquals(expected, FrontTimes.frontTimes(inputStr, inputNum));
    }

    @Test
    public void test3() {
        String inputStr = "Abc";
        int inputNum = 0;
        String expected = "";
        Assert.assertEquals(expected, FrontTimes.frontTimes(inputStr, inputNum));
    }

    @Test
    public void test4() {
        String inputStr = "Ab";
        int inputNum = 5;
        String expected = "AbAbAbAbAb";
        Assert.assertEquals(expected, FrontTimes.frontTimes(inputStr, inputNum));
    }

    @Test
    public void test5() {
        String inputStr = "";
        int inputNum = 0;
        String expected = "";
        Assert.assertEquals(expected, FrontTimes.frontTimes(inputStr, inputNum));
    }
}
