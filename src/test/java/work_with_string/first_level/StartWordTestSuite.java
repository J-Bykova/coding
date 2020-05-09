package work_with_string.first_level;

import org.junit.Assert;
import org.junit.Test;

public class StartWordTestSuite {

    @Test
    public void test6() {
        String firstStr = "";
        String secondStr = "h";
        String expectedStr = "";
        Assert.assertEquals(expectedStr, StartWord.startWord(firstStr, secondStr));
    }

    @Test
    public void test1() {
        String firstStr = "hippo";
        String secondStr = "hi";
        String expectedStr = "hi";
        Assert.assertEquals(expectedStr, StartWord.startWord(firstStr, secondStr));
    }

    @Test
    public void test2() {
        String firstStr = "hippo";
        String secondStr = "xip";
        String expectedStr = "hip";
        Assert.assertEquals(expectedStr, StartWord.startWord(firstStr, secondStr));
    }

    @Test
    public void test3() {
        String firstStr = "hippo";
        String secondStr = "i";
        String expectedStr = "h";
        Assert.assertEquals(expectedStr, StartWord.startWord(firstStr, secondStr));
    }

    @Test
    public void test4() {
        String firstStr = "hippo";
        String secondStr = "hello";
        String expectedStr = "";
        Assert.assertEquals(expectedStr, StartWord.startWord(firstStr, secondStr));
    }
}
