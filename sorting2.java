//this program is to sort the first half of the array in ascending order and the second half in descending order
package array;

import java.util.Arrays;

public class sorting2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        sorting(arr);
    }

    public static void sorting(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(arr[i]);
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// }
