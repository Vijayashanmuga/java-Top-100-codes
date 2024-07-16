import java.util.*;

public class automorphicno {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int m = n * n;
        if (n % 10 == m % 10) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not an automorphic number");
        }
    }
}
