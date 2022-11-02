package day_6_assignment;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        int num = 1234, reversed = 0;

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);

        //using for loop

        int num1 = 654, rev = 0;

        for(;num != 0; num /= 10)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
        }

        System.out.println("Reversed Number: " + rev);
    }
}
