
import java.util.*;

public class Friendlypair {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sum1:");
        int sum1 = sc.nextInt();
        System.out.println("Enter sum2:");
        int sum2 = sc.nextInt();
        int num1 = sum(sum1);
        int num2 = sum(sum2);
        if (num1 / sum1 == num2 / sum2) {
            System.out.println("Friendly pair");
        } else {
            System.out.println("Not a Friendly pair");
        }

    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}