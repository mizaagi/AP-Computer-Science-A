package Q2.LP3_9;

public class ClLP3_9 {
    private int bYear;
    private int bMonth;
    private int bDay;
    private int year;
    private int month;
    private int day;
    private int days;
    private int slpHrs;

    public ClLP3_9(int by, int bm, int bd,
                   int y,  int m,  int d) {
        this.bYear  = by;
        this.bMonth = bm;
        this.bDay   = bd;
        this.year   = y;
        this.month  = m;
        this.day    = d;
        this.days   = 0;
        this.slpHrs = 0;
    }

    public void calc() {
        this.days = Math.abs((year-bYear-1) * 365) + Math.abs((month-bMonth-1) * 30) + Math.abs(day-bDay);
    }

    public String getDays() {
        return days + " days";
    }
}
