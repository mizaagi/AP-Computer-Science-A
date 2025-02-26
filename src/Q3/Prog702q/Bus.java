package Q3.Prog702q;

public class Bus extends Vehicle {
    private String home;

    public Bus(String n, int t, String h) {
        super(n, t);
        home = h;
    }

    public String getHome() { return home; }
}
