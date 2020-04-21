package work_with_functional.first_level;

import java.util.ArrayList;
import java.util.List;

public class Doubling {
    static List<Integer> doubling(List<Integer> nums) {
        List<Integer> multipliedNums = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            int multipliedNum = nums.get(i) * 2;
            multipliedNums.add(multipliedNum);
        }
        return multipliedNums;
    }
}
