public class Budget {

    public static void main(String[] args) {
        // Variables Part 1 - Hourly pay
        // double fastFoodWorker = 7.42;
        // double uber = 18.0;
        double graderTa = 11.0;
        // double bankTeller = 12.13;
        // double waiter = 12.47;

        // Variables Part 2 - Monthly Expenses
        double rent = 1452.00;
        double internet = 58.26;
        double groceries = 345.76;
        double leisure = 76.33;

        // Algo Part 1 - Hours worked to afford Monthly Expenses
        double monthlyTotalExpenses = rent + internet + groceries + leisure;
        // Hours needed based on Grader/ TA
        double hoursNeeded = monthlyTotalExpenses / graderTa;



        // Algo Part 2 - Hours worked to save additonal $100
        double hoursToSaveHundred = 100 / graderTa;
        double totalHoursMonth = hoursNeeded + hoursToSaveHundred;

        // Outputs
        System.out.println("Your hourly wage is: " + graderTa);
        System.out.println("Your monthly rent is: " + rent);
        System.out.println("Your monthly internet bill is: " + internet);
        System.out.println("Your monthly grocery bill is: " + groceries);
        System.out.println("Your monthly leisure bill is: " + leisure);
        System.out.println("The total monthly expenses is: " + monthlyTotalExpenses);
        System.out.println("To break even you must work " + hoursNeeded + " hours");
        System.out.println("To save an addiontal $100 you must work " + hoursToSaveHundred + " hours. For a total of " + totalHoursMonth + " hours a month.");
        System.out.println("It can be challeing to afford these things while in college, perhaps it's worth trying to find a higher paying job!");



    }
    
}
