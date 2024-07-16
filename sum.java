//sum of all the numbers in a given range

package recursion;

public class sum {
    public static void main(String[] args) {
        int ans = sum(10);
        System.out.println(ans);
    }

    static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sum(--n);
    }
}
