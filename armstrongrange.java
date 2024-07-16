import java.util.*;

public class armstrongrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        armstrong(num1, num2);
    }

    static void armstrong(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            int sum = 0;
            int temp = i;
            int len = length(i);

            while (temp != 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, len);
                temp /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Print a newline after the Armstrong numbers are printed
    }

    static int length(int num) {
        int len = 0;
        while (num != 0) {
            len++;
            num /= 10;
        }
        return len;
    }
}
