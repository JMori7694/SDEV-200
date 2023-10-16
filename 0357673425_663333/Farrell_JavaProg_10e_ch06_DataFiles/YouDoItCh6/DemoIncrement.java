// You Do It Chapter 6.3
// Working with Prefix and Postfix Increment Operators

public class DemoIncrement {
    public static void main(String[] args) {

// On a new line, add a variable v, and assign it a value of 4. Then declare a variable named 
// plusPlusV, and assign it a value of ++v by typing the following:
        int v = 4;
        int plusPlusV = ++v;

// The last statement, int plusPlusV = ++v;, increases v to 5, so before declaring a vPlusPlus 
// variable to which you assign v++, reset v to 4 by typing the following: 
        v = 4;
        int vPlusPlus = v++;

// Add the following statements to display the three values:
        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);
    }
}
