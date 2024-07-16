import java.util.Scanner;

public class abundantno {
    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int ans = sum(n);
        if (ans > n) {
            System.out.println("Abundant number");
        } else {
            System.out.println("Not an abundant number");
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