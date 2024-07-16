
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        // factorial(n);
        System.out.println(factorial(n));
    }

    static int factorial(int n) {
        int res = 1;
        int i;
        for (i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
}
