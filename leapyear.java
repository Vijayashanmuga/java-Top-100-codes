//This program is to check the year is leap year or not

import java.util.*;

public class leapyear {
    public static void main(String[] args) {
        int year = 2024;
        if (year % 400 == 0) {
            System.out.println("year is leap year");

        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("year is a leap year");
        } else {
            System.out.println("year is not a leap year");
        }
    }

}
