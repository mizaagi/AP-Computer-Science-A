package Q3.Prog702q;

public class Vehicle implements names {
    private String name;
    private int tires;
    private double value;

    public Vehicle(String n, int t, double v) {
        name  = n;
        tires = t;
        value = v;
    }

    public String getName() {
        return name;
    }

    public int getTires() {
        return tires;
    }

    public double getValue() {
        return value;
    }
}
