//Write a program to calculate CGPA and find grade from 4 subjects (GPA will base upon your university)

package Assignment_2;

import java.util.Scanner;
import java.lang.Math;
public class Prob_2 {
public static void main(String[]args)
        {
            int subjects=4, i;
            float totalMarks = 0, percentage, average;
            Scanner scanner;
            scanner = new Scanner(System.in);
            System.out.println("CGPA Calculator(Grade Based On American International University-Bangladesh(AIUB))\n ");
            System.out.println("Enter Marks of 4 Subjects");
            for(i = 0; i< subjects; i++){
                totalMarks+=scanner.nextInt();
            }
            percentage = Math.round((totalMarks / (subjects * 100)) * 100);
            if(percentage>= 50 && percentage < 60){
                System.out.println("Your Grade is D");
            }
            else if(percentage >= 60 && percentage< 65){
                System.out.println("Your Grade is D+");
            }
            else if(percentage >= 65 && percentage< 70){
                System.out.println("Your Grade is C");
            }
            else if(percentage >= 70 && percentage< 75){
                System.out.println("Your Grade is C+");
            }
            else if(percentage >= 75 && percentage< 80){
                System.out.println("Your Grade is B");
            }
            else if(percentage >= 80 && percentage< 85){
                System.out.println("Your Grade is B+");
            }
            else if(percentage >= 85 && percentage< 90){
                System.out.println("Your Grade is A");
            }
            else if(percentage >= 90 && percentage< 100){
                System.out.println("Your Grade is A+");
            }
            else{
                System.out.println("Your Grade is F");
            }
        }
}
