package work_with_array;

public class SumArr {
    static int sumArr(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];

        }
        return result;
    }
}
