package work_with_functional.first_level;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SquareTestSuite {
    @Test
    public void where_each_integer_is_multiplied_with_itself() {
        List<Integer> input = new ArrayList<Integer>();
        input.add(1);
        input.add(2);
        input.add(3);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(4);
        expected.add(9);

        Assert.assertEquals(expected, Square.square(input));
    }

    @Test
    public void where_negative_integer_is_multiplied_with_itself() {
        List<Integer> input = new ArrayList<Integer>();
        input.add(-6);
        input.add(-8);
        input.add(-3);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(36);
        expected.add(64);
        expected.add(9);

        Assert.assertEquals(expected, Square.square(input));
    }

    @Test
    public void should_return_empty_list_if_got_empty_list() {
        List<Integer> input = new ArrayList<Integer>();
        List<Integer> expected = new ArrayList<Integer>();

        Assert.assertEquals(expected, Square.square(input));
    }
}

