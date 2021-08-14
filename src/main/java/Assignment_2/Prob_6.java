//Write a program to print prime numbers from 2 to n [n is a number that will be taken from user input]

package Assignment_2;
import java.util.Scanner;
public class Prob_6 {
    public static void main(String[]args)
    {
        int i,number=0;
        String allPrimeNumbers="";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the highest limit of prime numbers:");
        int n=scan.nextInt();
        for(i=1; i<=n; i++)
        {
            int c=0;
            for(number =i; number>=1; number--)
            {
                if(i%number==0)
                {
                    c=c+1;
                }
            }
            if (c==2)
            {
                allPrimeNumbers = allPrimeNumbers + i +"";
            }
        }
        System.out.println("Prime numbers from 2 to " + n +" are ");
        System.out.println(allPrimeNumbers);
    }
}
