import java.util.Scanner;

/**
    This program translates the English names of the seasons into spanish
*/
public class Seasons
{
    public static void main(String[] args)
    {
        String season;  // The seasons
        String input;   // To hold the user's input

        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Ask the user which season they need translation for.
        System.out.println("Which season do you want in spanish?");
        season = keyboard.nextLine();

        // Translate the season to Spanish.
        switch(season)
        {
            case "sprint":
            case "Sprint":
                System.out.println("la primvera");
                break;
            case "summer":
            case "Summer":
                System.out.println("el verano");
            break;

            case "automn":
            case "Automn":
            case "fall":
            case "Fall":
                System.out.println("el otono");
            break;

            case "winter":
            case "Winter":
                System.out.println("el invierno");
            break;

            default:
                System.out.println("Invalid season!");

        }
    }
}
