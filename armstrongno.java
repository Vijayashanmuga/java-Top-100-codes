// import recursion.power;

public class armstrongno {
    public static void main(String[] args) {
        int num = 371;
        int len = len(num);
        // System.out.println(recursion(num, len));
        if (num == recursion(num, len)) {
            System.out.println("Armstrong number");

        } else {
            System.out.println("Not a armstrong number");
        }
    }

    static String armstrong(int num, int len) {
        int sum = 0;
        int temp = num;
        // int digit;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + (int) Math.pow(rem, len);
            temp = temp / 10;
        }
        if (sum == num) {
            return "Armstrong number";
        } else {
            return "Not a armstrong number";
        }
    }

    static int len(int num) {
        int len = 0;
        while (num != 0) {
            // int length;
            len++;
            num = num / 10;

        }
        return len;
    }

    static int recursion(int num, int len) {
        if (num == 0) {
            return 0;

        }
        int rev = num % 10;
        return (int) Math.pow(len, rev) + recursion(num / 10, len);
    }
}