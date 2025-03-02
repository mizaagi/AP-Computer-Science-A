package Q3;

public class Computer implements comps {
    private String name;
    private int number;
    private double value;

    public Computer(String na, int n, double v) {
        name = na;
        number = n;
        value = v;
    }

    public String getName()  { return name;   }
    public int getNumber()   { return number; }
    public double getValue() { return value;  }
}