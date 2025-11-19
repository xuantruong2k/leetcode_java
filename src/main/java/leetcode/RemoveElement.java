package leetcode;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }

//    public int removeElement(int[] nums, int val) {
//        int[] indexArr = new int[nums.length];
//        int k = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                indexArr[k++] = nums[i];
//            }
//        }
//
//        for (int i = 0; i < k; i++) {
//            nums[i] = indexArr[i];
//        }
//
//        return k;
//    }
}
