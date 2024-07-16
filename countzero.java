// this code is to find the number of zeros in the given number

package recursion;

public class countzero {
    public static void main(String[] args) {
        System.out.println(count(9797000));
    }

    public static int count(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int cnt) {
        if (n == 0) {
            return cnt;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, cnt + 1);
        }
        return helper(n / 10, cnt);
    }
}
