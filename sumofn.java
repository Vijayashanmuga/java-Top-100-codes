//this program is to find the sum of n natural numbers

import java.util.*;

public class sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(usingrecursion(num));
        // int sum = 0;

    }

    static int brute(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }

    static int usingformula(int num) {
        return num * (num + 1) / 2;
    }

    static int usingrecursion(int num) {
        if (num == 0)
            return num;
        return num + usingformula(num - 1);
    }
}
