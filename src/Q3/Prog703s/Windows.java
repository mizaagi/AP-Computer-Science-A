package Q3.Prog703s;

public class Windows extends Computer {
    private double version;

    public Windows(String na, int n, double v, double ve) {
        super(na, n, v);
        version = ve;
    }

    public double getVersion() { return version; }
}