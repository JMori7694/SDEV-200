// You DO It Chapter 5.7
// Using switch

import java.util.Scanner;

public class AssignVolunteer4 {
    public static void main(String[] args) {
    
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1;
// Keep the declaration CLOTHING_CODE, but replace the OTHER_CODE declaration with three new ones:
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;
// Retain the two pricing volunteer declarations, but add two new ones:
        final String CLOTHING_PRICER = "Regina";
        final String FURNITURE_PRICER = "Wei";
        final String ELECTRONICS_PRICER = "Lydia";
        final String OTHER_PRICER = "Marco";
        String message;

        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
// Replace the output statement that asks the user to enter 1 or 2 with the following simpler statement: 
        System.out.print("Enter an integer... ");
        donationType = input.nextInt();

// Replace the existing if...else statement with the following switch statement:
        switch(donationType) {
            case(CLOTHING_CODE) : {
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
                break;
            }
            case(FURNITURE_CODE) : {
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation";
                break;
            }
            case(ELECTRONICS_CODE) : {
                volunteer = ELECTRONICS_PRICER;
                message = "an electronics donation";
                break;
            }
            case(OTHER_CODE) : {
                volunteer = OTHER_PRICER;
                message = "another donation type";
            }
            default: {
                volunteer = "invalid";
                message = "an invalid donation type";
            }
        }

        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);
    
        input.close();
    }
}
