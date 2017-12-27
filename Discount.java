/**
    This program calculates the sale price of an item that is
    regularly priced at $59, with a 20 perecent discount subtracted
*/
public class Discount
{
    public static void main(String[] args)
    {
        //variables to hold the regular price, discount, and sale price
        double regularPrice = 59.0;
        double discount;
        double salePrice;

        //Calculate the amout of a 20% discount
        discount = regularPrice * .2;

        //Calculate the sale price by subtracting.
        salePrice = regularPrice - discount;

        // Display the Results.
        System.out.println("Regular price is: " + regularPrice);
        System.out.println("Your discount is: " + discount);
        System.out.println("Sale price is : " + salePrice);

    }

}
