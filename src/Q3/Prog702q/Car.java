package Q3.Prog702q;

public class Car extends Vehicle {
    private double worth;

    public Car(String n, int t, double v, double w) {
        super(n, t, v);
        worth = w;
    }
}
