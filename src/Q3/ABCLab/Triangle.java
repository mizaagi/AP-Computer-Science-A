package Q3.ABCLab;

public class Triangle extends NotCircle {
    private double base;

    public Triangle(double h, double b) {
        height = h;
        base = b;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void calcArea() {
        System.out.println("Area: " + (base * height));
    }

    public void calcPerim() {
        double hype = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        System.out.println("Perimeter: " + (hype + base + height));
    }
}
