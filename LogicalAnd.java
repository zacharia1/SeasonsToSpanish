import java.util.Scanner;

/**
    This program demonstrates the logical && operator.
*/

public class LogicalAnd
{
    public static void main(String[] args)
    {
        double annualSalary;
        double yearsOnJob;

        //Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Ask the user for their annual income
        System.out.println("Whats your annual income?");
        annualSalary = keyboard.nextDouble();

        //Ask the user for how long they've been at their current job.
        System.out.println("How long have been at your current job?");
        yearsOnJob = keyboard.nextDouble();

        if(annualSalary >= 30000 && yearsOnJob >= 2)
        {
            System.out.println("You qualify for the loan!");
        }
        else
        {
        System.out.println("You don't qualify for the Loan!");
        }


    }
}
