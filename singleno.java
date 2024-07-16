package Integers;

public class singleno {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1 };
        int ans = single(arr);
        System.out.println(ans);
    }

    // brute force solution
    public static int single(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            // ans = ans ^ arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans++;
                }
                if (ans == 1) {
                    return ans;
                }
            }
            // return -1;
        }
        return -1;
    }

    // Optimal solution
    int getSingle(int arr[], int n) {
        // code here
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}