// You Do It Chapter 4.9
// Using the Java Website

// Open a new file in your text editor, and type the following two import statements. You need the 
// JOptionPane class to use the showConfirmDialog() method, and you need the java.time package to 
// use the LocalDateTime class:
import javax.swing.JOptionPane;
import java.time.*;

// Begin the TimedResponse application as follows. Declare two LocalDateTime objects named time1 
// and time2. These objects will hold the exact time before a user is prompted and the exact time 
// after the user responds. Also declare integers to hold the value of the seconds for both times. 
// The difference between these two values is the elapsed time between the creations of the two 
// LocalDateTime values.
public class TimedResponse {
    public static void main(String[] args) {
        LocalDateTime time1, time2;
        int seconds1, seconds2, difference;

// Assign the current time to the time1 object, and then extract the value of the current seconds field.
        time1 = LocalDateTime.now();
        seconds1 = time1.getSecond();

// Display a dialog box that asks the user to make a difficult choice.
        JOptionPane.showConfirmDialog(null, "Is stealing ever justified? ");

// Next, get the system time immediately after the user responds to the dialog box, and extract its 
// seconds component.
        time2 = LocalDateTime.now();
        seconds2 = time2.getSecond();

// Compute the difference between the times, and display the result in a dialog box.
        difference = seconds2 - seconds1;
        JOptionPane.showMessageDialog(null, "End seconds: " + seconds2 + "\nStart seconds: " + seconds1 + "\nIt took " + difference + " seconds for you to answer.");
    }
}
