package Q3;

public class Apple extends Computer {
    private String color;

    public Apple(String na, int n, double v, String c) {
        super(na, n, v);
        color = c;
    }

    public String getColor() { return color; }
    
}