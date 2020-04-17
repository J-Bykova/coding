package work_with_array.first_level;

public class Fix23 {
    static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            int[] result = {nums[0], 0, nums[2]};
            return result;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            int[] result = {nums[0], nums[1], 0};
            return result;
        }
        return nums;
    }
}
