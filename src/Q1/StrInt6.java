package Q1;
import com.sun.source.doctree.TextTree;

import java.util.*;

public class StrInt6 {
    public static void main(String[] args) {
        Scanner wow = new Scanner(System.in);

        System.out.println("Enter a string:");
        String text = wow.nextLine().toLowerCase().trim();
        boolean unique = true;
        for (int lcv = 0; lcv < text.length(); lcv++) {
            unique = true;
            for (int lcv2 = lcv+1; lcv2 < text.length(); lcv2++) {
                if (text.charAt(lcv) == (text.charAt(lcv2))) {
                    unique = false;
                }
            }
            if (unique) {
                System.out.println("Another unique letter - " + text.charAt(lcv));
            }

        }
    }
}
