// linear search using recursion

package recursion;

import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {
        int arr[] = { 40, 50, 80, 70, 50, 60, 90, 90, 90, 90 };
        findallindex(arr, 50, 0);
        System.out.println(list);
    }

    static boolean linearsearch(int arr[], int target, int index) {

        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || linearsearch(arr, target, index + 1);
    }

    static int linearsearchindex(int arr[], int target, int index) {

        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return linearsearchindex(arr, target, index + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findallindex(int arr[], int taget, int index) {
        if (index == arr.length) {
            System.out.println(-1);
        }
        if (arr[index] == taget) {
            list.add(index);
        } else {
            findallindex(arr, taget, index + 1);
        }
    }
}
