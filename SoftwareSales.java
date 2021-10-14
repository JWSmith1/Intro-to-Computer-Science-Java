import java.util.Scanner;
/*
    Enter you pseudocode here
    Initialize scanner
    Set cost per package variable to 99
    Ask user to input number of packages to purchase
    Cost to purchase = 99 * number of packages
    if >= 10, display orginal cost and discounted cost at a 20% discount
    if >= 20,display orginal and discounted cost at a 30% discount
    if >= 50, display orginal and discounted cost at 40%
    if >= 100, display orginal and discounted cost at 50%
    if <= 10, No discount, display orginal cost only

    You calcuate discount by taking the orginal cost times the percantage off, then subtract that number from the orginal, this algo is displayed in each if statement.
    
*/
public class SoftwareSales {
   public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);

       double costPerPackage = 99.0;
       System.out.println("Please enter the number of packages you would like to purchase: ");
       int packageToPurchase = scnr.nextInt();

       double costToPurchase = costPerPackage * packageToPurchase;

       if (packageToPurchase >= 10)
       {
           System.out.println("Your orginial cost is: " + costToPurchase);
           double discount = costToPurchase * .20;
           double discountCost = costToPurchase - discount;
           System.out.println("Your discounted cost is: " + discountCost);
       }
       else if (packageToPurchase >= 20)
       {
        System.out.println("Your orginial cost is: " + costToPurchase);
        double discount = costToPurchase * .30;
        double discountCost = costToPurchase - discount;
        System.out.println("Your discounted cost is: " + discountCost);

       }
       else if (packageToPurchase >= 50)
       {
        System.out.println("Your orginial cost is: " + costToPurchase);
        double discount = costToPurchase * .40;
        double discountCost = costToPurchase - discount;
        System.out.println("Your discounted cost is: " + discountCost);
       }
       else if (packageToPurchase >= 100)
       {
        System.out.println("Your orginial cost is: " + costToPurchase);
        double discount = costToPurchase * .50;
        double discountCost = costToPurchase - discount;
        System.out.println("Your discounted cost is: " + discountCost);
       }
       else if (packageToPurchase <= 10)
       {
           System.out.println("No discount. The cost to purcahse is: " + costPerPackage);
       }



    

    }

}
