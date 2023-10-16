// You Do It Chapter 5.10
// Making Constructores More Efficient by Using Decisions in Other Methods

// Start a class that holds data about preschool students. The fields include an ID number and an age.
public class PreschoolStudent {
    int idNum;
    int age;

// Add two constants that hold the highest allowed value for an ID number and the highest allowed 
// value for the age of a preschool student
    public final int HIGH_ID = 9999;
    public final int HIGH_AGE = 6;

// Above the setIdNum() method, insert a constructor for the class that requires parameters for 
// both fields. You could include code within the constructor to ensure that the fields have good 
// values, but that code is already written, so it is more efficient and less error-prone to have 
// the constructor call the setIdNum() and setAge() methods.
    public PreschoolStudent(int num, int studentAge) {
        setIdNum(num);
        setAge(studentAge);
    }

// Write a setIdNum() method that accepts an integer argument and checks to make sure it is no 
// larger than the highest allowed value. If the ID number is valid, assign it to the idNum 
// field; otherwise, set the idNum field to zero.
    public void setIdNum(int num) {
        if (num <= HIGH_ID) {
            idNum = num;
        }
        else {
            idNum = 0;
        }
    }

// Write a similar setAge() method that makes sure a preschool student’s age is no more than 6 
// or else assigns a zero.
    public void setAge(int studentAge) {
        if(studentAge <= HIGH_AGE) {
            age = studentAge;
        }
        else {
            age = 0;
        }
    }

// Add two get methods that each return one of the field values. Also add a closing curly brace 
// for the class.
    public int getIdNum() {
        return idNum;
    }
    public int getAge() {
        return age;
    }
}
