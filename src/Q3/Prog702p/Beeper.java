package Q3.Prog702p;

public class Beeper extends Animal {
    private String extraWord;
    private String firstName;
    private String lastName;

    public Beeper(String fn, String ln, String ew) {
        super(fn, ln);
        extraWord = ew;
    }

}
