package Q3.Prog607a;

public class EncodeDecode {
    private String monthAlp;
    private String dayAlp;
    private String yearAlp;
    private int day;
    private int month;
    private int year;

    public EncodeDecode(String date) {
        monthAlp = "abcdefghijkl";
        dayAlp   = "qrstuvwxyz";
        yearAlp  = "zyxwbutsrqponmlkjihgfedcba";
        if (date.substring(0, 1).equals("0"))
            day = Integer.parseInt(date.substring(0, 1));
        else
            day = Integer.parseInt(date.substring(0, 2));
        month = Integer.parseInt(date.substring(3, 5));
        year = Integer.parseInt(date.substring(6));
        // 01/34/6789
    }
}
