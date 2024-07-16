// print the number reverse 5-1 using recursion

package recursion;

public class reverse {
    public static void main(String[] args) {
        reverse(7874879);
        System.out.println(sum);
    }

    static int sum = 0;

    static void reverse(int n) {

        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }

}
