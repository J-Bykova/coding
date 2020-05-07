package work_with_functional.first_level;

import java.util.List;

public class Doubling {
    static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }
}
