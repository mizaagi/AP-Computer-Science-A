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
            if (x.substring(1, 2).equals("/")) {
                month = Integer.parseInt(x.substring(0, 1));
                if (x.substring(3, 4).equals("/")) {
                    day = Integer.parseInt(x.substring(2, 3));
                    year = Integer.parseInt(x.substring(4));
                }
                else {
                    day = Integer.parseInt(x.substring(2, 4));
                    year = Integer.parseInt(x.substring(5));
                }
            }
            else {
                month = Integer.parseInt(x.substring(0, 2));
                if (x.substring(4, 5).equals("/")) {
                    day = Integer.parseInt(x.substring(3, 4));
                    year = Integer.parseInt(x.substring(5));
                }
                else {
                    day = Integer.parseInt(x.substring(3, 5));
                    year = Integer.parseInt(x.substring(6));
                }
            }

        } else {
            encoded = x;
            mStr = encoded.substring(0, 1);
            dStr = encoded.substring(1, 3);
            yStr = encoded.substring(3, 4);
        }
    }


    public void encode() {
        mStr = monthAlp.substring(month-1, month);
        if (day <= 9) {
            dStr += "O";
            dStr += dayAlp.substring(day%10-1, day%10);
        } else
            dStr += dayAlp.substring(day/10-1, day/10) + dayAlp.substring(day%10-1, day%10);
        yStr = yearAlp.substring(year-71, year-70);
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
