// You Do It Chapter 5.10
// Making Constructores More Efficient by Using Decisions in Other Methods

public class PreschoolDemo {
    public static void main(String[] args) {

// Construct two PreschoolStudent objects. Pass valid values to the constructor for one, and 
// pass invalid values to the constructor for the other
        PreschoolStudent ps1 = new PreschoolStudent(2345, 5);
        PreschoolStudent ps2 = new PreschoolStudent(67890, 8);

// Send each object to a display() method that will display the assigned values for the fields. 
// Change the age for the first object, and display it again. Then change the age again, and 
// display it again. Add a closing curly brace for the main() method.
        display(ps1);
        display(ps2);
        ps1.setAge(6);
        display(ps1);
        ps1.setAge(7);
        display(ps1);
    }

// Write the display() method. Then add a closing curly brace for the class
        public static void display(PreschoolStudent ps) {
            System.out.print("Student ID " + ps.getIdNum());
            System.out.println("  Student age " + ps.getAge());
            System.out.println();
        }
}
