package work_with_array.second_level;

public class CountEvens {
    static int countEvens(int[] nums) {
        int countNums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
               countNums++;
            }
        }
        return countNums;
    }
}
