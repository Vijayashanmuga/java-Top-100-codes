package array;

import java.util.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        // System.out.println(inbuild(arr));
        inbuild(arr);
        // sorting(arr);
        // sorting());
        sorting(arr);
    }

    public static void inbuild(int[] arr) {
        System.out.println("Array after sorting");
        Arrays.sort(arr);
    }

    public static void sorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
