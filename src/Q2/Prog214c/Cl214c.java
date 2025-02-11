package Q2.Prog214c;
import java.util.ArrayList;

public class Cl214c {
    private String grade;
    private String dirty;
    private double gallons;
    private double washPrice;
    private double gasPrice;
    private double perGPrice;
    private double total;

    public Cl214c(double gal, String gra, String dir) {
        gallons = gal;
        grade = gra;
        dirty = dir;
        perGPrice = 0;
        washPrice = 0;
        gasPrice = 2.00;
        total = 0;
    }

    public void calc() {
        if (grade.equals("R")) {
            gasPrice = 1.359 * gallons;
            perGPrice = 1.359;
        }
        else if (grade.equals("P")) {
            gasPrice = 1.479 * gallons;
            perGPrice = 1.479;
        }
        else if (grade.equals("H")) {
            gasPrice = 1.429 * gallons;
            perGPrice = 1.429;
        }
        else
            System.out.println("Not a valid gas type.");
        if (gallons > 20)
            washPrice = 0;
        else if (gallons > 10)
            for (double i = gallons - 10; i > 0; i--)
                gasPrice *= 0.9;
        if (dirty.equals("Y"))
            total = gasPrice + washPrice;
        else if (dirty.equals("N"))
            total = gasPrice;
    }

    // public double getGasPrice()  { return gasPrice;  }
    // public double getWashPrice() { return washPrice; }
    // public double getTotal()     { return total;     }

    public String toString() {
        return
        "COMPSCI PETROLEUM COMPANY\n" +
        "-------------------------\n" +
        "Regular\t\t\t" + gallons + "gallons @ " + perGPrice + "\n" +
        "-------------------------\n" +
        "Gasoline\t\t\t" + gasPrice + "\n" +
        "Wash Y\t\t\t" + washPrice + "\n" +
        "\t\t\t\t\t" + "______" +
        "Total Due\t\t\t" + total +
        "-------------------------\n";
    }
}
