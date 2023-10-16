// You Do It Chapter 5.4
// Using Nested if Statement

// Modify the program to display the entered code, volunteer, and donation type message only when 
// the entered value is 1 or 2, and to display the entered code and an error message otherwise.
import java.util.Scanner;

public class AssignVolunteer3 {
    public static void main(String[] args) {
    
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        String message;

        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else... ");
        donationType = input.nextInt();

        if(donationType == 1 || donationType == 2) {
            if(donationType == CLOTHING_CODE) {
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";

                System.out.println("You entered " + donationType);
                System.out.println("This is " + message);
                System.out.println("The volunteer who will price this item is " + volunteer);
            }
            else {
                volunteer = OTHER_PRICER;
                message = "a non-clothing donation";

                System.out.println("You entered " + donationType);
                System.out.println("This is " + message);
                System.out.println("The volunteer who will price this item is " + volunteer);
            }
        }
        else {
            System.out.println("You've entered an invalid number.");
        }
    
        input.close();
    }
}