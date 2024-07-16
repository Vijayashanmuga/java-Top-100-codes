package array;

class MedianOfArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int left = 0;
        int right = 0;
        int index = 0;
        int[] nums3 = new int[n + m];

        while (left < n && right < m) {
            if (nums1[left] <= nums2[right]) {
                nums3[index++] = nums1[left++];
            } else {
                nums3[index++] = nums2[right++];
            }
        }

        while (left < n) {
            nums3[index++] = nums1[left++];
        }

        while (right < m) {
            nums3[index++] = nums2[right++];
        }

        int len = nums3.length;
        int med = (nums3[0] + nums3[len - 1]) / 2;
        return med;
        // if (len % 2 == 0) {
        // return (nums3[len / 2 - 1] + nums3[len / 2]) / 2.0;
        // } else {
        // return nums3[len / 2];
        // }
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 3 };
        int nums2[] = { 2 };
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("The median is: " + median);
    }
}
