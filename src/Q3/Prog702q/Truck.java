package Q3.Prog702q;

public class Truck extends Vehicle {
    private double miles;

    public Truck(String n, int t, double m) {
        super(n, t);
        miles = m;
        value -= m * 0.25;
    }

    public double getMiles() { return miles; }
}
