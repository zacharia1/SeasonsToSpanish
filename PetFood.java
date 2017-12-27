import java.util.Scanner;

/**
    This program demonstrates a switch statement.
*/

public class PetFood
{
    public static void main(String[] args)
    {
        String input;   // To hold the user's input
        char foodGrade; // Grade of pet food

        // Crease a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Ask the user to select grade food
        System.out.println("Our pet food is available in three grades:" +
                            "\nA, B, and C. Which do you want pricing for?");
        input = keyboard.nextLine();
        foodGrade = input.charAt(0);
        switch(foodGrade)
        {
            case 'a':
            case 'A':
                System.out.println("30 Cents per lb");
            break;

            case 'b':
            case 'B':
                System.out.println("20 Cents per lb");
            break;

            case 'c':
            case 'C':
                System.out.println("10 cents per lb");
            break;

            default:
                System.out.println("invalid letter grade!");

        }

    }

}
