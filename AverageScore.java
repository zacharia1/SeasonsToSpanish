import javax.swing.JOptionPane;

/**
    This program demonstrates the if statement
*/

public class AverageScore
{
    public static void main(String[] args)
    {
        double score1;
        double score2;
        double score3;
        double average;
        String input;

        // Get the first test score
        input = JOptionPane.showInputDialog("What is the first test score?");

        score1 = Double.parseDouble(input);

        // Get the secore test score
        input = JOptionPane.showInputDialog("What is the second test score?");

        score2 = Double.parseDouble(input);

        // Get the third test score
        input = JOptionPane.showInputDialog("what is the third test score?");

        score3 = Double.parseDouble(input);

        // Calculate the Average score
        average = (score1 + score2 + score3) / 3;

        // Determine if the student received a score higher thane 95

        if(average >= 95)
        {
            JOptionPane.showMessageDialog(null,"Congratulations for averaging " + average +
            "%");
        }
        else
        JOptionPane.showMessageDialog(null, "BOOOO Study harder for that ocean house and heaven In Shaa Allah");

        System.exit(0);
    }
}
