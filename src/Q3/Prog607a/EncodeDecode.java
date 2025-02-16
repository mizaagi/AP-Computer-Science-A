package Q3.Prog607a;

public class EncodeDecode {
    private String monthAlp;
    private String dayAlp;
    private String yearAlp;
    private String mStr;
    private String dStr;
    private String yStr;
    private String encoded;
    private String decoded;
    private int day;
    private int month;
    private int year;

    public EncodeDecode(String x, String type) {
        decoded = "";
        encoded = "";
        mStr = "";
        dStr = "";
        yStr = "";
        monthAlp = "ABCDEFGHIJKL";
        dayAlp   = "QRSTUVWXYZ";
        yearAlp  = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        if (type.equals("date")) {
            decoded = x;
            if (x.substring(0, 1).equals("0"))
                day = Integer.parseInt(x.substring(0, 1));
            else
                day = Integer.parseInt(x.substring(0, 2));
            if (x.substring(0, 1).equals("0"))
                month = Integer.parseInt(x.substring(4, 5));
            else
                month = Integer.parseInt(x.substring(3, 5));
            year = Integer.parseInt(x.substring(6));
        } else {
            encoded = x;
            mStr = encoded.substring(0, 1);
            dStr = encoded.substring(1, 3);
            yStr = encoded.substring(3, 4);
        }
    }

    public void updateDate(String date) {
        if (date.substring(0, 1).equals("0"))
            day = Integer.parseInt(date.substring(0, 1));
        else
            day = Integer.parseInt(date.substring(0, 2));
        if (date.substring(0, 1).equals("0"))
            month = Integer.parseInt(date.substring(4, 5));
        else
            month = Integer.parseInt(date.substring(3, 5));
        year = Integer.parseInt(date.substring(6));
    }

    public void encode() {
        mStr = monthAlp.substring(month-1, month);
        dStr = dayAlp.substring(day/10-1, day/10) + dayAlp.substring(day%10-1, day%10);
        yStr = yearAlp.substring(year-1971, year-1970);
        encoded = mStr + dStr + yStr;
    }

    public void decode() {
        month = monthAlp.indexOf(mStr)+1;
        day = (dayAlp.indexOf(dStr.substring(0, 1))+1) * 10 + (dayAlp.indexOf(dStr.substring(1, 2))+1);
        year = yearAlp.indexOf(yStr)+1971;
        decoded = month + "/" + day + "/" + year;
    }

    public String getEncoded() {
        return encoded;
    }

    public String getDecoded() {
        return decoded;
    }
}
