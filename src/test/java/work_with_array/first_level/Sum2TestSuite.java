package work_with_array.first_level;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sum2TestSuite {
    @Test
    public void test1() {
        int[] arr = {};
        int result = 0;
        assertEquals(result, Sum2.sum2(arr));
    }

    @Test
    public void test2() {
        int[] arr = {1};
        int result = 1;
        assertEquals(result, Sum2.sum2(arr));
    }

    @Test
    public void test3() {
        int[] arr = {1, 2, 3};
        int result = 3;
        assertEquals(result, Sum2.sum2(arr));
    }
}
