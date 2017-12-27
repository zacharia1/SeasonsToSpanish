import java.util.Scanner;      // Needed for the Scanner class

/**
    This program demonstrates the nested if statement.
*/

public class LoanQualifier
{
    public static void main(String[] args)
    {
        double annualSalary; // Hold anual salary
        double yearsOnJob;  // Hold number of years in current job

        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Ask the user for their annual salary
        System.out.println("What is your annual salary?");
        annualSalary = keyboard.nextDouble();

        // Ask the user how long they have been in their current job
        System.out.println("How long have you been at you current job?");
        yearsOnJob = keyboard.nextDouble();

        if(annualSalary >= 30000)
        {
            if(yearsOnJob>= 2)
            {
                    System.out.println("You qualify for the loan");
            }
            else
            {
                System.out.println("You must have been at your current job for 2yrs");
            }
        }
        else
        {
            System.out.println("You must earn at least 30k per year");
        }
    }
}
