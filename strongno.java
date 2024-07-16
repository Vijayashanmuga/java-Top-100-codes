import java.util.*;

public class strongno {
    public static boolean main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = sum(n);
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static int fact(int n) {
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }

    public static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + fact(n % 10);
            n = n / 10;
        }
        return sum;
    }
}
