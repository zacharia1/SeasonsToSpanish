import java.util.Scanner;      // Needed for the Scanner class

/**
    This program demonstrates the if-else statement.
*/

public class Division
{
    public static void main(String[] args)
    {
        double number1, number2;
        double quotient;

        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Get the first number
        System.out.println("Enter the first number");
        number1 = keyboard.nextDouble();

        // Get the second number
        System.out.println("Enter the second number");
        number2 = keyboard.nextDouble();

        // Check if the second number is zero
        if(number2 == 0)
        {
            System.out.println("Division by zero is not possible \n" +
                               "Please run the program again and enter\n"+
                                "a number other than zero");
        }
        else
        {
            quotient = number1 / number2;
            System.out.println("The quotient of " + number1 + "divided by "+
                               number2 + " is " + quotient);
        }

    }
}
