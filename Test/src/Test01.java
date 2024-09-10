import javafx.util.Pair;

import java.util.*;

/**
 * @author: cmq
 * @date: 8/12/2024 - 08 - 12 - 7:38 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        int[] a = new int[]{0,1};
        int[] b = new int[]{0,1};
        ArrayList<int[]> c = new ArrayList<>();
        ArrayList<int[]> d = new ArrayList<>();
        c.add(new int[]{0,1});
        c.add(new int[]{1,2});
        c.add(new int[]{2,3});
        c.add(new int[]{3,4});
        d.add(new int[]{3,4});
        d.add(new int[]{1,2});
        d.add(new int[]{0,1});
        d.add(new int[]{2,3});
        System.out.println(d);
        d.sort((i,j)->i[0]-j[0]);
        System.out.println(d);
        System.out.println(c.equals(d));
        HashSet<int[]> s1 = new HashSet<>();
        System.out.println(s1.add(a));
        System.out.println(s1.add(b));
        System.out.println(s1);
        String ddd = "";
        System.out.println();
        HashMap<HashSet<Character>, Integer> map = new HashMap<>();
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        set1.add('a');
        set1.add('c');
        set2.add('c');
        set2.add('a');
        map.put(set1,2);
        map.put(set2,4);
        System.out.println(map);
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(2,3,5,6,8));
        String s5 = "012345";
        String s6 = s5.substring(0,2)+s5.substring(3,6);
        System.out.println(s6);
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
