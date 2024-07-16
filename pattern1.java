package pattern;

import java.util.Scanner;

/**
 * pattern1
 */
public class pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col");
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int j = 1; j <= col; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}