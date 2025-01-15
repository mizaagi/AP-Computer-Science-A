package Q2;

public class passwordUser {
    public static void main(String[] args) {
        PasswordGenerator pw = new PasswordGenerator(5, "chs");
        String p1 = pw.pwGen();
        System.out.println(p1);
    }

}
