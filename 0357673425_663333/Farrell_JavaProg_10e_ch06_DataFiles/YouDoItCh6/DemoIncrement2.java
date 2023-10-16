// You Do It Chapter 6.3
// Working with Prefix and Postfix Increment Operators
// Second Part

public class DemoIncrement2 {
    public static void main(String[] args) {

        int v = 4;
        int plusPlusV = ++v;
     
        v = 4;
        int vPlusPlus = v++;
        
        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);

// After the last println() statement, add three new integer variables and two new Boolean 
// variables. The first Boolean variable compares ++w to y; the second Boolean variable 
// compares x++ to y:
        int w = 17, x = 17, y = 18;
        boolean compare1 = (++w == y);
        boolean compare2 = (x++ == y);

// Add the following statements to display the values stored in the compare variables:
        System.out.println("First compare is " + compare1);
        System.out.println("Second compare is " + compare2);
    }
}
