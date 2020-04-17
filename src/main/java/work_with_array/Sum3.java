package work_with_array;

public class Sum3 {
    static int sum3(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];
        }
        return result;
    }
}
