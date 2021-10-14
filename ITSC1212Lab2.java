public class ITSC1212Lab2 {
    
    public static void main(String[] args) {
        /*
        int x = 0;
        int y = 2000;
        int z = 100000;

        char a = 'a';
        char b = 'b';

        boolean boo = true;

        System.out.println(x + y + z);
        System.out.println(a + b);
        System.out.println(x < y);
        System.out.println(y > z);
        System.out.println(z < a);
        */

        // Part B

        /*
 
        int ex = (int) 4.0;
        System.err.println(ex);

        double x = 8.8;
        double y = 2.2;

        System.out.println(x / y);
        System.out.println(x / (int) y);
        System.out.println( (int) x / y);
        System.out.println((int) (x / y));

        */

        /*

        double cost = 10.10;
        double paid = 12.33;
        double change =  ((paid - cost) * 100) / 100;
        System.out.println("The change owed on this transaction is: " + change);

        */

        // Part C

        /*

        int totalDays = 62;
        int weeks = totalDays / 7;
        int remainderDays = totalDays % 7;

        System.out.println("In " + totalDays + " days there are " + weeks + " weeks and " + remainderDays + " days.");

        */

        int totalDays1 = 120000;
        int years = totalDays1 / 365;
        int weeks1 = totalDays1 % years;
        int days = weeks1 % 7;

        System.out.println("Number of total days: " + totalDays1);
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks1);
        System.out.println("Days: " + days);










        




    }
}