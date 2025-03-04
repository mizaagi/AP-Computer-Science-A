package Q3.Prog295c;

public class Employee {
    private String ssn;
    private int ssnSum;
    private String cla;
    private String type;
    private int dept;

    public Employee(String s, String c, String t, String d) {
        ssn = s;
        cla = c;
        type = t;
        dept = Integer.parseInt(d);
        ssnSum = Integer.parseInt(ssn.substring(0, 3) + ssn.substring(4, 6) + ssn.substring(7, 11));
    }

    public int getSsnSum() { return ssnSum; }
    public String toString() { return ssn + "\t" + cla + "\t" + type + "\t" + dept; }
}