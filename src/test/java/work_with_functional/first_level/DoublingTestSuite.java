package work_with_functional.first_level;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DoublingTestSuite {
    @Test
    public void should_double_each_elements_of_List() {
        List<Integer> input = new ArrayList<Integer>();
        input.add(1);
        input.add(2);
        input.add(3);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(4);
        expected.add(6);

        Assert.assertEquals(expected, Doubling.doubling(input));
    }

    @Test
    public void should_accept_negative_elements() {
        List<Integer> input = new ArrayList<Integer>();
        input.add(6);
        input.add(8);
        input.add(-1);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(12);
        expected.add(16);
        expected.add(-2);

        Assert.assertEquals(expected, Doubling.doubling(input));
    }

    @Test
    public void should_return_empty_list_if_got_empty_list() {
        List<Integer> input = new ArrayList<Integer>();
        List<Integer> expected = new ArrayList<Integer>();

        Assert.assertEquals(expected, Doubling.doubling(input));
    }
}
