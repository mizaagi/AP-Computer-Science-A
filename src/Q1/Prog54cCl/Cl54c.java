package Q1.Prog54cCl;

public class Cl54c {
    // Declare all private variables that we will need
    private double area;
    private double rad;
    private double circum;

    public Cl54c(double rad) {
        this.rad = rad;
        this.area = 0.0;
        this.circum = 0.0;
    }

    public void calc() {
        area = Math.PI * Math.pow(rad, 2);
        circum = 2 * Math.PI * rad;
    }

    public String toString() {
        return "Area: " + area +
               "\n Circumference: " + circum;
    }
}
