// Term Project
// Case Problem
// Sunshine Seashore Supplies
// Ch3
import java.util.Scanner;

public class SunshineRentalPriceWithMethods {

    public static void main(String[] args) {
        int cphr = 40;
        int add = 1;
        double dpm = 0.0167;
        Scanner in = new Scanner(System.in);

        double mins = rentalTime(in);

        motto();
        details(mins, cphr, add, dpm);

    }

    public static int rentalTime(Scanner in) {
        System.out.print("Please enter the rented equipments rental time in minues >> ");
        double mins = in.nextDouble();
        return (int) mins;
    }

    public static void motto() {
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsS");
        System.out.println("Ss                                             Ss");
        System.out.println("Ss  Sunshine Seashore makes it fun in the sun  Ss");
        System.out.println("Ss                                             Ss");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsS");
    }

    public static void details(double mins, int cphr, int add, double dpm) {
        double hrs = mins / 60;
        double over = mins % 60;
        int otime = (int) (over * dpm);

        double total = (hrs * cphr) + (double) (add * otime);

        if (hrs >= 1) {
            System.out.println("Your rental time is: " + (int) hrs + " hours and " + (int) over + " minutes. Your total is: $" + String.format("%.2f", total));
        }
        else {
            System.out.println("Your rental time is: " + mins + " minutes. Your total is: $" + String.format("%.2f", total));
        }
    }
}
