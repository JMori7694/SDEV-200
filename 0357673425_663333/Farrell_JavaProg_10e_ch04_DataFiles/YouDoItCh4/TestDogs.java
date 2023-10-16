// You Do It Chapter 4.8 
// Using Static and Nonstatic final Fields
// Second part

// Open a new file in your text editor, and then enter the header and opening and closing curly 
// braces for a class you can use to test the DogTriathlonParticipant class. Also include a main() 
// method header and its opening and closing braces. 
public class TestDogs {
    public static void main(String[] args) {

// Between the braces of the main() method, declare a DogTriathlonParticipant object. Provide values 
// for the participant’s name, number of events, and three scores, and then display the object.
        DogTriathlonParticipant dog1 = new DogTriathlonParticipant("Bowser", 2, 85, 89, 0);
        dog1.display();

// Create and display two more objects within the main() method
        DogTriathlonParticipant dog2 = new DogTriathlonParticipant("Rush", 3, 78, 72, 80);
        dog2.display();
        DogTriathlonParticipant dog3 = new DogTriathlonParticipant("Ginger", 3, 90, 86, 72);
        dog3.display();
    }
}
