package Q3.Prog703s;

public class Linux extends Computer {
    private int code;

    public Linux(String na, int n, double v, int c) {
        super(na, n, v);
        code = c;
    }

    public int getCode() { return code; }
}