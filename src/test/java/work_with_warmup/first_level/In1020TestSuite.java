package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class In1020TestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(In1020.in1020(10, 20));
    }

    @Test
    public void test2() {
        Assert.assertTrue(In1020.in1020(11, 99));
    }

    @Test
    public void test3() {
        Assert.assertTrue(In1020.in1020(9, 19));
    }

    @Test
    public void test4() {
        Assert.assertFalse(In1020.in1020(9, 21));
    }

}
