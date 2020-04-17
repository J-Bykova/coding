package work_with_array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Sum3TestSuite {
    @Test
    public void test1() {
        int[] arr = {};
        int result = 0;
        assertEquals(result, SumArr.sumArr(arr));
    }

    @Test
    public void test2() {
        int[] arr = {1, 2, 3};
        int result = 6;
        assertEquals(result, SumArr.sumArr(arr));
    }
}
