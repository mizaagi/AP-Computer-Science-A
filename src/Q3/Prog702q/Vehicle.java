package Q3.Prog702q;

public class Vehicle implements names {
    private String name;
    private int tires;
    protected double value;

    public Vehicle(String n, int t) {
        name  = n;
        tires = t;
        value = 50000;
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
