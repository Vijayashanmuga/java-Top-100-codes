package array;

public class findsmall {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 4, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(small(arr));
    }

    public static int small(int arr[]) {
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }

}
