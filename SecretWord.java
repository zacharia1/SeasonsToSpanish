import java.util.Scanner;

/**
    This program demonstrates a case insensitive string comparison.
*/

public class SecretWord
{
    public static void main(String[] args)
    {
        String secretWord;  // To hold the secret word

        // Create Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Ask the user to enter they secret word
        System.out.println("Enter the secret word:");
        secretWord = keyboard.nextLine();

        if(secretWord.equalsIgnoreCase("Prosperso"))
        {
            System.out.println("Congratulations! you know the secret word!");
        }
        else
        {
            System.out.println("Sorry, that is NOT the secret word!");
        }

    }
}
