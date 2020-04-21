package work_with_functional.first_level;

import java.util.ArrayList;
import java.util.List;

public class Square {
    static List<Integer> square(List<Integer> nums) {
        List<Integer> multipliedWithItselfNum = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            int multipliedItselfNum = nums.get(i);
            multipliedWithItselfNum.add(multipliedItselfNum * multipliedItselfNum);
        }
        return multipliedWithItselfNum;
    }

}
