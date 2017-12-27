import java.util.Scanner;    // Needed for the scanner class
/**
    This program demonstrates the Scanner class
*/
public class PayRoll
{
    public static void main(String[] args)
    {
        String name;     // To hold a name
        int hours;       // Hours worked
        double payRate;  // Hourly pay rate
        double grossPay; // Gross pay
        char letter;     //Get the character

        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Ask the user for their name
        System.out.println("Whats your name?");
        name = keyboard.nextLine();

        // Ask the user for their total work Hours
        System.out.println("How many hours did you work this week?");
        hours = keyboard.nextInt();

        //Ask the user for their pay rate
        System.out.println("Whats your hourly payRate?");
        payRate = keyboard.nextDouble();

        //Calculate the gross pay
        grossPay = hours * payRate;

        //Display the Results
        System.out.println("Hello " + name + ",\nYour gross pay is $" + grossPay);
        //*****Only works with Strings not primitive data types.****
        letter = name.charAt(1);

        System.out.println(letter);
    }

}
