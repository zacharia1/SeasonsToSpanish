import java.util.Scanner;     // Needed for the Scanner class
/**
This program asks the user to enter a numeric test score and
displays a letter grade for the score. The program uses nested decision
structures to determine the grade.
*/

public class TestResults
{
    public static void main (String[] args)
    {
        double testScore; // To hold test score

        //Create Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Ask the user to enter a test score
        System.out.println("Enter your test score to get a letter grade");
        testScore = keyboard.nextDouble();

        if(testScore < 60 )
        {
            System.out.println("You have a F!");
        }
        else if (testScore < 70)
        {
            System.out.println("You have a D!");
        }
        else if (testScore < 80)
        {
            System.out.println("You have a C!");
        }
        else if (testScore < 90)
        {
            System.out.println("You have a B!");
        }
        else if (testScore <= 100)
        {
            System.out.println("You have an A");
        }
        else
        {
            System.out.println("Thats invalid test score!");

        }
    }
}
