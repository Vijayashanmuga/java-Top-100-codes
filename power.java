//finding the power of the number using recursion

package recursion;

public class power {
    public static void main(String[] args) {
        int ans = power(5, 3);
        System.out.println(ans);

    }

    static int power(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * power(base, power - 1);
    }
}
