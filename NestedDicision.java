import java.util.Scanner;   //Needed for the Scanner class

/**
    This program asks the user to enter a numeric test score and
    displays a letter grade for the score. The program uses nested decision
    structures to determine the grade.
*/

public class NestedDicision
{
    public static void main(String[] args)
    {
        double testScore;   // Hold entered test score

        //Create Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Ask the user to enter a test score
        System.out.println("Enter your test score to get a  letter grade");
        testScore = keyboard.nextDouble();

        if(testScore < 60)
        {
            System.out.println("You got an F!");
        }
        else
        {
            if(testScore < 70)
            {
                System.out.println("You got a D!");
            }
            else
            {
                if(testScore < 80)
                {
                    System.out.println("You got a C!");
                }
                else
                {
                    if(testScore < 90)
                    {
                        System.out.println("You got a B!");
                    }
                    else
                    {
                        System.out.println("You got a A!");
                    }
                }
            }
        }

    }
}
