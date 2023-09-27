import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        String setMainIngredient;
        String setBread;
        double setPrice;
        Scanner input = new Scanner(System.in);

        setMainIngredient = getMainIngredient(input);
        setBread = getBread(input);
        setPrice = getPrice(setMainIngredient, setBread);

        System.out.println(setMainIngredient + " on " + setBread + " sandwich. Your total is $" + setPrice);

        input.close();
    }

    public static String getMainIngredient(Scanner input) {
        System.out.println("What would you like for the main ingredient?");
        System.out.print("Chicken, Ham, Steak, Tofu, Tuna, Turkey >> ");
        String setMainIngredient = input.nextLine();
        return setMainIngredient;
    }
    
    public static String getBread(Scanner input) {
        System.out.println("What type of bread would you like?");
        System.out.print("Everything Italian, Four Cheese, French, Italian, Wheat >> ");
        String setBread = input.nextLine();
        return setBread;
    }
    
    public static double getPrice(String setMainIngredient, String setBread) {
        if(setMainIngredient == "Chicken" || setMainIngredient == "Ham" || setMainIngredient == "Tuna" || setMainIngredient == "Turkey") {
            double costI = 1.00;
                
            if(setBread == "Everything Italian" || setBread == "French" || setBread == "Italian") {
                double costB = 1.00;
                double setPrice = costI + costB;
                return setPrice;
            }
    
            else {
                double costB = 2.00;
                double setPrice = costI + costB;
                return setPrice;
            }
        }
    
        else {
            double costI = 2.00;
    
            if(setBread == "Everything Italian" || setBread == "French" || setBread == "Italian") {
                double costB = 1.00;
                double setPrice = costI + costB;
                return setPrice;
            }
    
            else {
                double costB = 2.00;
                double setPrice = costI + costB;
                return setPrice;
            }
        }
    }
}
