package Q2.Prog435a;

public class Cl435a {
    private double factor;
    private String carType;
    private double gate;
    private double total;

    public Cl435a(int c, int g) {
        this.factor = c;
        this.gate = g;
        this.carType = "";
        this.total = 0;
    }

    public void calc() {
        if      (factor == 1) {factor = 1.0; carType =   "Compact Car";}
        else if (factor == 2) {factor = 1.3; carType =     "Small Car";}
        else if (factor == 3) {factor = 1.6; carType =  "Mid Size Car";}
        else if (factor == 4) {factor = 2.0; carType = "Full Size Car";}
        else if (factor == 5) {factor = 2.4; carType =         "Truck";}
        else if (factor == 6) {factor = 2.7; carType =    "16 Wheeler";}

        if      (gate == 1) {gate = 1.35;}
        else if (gate == 2) {gate = 2.00;}
        else if (gate == 3) {gate = 2.50;}
        else if (gate == 4) {gate = 3.25;}
        else if (gate == 5) {gate = 4.10;}
        else if (gate == 6) {gate = 4.80;}
        else if (gate == 7) {gate = 5.50;}
        else if (gate == 8) {gate = 6.00;}

        total = gate * factor;
    }

    public String toString() {
//        return carType + "\t\t$" + gate + "\t\t" + factor + "\t\t$" + total;
        return String.format("%s\t\t% 4.2f\t\t% 4.2f\t\t$% 4.2f", carType, gate, factor, total);
    }
}
