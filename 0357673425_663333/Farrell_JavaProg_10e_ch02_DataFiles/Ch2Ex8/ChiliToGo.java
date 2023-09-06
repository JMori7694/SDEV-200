import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        int AdultMeal = 7;
        double AdultCost = 4.35;
        int ChildMeal = 4;
        double ChildCost = 3.10;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount of Adult Meals | $7 : ");
        int AmountAdult = in.nextInt();
        int CostAdult = AmountAdult * AdultMeal;
        System.out.println("Enter the amount of Children Meals | $4 : ");
        int AmountChild = in.nextInt();
        int CostChild = AmountChild * ChildMeal;

        int Total = CostAdult + CostChild;

        System.out.println("Your total is $" + Total);

        double Profit = (CostAdult - (AdultCost * AmountAdult)) + (CostChild - (ChildCost * AmountChild));

        System.out.println("Total profit is $" + Profit);

        in.close();
    }
}
