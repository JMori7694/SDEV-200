// You Do It Chapter 6.6
// Working with Nested Loops

public class DivideEvenly2 {
    public static void main(String[] args) {
        final int LIMIT = 100;
        int var;
// Add a new variable declaration at the beginning of the file with the other variable declarations:
        int number;
        
        System.out.println(LIMIT + " is evenly divisible by ");

// Replace the existing for loop with the following nested loop. The outer loop varies number 
// from 1 to 100. For each number in the outer loop, the inner loop uses each positive integer 
// from 1 up to the number and tests whether it divides evenly into the number
        for(number = 1; number <= LIMIT; ++number) {
            System.out.print(number + " is evenly divisible by ");
            for(var = 1; var <= number; ++ var) {
                if(number % var == 0) {
                    System.out.print(var + " ");
                }
            }
            System.out.println();
        }
    }
}
