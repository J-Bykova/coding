package work_with_array;

public class FirstLast6 {
    static boolean firstLast6(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }
}
