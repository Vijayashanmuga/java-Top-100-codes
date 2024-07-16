// sum of all the digits in a given number

package recursion;

public class sumofdigit {
    public static void main(String[] args) {
        int ans = sumofdigit(190);
        System.out.println(ans);
    }

    static int sumofdigit(int n) {
        if (n == 0) {
            return n;
        }
        return n % 10 + sumofdigit(n / 10);
    }
}
