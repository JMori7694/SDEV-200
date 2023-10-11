// Term Project
// Case Problem
// Sunshine Seashore Supplies
// Ch4
import java.util.Scanner;

public class Rental {
    Scanner in = new Scanner(System.in);

    public final static void MinutesPerHour() {
        final int MPH = 60;
    }
    public final static void HourlyRentalRate() {
        final int HRR = 40;
    }
    
    private String contractNum;
    private Double hoursRent;
    private Double minsOver;
    private Double total;

    public String setContractNumber(String ContractNum) {
        System.out.print("Please enter the Contract Number >> ");
        String contractNum = in.nextLine();
        return contractNum;
    }
    public double[] setHoursAndMinutes(Scanner in,int MPH, int HRR) {
        System.out.print("Please enter the rental time in minutes >> ");
        double mins = in.nextDouble();

        if (mins >= 60) {
            double[] hoursMins = new double[3];
            hoursMins[0] = mins / 60;
            hoursMins[1] = mins % 60;
            hoursMins[2] = (hoursMins[0] * HRR);
            hoursMins[3] = (hoursMins[1] * 1);
            return hoursMins;
        }
        else {
            double[] Mins = new double[2];
            Mins[0] = mins;
            Mins[1] = (mins * (HRR / MPH));
            return Mins;
        }
    }
    
    public String getContractNumber() {
        return contractNum;
    }
    public Double getHoursForRental() {
        return hoursRent;
    }
    public Double getMinutesOverHour() {
        return minsOver;
    }
    public Double getPrice() {
        return total;
    }
    
}
