// You Do It Chapter 5.3
// Using Multiple Statements in if and else Clauses

import java.util.Scanner;

public class AssignVolunteer2 {
    public static void main(String[] args) {
    
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
// Add a String to the list of variables. This String will be assigned a message that displays 
// the donation type:
        String message;

        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else... ");
        donationType = input.nextInt();

// In place of the existing if...else statement in the program, insert the following statement that 
// takes two blocked actions for each donation type. It assigns a volunteer and a value to the 
// message String.
        if(donationType == CLOTHING_CODE) {
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
        }
        else {
            volunteer = OTHER_PRICER;
            message = "a non-clothing donation";
        }

        System.out.println("You entered " + donationType);
// Following the output statement that displays the donation type, add the following statement 
// that displays the assigned message:
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is " + volunteer);
    
        input.close();
    }
}
