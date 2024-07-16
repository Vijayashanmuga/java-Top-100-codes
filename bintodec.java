package BitManipulation;

public class bintodec {
    public static void main(String[] args) {
        int bin = 1111;
        System.out.println(bintodec(bin));
    }

    public static int bintodec(int n) {
        int dec = 0;
        int num = 0;

        while (n > 0) {
            int rev = n % 10;
            dec += rev * Math.pow(2, num);
            n = n / 10;
            num++;
        }

        return dec;
    }
}
