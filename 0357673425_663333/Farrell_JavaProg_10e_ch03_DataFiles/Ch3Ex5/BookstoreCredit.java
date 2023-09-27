import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        String studentName;
        double gpa;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the student's name: ");
        studentName = keyboard.nextLine();

        System.out.print("Please enter the student's GPA: ");
        gpa = keyboard.nextDouble();

        credit(studentName, gpa);

        keyboard.close();
    }

    public static void credit(String studentName, double gpa) {
        double gpaCredit = gpa * 10;

        System.out.println("");
        System.out.println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'");
        System.out.println("");
        System.out.println(studentName + " has a bookstore credit of $" + (int) gpaCredit + ".");
        System.out.println("");
        System.out.println("\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'\"`-._,-'");
        System.out.println("");

    }
}