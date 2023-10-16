// You Do It Chapter 6.2
// Writing a Loop to Validate Data Entries

import java.util.*;

public class CustomerSurvey {
    public static void main (String[] args) {
// Declare a variable to hold the consumer’s rating. Also declare constants for the lowest and 
// highest ratings (1 and 5) and a Scanner input object.
        int rating;
        final int MIN = 1;
        final int MAX = 5;
        Scanner input = new Scanner(System.in);

// Add a series of nine output statements that explain the rating system and prompt the user
        System.out.println("Please inter a value that");
        System.out.println("represents yout satisfaction with");
        System.out.println("out service.");
        System.out.println("Enter a value between " + MIN);
        System.out.println("and " + MAX);
        System.out.println("with " + MAX + " meaning highly");
        System.out.println("satisfies and");
        System.out.println(MIN + " meaning not at all satisfied.");
        System.out.println("Enter your rating >> ");

// Get the numeric rating from the user.
        rating = input.nextInt();

// Add a loop that continues to execute while the user’s response is out of range—that is, 
// while it is less than 1 or greater than 5.
        while(rating < MIN || rating > MAX) {
            System.out.println("You must enter a value");
            System.out.println("between " + MIN + " and " + MAX);
            System.out.println("Please try again >> ");
            rating = input.nextInt();
        }

// Thank the user, and add closing curly braces for the main() method and for the class.
        System.out.println("Thank you.");
        input.close();
    }
}