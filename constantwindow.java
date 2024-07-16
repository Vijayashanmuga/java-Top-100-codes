package twopointerslidingwindow.java;

public class constantwindow {
    public static void main(String[] args) {
        int arr[] = { -1, 2, 3, 4, 5, -1 };
        int k = 4;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            System.out.println(sum);
        }
    }
}
