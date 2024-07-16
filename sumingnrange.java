//this code is to find the sum of numbers in a given range in java
//input:num1=12,num2=15
//output:54

import java.util.*;

public class sumingnrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // System.out.println(usingformula(num1, num2));
        System.out.println(recursion(0, num1, num2));
    }

    static int brute(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum = sum + i;

        }
        return sum;
    }

    static int usingformula(int num1, int num2) {
        return num2 * (num2 + 1) / 2 - num1 * (num1 + 1) / 2 + num1;
    }

    static int recursion(int sum, int num1, int num2) {
        if (num1 > num2)
            return sum;
        return num1 + recursion(sum, num1 + 1, num2);
    }

}
