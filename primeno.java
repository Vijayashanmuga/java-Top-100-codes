//This program is to fine that the given number is prime number or not

public class primeno {
    public static void main(String[] args) {
        prime2(13);

    }

    static void prime2(int n) {
        if (n < 2) {
            System.out.println("Not a prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
    static void primenobrute(int n) {
        int cnt = 0;
        if (n < 2)
            System.out.println("Not a prime number");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                cnt += 1;

            }

        }
        if (cnt > 2) {
            System.out.println("Not a prime number");
        } else {
            System.out.println("prime number");
        }
    }
}
