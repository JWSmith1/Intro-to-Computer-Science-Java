import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Ask user to input time in seconds
        System.out.println("Please enter a time in seconds:");
        int seconds = scnr.nextInt();

        // Call methods to run with user input

        showDecaseconds(seconds);
        showJiffies(seconds);
        showNewYorkMinutes(seconds);
        showNanoCenturies(seconds);
        showScaramuccis(seconds);

    }

    // Code for each Conversion, featuring a output description, the algorithm to convert, and the seconds converted output

    public static void showDecaseconds(int seconds) {
        System.out.println("A decasecond is equal to 10 seconds!");
        // Seconds Divided by 10
        int decasecond = seconds / 10;
        System.out.println("Your seconds inputted is: " + decasecond + " decaseconds");

        
    }

    public static void showJiffies(int seconds) {
        System.out.println("A jiffy is a unit of time used in computer operating systems. It is 10 milliseconds.");
        // Convert to milliseconds and divide by 10
        int jiffies = (seconds * 1000) / 10;
        System.out.println("Your seconds inputted is: " + jiffies + " jiffies!");
    }

    public static void showNewYorkMinutes(int seconds) {
        System.out.println("A New York minute is the period of time between the traffice lights turning green and the cab behind one honking. It is 1/20th of 1 second.");
        // Seconds times 1/20th of 1 second or .05
        double newYorkMinute = seconds * .05;
        System.out.println("Your seconds inputted is: " + newYorkMinute + " New York Minutes");

    }

    public static void showNanoCenturies(int seconds) {
        System.out.println("A nanocentury is a computing measurement coined from the expression - 'never to let the user wait more than a few nanocenturies for a response'. It is 3.156 seconds");
        // Seconds divided by 3.156
        double nanoCentury = seconds / 3.156;
        System.out.println("Your seconds inputted is: " + nanoCentury + " nanocenturies.");

    }

    public static void showScaramuccis(int seconds) {
        System.out.println("A scaramucci is the tenure of White House Communications Director Anthony Scaramucci under President Trump. It is 11 days.");
        // Convert Scaramuccis to seconds, divide inputed seconds by converted Scaramuccis
        double scaramucciInSeconds = 11 * 86400;
        double secondsToScarmuccis = seconds / scaramucciInSeconds;
        System.out.println("Your seconds inputted is: " + secondsToScarmuccis + " Scaramuccis.");
    }




}
