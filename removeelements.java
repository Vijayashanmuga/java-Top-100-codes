package array;

import java.util.Arrays;

public class removeelements {
    public static int removeElement(int[] nums, int val) {
        int newarr[] = new int[nums.length];
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                newarr[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
        // return Arrays.toString(newarr);
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        System.out.println(removeElement(nums, val));
        // System.out.println(Arrays.toString());
        // System.out.println(Arrays.toString(Arrays.copyOf(nums, removeElement)));

    }
}
