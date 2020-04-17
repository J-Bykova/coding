package work_with_array.first_level;

public class Sum2 {
    static int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int result = nums[0] + nums[1];
        return result;
    }
}
