//this code is to check the number is palindrome or not

package recursion;

public class palindrome {
    public static void main(String[] args) {
        int num = 787487;
        int reversed = reverse(num); // Call reverse and get the reversed number
        // System.out.println(reversed);

        if (reversed == num) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    // Recursive function to reverse a number
    static int reverse(int n) {
        return reverseHelper(n, 0); // Call helper function with initial reversed number as 0
    }

    // Helper function to reverse the number recursively
    static int reverseHelper(int n, int reversed) {
        if (n == 0) {
            return reversed; // Base case: if n is 0, return the reversed number
        }

        int rem = n % 10; // Extract the last digit
        reversed = reversed * 10 + rem; // Append the last digit to reversed

        return reverseHelper(n / 10, reversed); // Recur with remaining digits and updated reversed number
    }
}
