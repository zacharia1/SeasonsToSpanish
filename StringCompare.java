/**
    This program correctly compares two string objects using the equals method.
*/

public class StringCompare
{
    public static void main(String[] args)
    {
        String name1 = "Abdihafid";   //To hold the first name
        String name2 = "Zacharia" ;   // To hold the second name.
        String name3 = "Zacharia";    // To hold the third name

        // Compare Abdihafid and Zacharia
        if(name1.equals(name2))
        {
            System.out.println(name1 +" and " + name2 + " are the same");
        }
        else
        {
            System.out.println(name1 +" and " + name2 +" are not the same");
        }

        //Compare Zacharia and Zacharia.
        if (name2.equals(name3))
        {
            System.out.println(name2 +" and " + name3 + " are the same");
        }
        else
        {
            System.out.println(name1 +" and " + name2 + " are not the same");
        }
    }

}
