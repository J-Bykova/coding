package work_with_array.first_level;

public class SwapEnds {
    static int[] swapEnds(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int term = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = term;
        return nums;
    }
}
