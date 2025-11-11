package leetcode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] merge = new int[m+n];
//        int i = 0;
//        int j = 0;
//
//        for (i=0,j=0; i<m && j<n;) {
//            if (nums1[i] <= nums2[j]) {
//                merge[i+j] = nums1[i];
//                    i++;
//                    if (i >= m)
//                        break;
//            } else {
//                merge[i+j] = nums2[j];
//                    j++;
//            }
//        }
//
//        for (i=i;i<m;i++) {
//            merge[i+j] = nums1[i];
//        }
//        for (j=j;j<n;j++) {
//            merge[i+j] = nums2[j];
//        }
//
//        for (i=0;i<m+n;i++) {
//            nums1[i] = merge[i];
//        }

        int p1 = m - 1;
        int p2 = n - 1;
        int write = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[write--] = nums1[p1--];
            } else {
                nums1[write--] = nums2[p2--];
            }
        }
    }
}
