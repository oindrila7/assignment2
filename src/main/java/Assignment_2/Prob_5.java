//Take a number as input from the user. Now write a program to show table of the given numbers. Output will be shown like this
//10*1=10
//10*2=20
//10*3=20
//10*10=100

package Assignment_2;
import java.util.Scanner;

public class Prob_5 {
        public static void main(String[]args)
        {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter a number to generate the table: ");
                int num = scan.nextInt();
                for(int i=1; i<=10; i++)
                {
                        System.out.println(num+" * "+i+"="+num*i);
                }
        }

}
