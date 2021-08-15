//Create a math quiz program. Scenario: 2 numbers will generate randomly and prompt user to input the summation of 2 numbers.
//If user inputs the correct summation, print "Answer is correct" and user will get 1 point.
//if user inputs wrong summation,  then user will get 0 point.
//Finally after 5 iteration, total score will be shown.


package Assignment_2;

import java.util.Scanner;
public class Prob_3 {
    public static void main(String[] args) {
        int iteration=5;
        int min = 10;
        int max = 99;

        int count = 1, score = 0;
        while (count <= 5)
        {
            double rand1 = Math.random() * (max - min) + min;
            double rand2 = Math.random() * (max - min) + min;
            int num1 = (int) rand1;
            int num2 = (int) rand2;
            System.out.println("Question "+count+":\nWhat is the sum of " + num1 + " and " + num2 + "?");

            Scanner scanner = new Scanner(System.in);
            int sum = scanner.nextInt();

            if (num1 + num2 == sum) {
                System.out.printf("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong");
            }
            count++;
        }
        System.out.println("Quiz end! your total score is "+score+" out of "+iteration);
    }
}