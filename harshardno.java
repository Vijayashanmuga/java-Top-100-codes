import java.util.*;

public class harshardno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;

        }
        if (n % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }

}
