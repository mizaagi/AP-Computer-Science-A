package Q2;

public class PasswordGenerator {
    private int len;
    private String prefix;
    private static int passwordsGenerated;

    public PasswordGenerator(int l) {
        len = l;
        prefix = "A.";
        passwordsGenerated = 0;
    }

    public PasswordGenerator(int l, String p) {
        len = l;
        prefix = p + ".";
        passwordsGenerated = 0;
    }

    private int randInt() {
        int rand = (int) (Math.random() * (Math.pow(10, len) - 1));
        return rand;
    }

    public int pwCount() {
        return passwordsGenerated;
    }

    public String pwGen() {
        String password = prefix + randInt();
        passwordsGenerated++;
        return password;
    }
}
