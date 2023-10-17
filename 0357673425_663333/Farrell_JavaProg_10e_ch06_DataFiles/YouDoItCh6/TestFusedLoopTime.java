// You Do It Chapter 6.7
// Comparing Exicution RImes for Separate and Fused Loops

import java.time.*;

public class TestFusedLoopTime {
    public static void main(String[] args) {
// Create variables to hold starting and ending times for loop execution. Also declare a 
// loop control variable, x, and two named constants that hold a number of times to repeat 
// loops and a factor for converting nanoseconds to milliseconds:
        int startTime, endTime;
        int x;
        final int REPEAT = 5_000_000;
        final int FACTOR = 1_000_000;

// Declare a LocalDateTime object, initialize it to a starting time, and extract its 
// nanoseconds component.
        LocalDateTime now;
        now = LocalDateTime.now();
        startTime = now.getNano();

// In a loop that repeats 5 million times, call a method named method1(). When the calls to 
// method1() are complete, execute a second loop that also repeats 5 million times, calling 
// another method named method2()
        for(x = 0; x < REPEAT; ++x) {
            method1();
        }
        for(x = 0; x < REPEAT; ++x) {
            method2();
        }

// When both loops are finished, get the current time, extract the nanoseconds value, and 
// display the difference between the start time and the end time, expressed in milliseconds:
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops execute separately: " + ((endTime - startTime) / FACTOR) + " milliseconds");

// Get a new starting time, and, within a single loop, call method1() and method2() 5 million times each.
        now = LocalDateTime.now();
        startTime = now.getNano();
        for(x = 0; x < REPEAT; ++x) {
            method1();
            method2();
        }

// Get the ending time for the loop, and display the value of the elapsed interval. Add a closing 
// curly brace for the method
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops executed in a block: " + ((endTime - startTime) / FACTOR) + " milliseconds");
    }

// Create the two methods named method1() and method2(). Each is simply a stub—a method that 
// contains no statements. Add a closing curly brace for the class.
    public static void method1(){
    }
    public static void method2() {
    }
}
