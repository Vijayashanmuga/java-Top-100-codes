//this code is to find the number is positive or negative

public class posnegno {
    public static void main(String[] args) {
        String ans = posnegno(0);
        System.out.println(ans);
    }

    static String posnegno(int n) {
        if (n > 0) {
            return "positive number";
        } else if (n < 0) {
            return "negative number";
        } else {
            return "zero";
        }
    }
}
