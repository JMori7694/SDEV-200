// You Do It Chapter 6.5
// Working with Definite Loops

public class DivideEvenly {
    public static void main(String[] args) {
// Add the following statements to display the values stored in the compare variables:
        final int LIMIT = 100;
        int var;

// Type a statement that explains the purpose of the program:
        System.out.println(LIMIT + " is evenly divisible by ");

// Write the for loop that varies var from 1 through 100. With each iteration of the loop, 
// test whether 100 percent var is 0. If you divide 100 by a number and there is no remainder, 
// the number goes into 100 evenly.
        for(var = 1; var <= LIMIT; ++var) {
            if(LIMIT % var == 0) {
                System.out.print(var + " ");
            }
        }
// Write the for loop that varies var from 1 through 100. With each iteration of the loop, 
// test whether 100 percent var is 0. If you divide 100 by a number and there is no remainder, 
// the number goes into 100 evenly.
        System.out.println();
    }
}
