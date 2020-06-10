package work_with_array.second_level;

public class BigDiff {
    static int bigDiff(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int minNum = nums[0];
        int maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minNum) {
                minNum = nums[i];
            }
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }

        }
        return maxNum - minNum;
    }
}
