package leetcode;

public class MaximizeExpressionOfThree {
    public int maximizeExpressionOfThree(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i<nums.length; i++) {
            if (nums[i] > max) {
                max2 = max;
                max = nums[i];
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }

            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return max + max2 - min;
    }
}
