//multiplication of digits in a number using recursion

package recursion;

public class mutiplicationofdig {
    public static void main(String[] args) {
        int ans = muldig(980);
        System.out.println(ans);
    }

    static int muldig(int n) {
        if (n % 10 == n) {
            return n;
        }
        return n % 10 * muldig(n / 10);
    }
}
