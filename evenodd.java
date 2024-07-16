
//this code is to find the no. is odd or even
import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nunmber");
        int num = sc.nextInt();
        String ans = evenorodd(num);
        System.out.println(ans);

    }

    static String evenorodd(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
