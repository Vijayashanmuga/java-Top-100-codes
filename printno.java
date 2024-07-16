//this code is to print the number from 1-5

package recursion;

public class printno {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }

        fun(n - 1);
        System.out.println(n);
    }
}
