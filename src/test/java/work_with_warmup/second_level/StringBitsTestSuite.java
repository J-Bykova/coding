package work_with_warmup.second_level;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals("Hlo", StringBits.stringBits("Hello"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("H", StringBits.stringBits("Hi"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("Hello", StringBits.stringBits("Heeololeo"));
    }

    @Test
    public void test4() {
        Assert.assertEquals("", StringBits.stringBits(""));
    }

    @Test
    public void test5() {
        Assert.assertEquals("HloKte", StringBits.stringBits("Hello Kitten"));
    }
}
