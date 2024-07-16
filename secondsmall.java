package array;

public class secondsmall {
    public static void main(String[] args) {
        int arr[] = {
                10, 5, 4, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1 };
        System.out.println(secondsmall(arr));
    }

    public static int secondsmall(int arr[]) {
        int first = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                sec = first;
                first = arr[i];

            } else if (arr[i] < sec) {
                sec = arr[i];
            }

        }
        return sec;
    }
}
