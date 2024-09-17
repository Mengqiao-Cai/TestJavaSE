import javafx.util.Pair;

import java.util.*;

/**
 * @author: cmq
 * @date: 8/12/2024 - 08 - 12 - 7:38 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        int[] i0 = new int[10];
        for (int i:i0) System.out.println(i);
    }
    public static void help2 (int[] s) {
        s[0] = 100;
    }
    public static void help1 (String s) {
        System.out.println("3: "+System.identityHashCode(s));
        s += "added";
        System.out.println("4: "+System.identityHashCode(s));
    }
}
