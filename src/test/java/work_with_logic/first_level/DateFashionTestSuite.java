package work_with_logic.first_level;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTestSuite {
    @Test
    public void test1() {
        Assert.assertEquals(2, DateFashion.dateFashion(5, 10));
    }

    @Test
    public void test2() {
        Assert.assertEquals(0, DateFashion.dateFashion(2, 5));
    }

    @Test
    public void test3() {
        Assert.assertEquals(1, DateFashion.dateFashion(5, 5));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, DateFashion.dateFashion(0, 2));
    }

    @Test
    public void test5() {
        Assert.assertEquals(1, DateFashion.dateFashion(4, 5));
    }

    @Test
    public void test6() {
        Assert.assertEquals(0, DateFashion.dateFashion(0, 0));
    }
}
