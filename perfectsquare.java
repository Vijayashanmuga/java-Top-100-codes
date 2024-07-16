import java.util.*;

public class perfectsquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int squareroot = (int) Math.sqrt(n);
        if (squareroot * squareroot == n) {
            System.out.println("Perfect square");
        } else {
            System.out.println("Not a perfect square");
        }
    }
}
