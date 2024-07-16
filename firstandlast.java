//this program is to find the first amd last occurance of element of an array
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
package array;

public class firstandlast {
    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        System.out.println(searchRange(nums, target));
    }

    public static int[] searchRange(int[] nums, int target) {
        // List<Integer> list = new ArrayList<>();
        // int arr[] = new int[2];
        // int j = 0;
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] == target) {
        // // list.add(i)
        // arr[j] = i;
        // j++;
        // } else {
        // arr[j] = -1;
        // j++;
        // }
        // }
        // return arr;

        int arr[] = new int[2];
        // int j = 0;
        arr[0] = -1;
        arr[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                arr[1] = i;
            }
        }
        return arr;
    }
}
