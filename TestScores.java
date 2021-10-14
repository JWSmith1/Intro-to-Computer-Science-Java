import java.util.Scanner;

/*
    Enter you pseudocode here
    Ask user to enter test scores
    Scan for next double inputted by user
    add up test scores and divide by 3 to calculate average test score grade
    if test score >= 90 output score and letter grade A
    else if test score >= 80 output score and letter grade B
    else if test score >= 70 output score and letter grade C
    else if test score >= 60 output score and letter grade D
    else test score < 60 output score and letter grade F
*/

public class TestScores {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       double testScore1 = scnr.nextDouble();
       double testScore2 = scnr.nextDouble();
       double testScore3 = scnr.nextDouble();

       double avgTestScore = (testScore1 + testScore2 + testScore3) / 3.0;

       if (avgTestScore >= 90)
       {
           System.out.println("Your average test score is: " + avgTestScore);
           System.out.println("You earned a A!");
       }
       else if (avgTestScore >= 80)
       {
           System.out.println("Your average test score is: " + avgTestScore);
           System.out.println("You earned a B!");
       }
       else if (avgTestScore >= 70)
       {
           System.out.println("Your average test score is: " + avgTestScore);
           System.out.println("You earned a C!");
       }
       else if (avgTestScore >= 60)
       {
           System.out.println("Your average test score is: " + avgTestScore);
           System.out.println("You earned a D!");
       }
       else if (avgTestScore < 60)
       {
           System.out.println("Your average test score is: " + avgTestScore);
           System.out.println("You earned a F!");
       }


       

       

    }

}
