package Q3.Prog701g;

public class Admin extends Person {
    private String myFavw;

    public Admin(String f, String l, String fw) {
        super(f, l);
        myFavw = fw;
    }

    public String getMyFavw() {
        return myFavw;
    }
}
