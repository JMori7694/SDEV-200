// Term Project
// Case Problem
// Sunshine Seashore Supplies
// Ch2
import java.util.Scanner;

public class SunshineRentalPrice {
    public static void main(String[] args) {
        int cphr = 40;
        int add = 1;
        double dpm = 0.0167;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the rented equipments rental time in minues >> ");
        double mins = in.nextInt();

        double hrs = mins / 60;
        double over = mins % 60;
        int otime = (int) (over * dpm);

        double total = (hrs * cphr) + (double) (add * otime);

        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsS");
        System.out.println("Ss                                             Ss");
        System.out.println("Ss  Sunshine Seashore makes it fun in the sun  Ss");
        System.out.println("Ss                                             Ss");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsS"); 

        if (hrs >= 1) {
            System.out.println("Your rental time is: " + hrs + " hours and " + (int) over + " minutes. Your total is: $" + String.format("%.2f", total));
        }
        else {
            System.out.println("Your rental time is: " + mins + " minutes. Your total is: $" + String.format("%.2f", total));
        }

        in.close();
    }
}
