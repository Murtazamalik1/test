package day_6_assignment;
import java.util.Scanner;

public class prime_number {
    public static void main(String[] args)
    {
        int num, count=1;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = s.nextInt();

        for(int i=2; i<num; i++)
        {
            if(num%2 == 1)
            {
                count++;
                break;
            }
        }

        if(count==0)
            System.out.println("\nIt is a Prime Number.");
        else
            System.out.println("\nIt is not a Prime Number.");
    }
}

