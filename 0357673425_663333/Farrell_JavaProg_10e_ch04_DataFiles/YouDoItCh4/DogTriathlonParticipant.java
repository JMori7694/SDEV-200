// You Do It Chapter 4.8
// Using Static and Nonstatic final Fields

// Open a new file in your text editor, and enter the first few lines for a DogTriathlonParticipant 
// class. The class contains a final field that holds the number of events in which the dog 
// participated. Once a final field is set, it should never change. The field is not static because 
// it is different for each dog. The class also contains a static field that holds the total 
// cumulative score for all the participating dogs. The field is not final because its value 
// increases as each dog participates in the triathlon, but it is static because at any moment in 
// time, it is the same for all participants.
public class DogTriathlonParticipant {
    private final int NUM_EVENTS;
    private static int totalCumulativeScore = 0;

// Add six private fields that hold the participating dog’s name, the dog’s score in three events, 
// the total score, and the average score:
    private String name;
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;

// The constructor for the class requires five parameters—the dog’s name, the number of events in 
// which the dog participated, and the dog’s scores in the three events. (After you read the chapter 
// about decision making, you will be able to ensure that the number of nonzero scores entered matches 
// the number of events, but for now, no such checks will be made.) The constructor assigns each value 
// to the appropriate field
    public DogTriathlonParticipant(String name, int numEvents, int score1, int score2, int score3) {
        this.name = name;
        NUM_EVENTS = numEvents;
        obedienceScore = score1;
        conformationScore = score2;
        agilityScore = score3;

// The constructor for the class requires five parameters—the dog’s name, the number of events in 
// which the dog participated, and the dog’s scores in the three events. (After you read the chapter 
// about decision making, you will be able to ensure that the number of nonzero scores entered matches 
// the number of events, but for now, no such checks will be made.) The constructor assigns each value 
// to the appropriate field
        total = obedienceScore + conformationScore + agilityScore;
        avg = (double) total / NUM_EVENTS;
        totalCumulativeScore = totalCumulativeScore + total;
    }

// Start a method that displays the data for each triathlon participant.
    public void display() {
        System.out.println(name + " participated in " + NUM_EVENTS + " events and has an average score of " + avg);
        System.out.println(" " + name + " has a total score of " + total + " bringing the total cumulative score to " + totalCumulativeScore);
    }
}
