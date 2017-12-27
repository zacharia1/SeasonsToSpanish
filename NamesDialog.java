import javax.swing.JOptionPane;

/**
    This class demonstrates using dialogs with JOptionPane.
*/

public class NamesDialog
{
    public static void main(String[] args)
    {
        String firstName;  // To hold first name
        String middleName; // to hold middle name
        String lastName;   // To hold Last name

        //Prompt the user to enter their first name
        firstName = JOptionPane.showInputDialog("What is your first name?");

        //Prompt the user to enter their fmiddle name
        middleName = JOptionPane.showInputDialog("What is your middle name?");

        ////Prompt the user to enter their last name
        lastName = JOptionPane.showInputDialog("What is your last name?");

        // Display a greeting
        JOptionPane.showMessageDialog(null, "Hello " + firstName +" "+ middleName
                                    +" "+ lastName );

        //Exit
        System.exit(0);

    }

}
