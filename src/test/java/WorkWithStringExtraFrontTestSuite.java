import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorkWithStringExtraFrontTestSuite {
    @Test
    public void test1() {
        assertEquals("", WorkWithString.extraFront(""));
    }

    @Test
    public void test2() {
        assertEquals("HHH", WorkWithString.extraFront("H"));
    }

    @Test
    public void test3() {
        assertEquals("ababab", WorkWithString.extraFront("ab"));
    }

    @Test
    public void test4() {
        assertEquals("HeHeHe", WorkWithString.extraFront("Hello"));
    }

}
