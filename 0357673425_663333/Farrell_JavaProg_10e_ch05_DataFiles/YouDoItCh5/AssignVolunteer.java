// You Do It Chapter 5.2
// Using an if...else Statement

//Start a new application by entering the following lines of code to create a class named 
// AssignVolunteer. You import the Scanner class so that you can use keyboard input. The class 
// contains a main() method that performs all the work of the class:
import java.util.Scanner;

public class AssignVolunteer {
    public static void main(String[] args) {

// On new lines, declare the variables and constants this application uses. The user will be 
// prompted to enter one of the values stored in the two constants. That value will then be 
// assigned to the integer donationType and compared to the CLOTHING_CODE constant. Then, based 
// on the results of that comparison, the program will assign the value of one of the PRICER 
// constants to the String variable volunteer.
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";

// Define the input device, and then add the code that prompts the user to enter a 1 or 2 for 
// the donation type. Accept the response, and assign it to donationType
        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else... ");
        donationType = input.nextInt();

// Use an if...else statement to choose the name of the volunteer to be assigned to the volunteer 
// String, as follows:
        if(donationType == CLOTHING_CODE) {
            volunteer = CLOTHING_PRICER;
        }
        else {
            volunteer = OTHER_PRICER;
        }

// Display the chosen code and corresponding volunteer’s name
        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);

        input.close();
    }
}
