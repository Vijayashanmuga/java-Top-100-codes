public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        // fibo(n);
        for (int i = 0; i < n; i++) {
            System.out.print(recursion(i) + " ");
        }
    }

    static void fibo(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }

    static int recursion(int n) {
        if (n < 2) {
            return n;

        }
        return recursion(n - 1) + recursion(n - 2);
    }
}
