//Write a program that takes a year from user and print whether that year is a leap year or not-

package Assignment_2;
import java.util.Scanner;

public class Prob_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year to check weather it's a leap year or not:");
        int year = input.nextInt();

        boolean isLeapYear = falnse;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
            else
            isLeapYear = false;
        }
            else
            isLeapYear = true;
    }
      else
           isLeapYear =false;
        if(isLeapYear)
              System.out.println("Yes! " +year+ " is a leap year. ");
          else
              System.out.println("No! " +year+ " is not a leap year. ");
   }
}

