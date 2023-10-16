// You Do It Chapter 5.5
// Using the && and || Operators

public class ShortCircuitTestAnd {
    public static void main(String[] args) {

// Within the main() method, insert an if...else statement that tests the return values of two 
// method calls. If both methods are true, then Both are true is displayed. Otherwise, Both are 
// not true is displayed.
        if(falseMethod() && trueMethod()) {
            System.out.println("Both are true");
        }
        else {
            System.out.println("Both are not true");
        }
    }
    
//Following the closing curly brace for the main() method, but before the closing curly brace for 
// the class, insert a method named trueMethod(). The method displays the message Within 
// trueMethod() and returns a true value.
    public static boolean trueMethod() {
        System.out.println("Within trueMethod()");
        return true;
    }

// Following the closing curly brace of trueMethod(), insert a method named falseMethod() that 
// displays the message Within falseMethod() and returns a false value.
    public static boolean falseMethod() {
        System.out.println("Within falseMethod()");
        return false;
    }
}
