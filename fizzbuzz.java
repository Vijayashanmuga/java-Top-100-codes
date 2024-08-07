package Integers;

import java.util.ArrayList;
import java.util.List;

public class fizzbuzz {
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = fizzBuzz(n);
        System.out.println(ans);
    }

    private static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}
