package Q2.Prog214b;

public class Cl214b {
    private int empNum;
    private double ytdPay;
    private double bpRate;
    private double sCode;
    private double hrsWorked;
    private double grossPay;
    private double payRate;
    private double withTax;
    private double taxRate;
    private double FICA;
    private double netPay;

    public Cl214b(int e,double y,double b,double s,double h) {
        this.empNum    = e;
        this.ytdPay    = y;
        this.bpRate    = b;
        this.sCode     = s;
        this.hrsWorked = h;
        this.grossPay = 0;
        this.payRate = 0;
        this.withTax = 0;
        this.taxRate = 0;
        this.FICA = 0;
        this.netPay = 0;
    }

    public void calc() {
        payRate = bpRate * sCode;
        grossPay = hrsWorked * payRate;
        if (grossPay < 100)
            taxRate = 0;
        else if (grossPay >= 100 && grossPay < 150)
            taxRate = 0.08;
        else if (grossPay >= 150 && grossPay < 200)
            taxRate = 0.12;
        else if (grossPay >= 200 && grossPay < 300)
            taxRate = 0.15;
        else
            taxRate = 0.175;
        withTax = grossPay * taxRate;
        if (ytdPay > 17300)
            FICA = 0;
        else if (ytdPay + grossPay <= 17300)
            FICA = 0.0605 * grossPay;
        else if (ytdPay < 17300 && ytdPay+grossPay > 17300)
            FICA = 0.0605 * (17300 - (ytdPay+grossPay));
        netPay = grossPay - Math.abs(FICA) - withTax;

    }

    public String toString() {
        return "Employee Number: " + empNum +
                "\nHours: " + hrsWorked + " | Rate: " + bpRate + " | Shift Factor: " + sCode +
                "\n\tCurrent\tYear-to-date\nGross Pay: " + grossPay + "\t" + ytdPay +
                "\nWithholding: " + withTax +
                "\nFICA: " + Math.abs(FICA) +
                "\nNet Pay: " + netPay + "\n";
    }
}
