package work_with_functional.first_level;

import java.util.ArrayList;
import java.util.List;

public class Square {
    static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

}
