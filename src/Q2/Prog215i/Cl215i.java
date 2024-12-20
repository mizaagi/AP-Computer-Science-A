package Q2.Prog215i;

public class Cl215i {
    private int vehicle;
    private double miles;
    private double gallons;
    private double mpg;

    public Cl215i(int v, double mi, double g) {
        vehicle = v;
        miles = mi;
        gallons = g;
        mpg = 0;
    }

    public void calc() {
        mpg = gallons / miles;
    }

    public double getMpg() {
        return mpg;
    }

    public int getVehicle() {
        return vehicle;
    }

    public double getMiles() {
        return miles;
    }

    public double getGallons() {
        return gallons;
    }
}
