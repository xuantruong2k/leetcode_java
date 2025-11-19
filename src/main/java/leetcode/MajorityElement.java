package leetcode;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int candicate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != candicate) {
                count--;
                if (count == 0) {
                    candicate = nums[i];
                    count = 1;
                }
            } else {
                count++;
            }
        }

        return candicate;
    }
}
