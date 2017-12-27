import javax.swing.JOptionPane;

/**
    This program demonstrates using dialogs with JOptionPane
*/

public class PayRollDialog
{
    public static void main(String[] args)
    {
        String str;
        String name;
        double  payRate;
        int hours;
        double grossPay;

        name = JOptionPane.showInputDialog("Whats your name?");

        // ask the user their hours worked
        str = JOptionPane.showInputDialog("How many hours did you work?");

        hours = Integer.parseInt(str);

        // Ask the user for their pay rate

        str = JOptionPane.showInputDialog("What is your payRate?");

        payRate = Double.parseDouble(str);

        grossPay = payRate * hours;

        JOptionPane.showMessageDialog(null, "Hello " + name + " Your gross pay is "
                                          + grossPay );


        System.exit(0);

    }

}
