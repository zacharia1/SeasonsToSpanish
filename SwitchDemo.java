import java.util.Scanner;

/**
    This program demonstrates the switch statement.
*/

public class SwitchDemo
{
    public static void main(String[] args)
    {
        int number; // A number entered by the user

        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 1, 2, or 3");
        number = keyboard.nextInt();

        switch (number)
        {
            case 1:
                System.out.println("You've entered 1");
            break;

            case 2:
                System.out.println("You've entered 2");
            break;

            case 3:
                System.out.println("You've entered 3");
            break;

            default:
                System.out.println("Invalid entenry!");
        }
    }
}
