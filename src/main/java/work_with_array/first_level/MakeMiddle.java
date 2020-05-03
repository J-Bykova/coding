package work_with_array.first_level;

public class MakeMiddle {
    static int[] makeMiddle(int[] nums) {
        int[] middleArr = new int[2];
        if (nums.length > 1) {
            middleArr[0] = nums[nums.length / 2 - 1];
            middleArr[1] = nums[nums.length / 2];
            return middleArr;
        }
        return nums;
    }
}
