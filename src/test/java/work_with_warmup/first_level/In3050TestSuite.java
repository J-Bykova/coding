package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class In3050TestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(In3050.in3050(30, 40));
    }

    @Test
    public void test2() {
        Assert.assertTrue(In3050.in3050(40, 50));
    }

    @Test
    public void test3() {
        Assert.assertFalse(In3050.in3050(30, 41));
    }

    @Test
    public void test4() {
        Assert.assertFalse(In3050.in3050(39, 41));
    }

    @Test
    public void test5() {
        Assert.assertFalse(In3050.in3050(29, 30));
    }

    @Test
    public void test6() {
        Assert.assertFalse(In3050.in3050(29, 30));
    }
}
