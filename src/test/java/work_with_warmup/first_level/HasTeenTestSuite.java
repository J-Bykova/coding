package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class HasTeenTestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(HasTeen.hasTeen(13, 20, 10));
    }

    @Test
    public void test2() {
        Assert.assertTrue(HasTeen.hasTeen(20, 19, 10));
    }

    @Test
    public void test3() {
        Assert.assertTrue(HasTeen.hasTeen(13, 10, 19));
    }

    @Test
    public void test4() {
        Assert.assertTrue(HasTeen.hasTeen(20, 12, 15));
    }

    @Test
    public void test5() {
        Assert.assertFalse(HasTeen.hasTeen(12, 20, 9));
    }

}
