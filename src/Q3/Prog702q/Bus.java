package Q3.Prog702q;

public class Bus extends Vehicle {
    private String home;

    public Bus(String n, int t, double v, String h) {
        super(n, t, v);
        home = h;
    }
}
