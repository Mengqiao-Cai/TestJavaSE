import java.util.Random;

/**
 * @author: cmq
 * @date: 8/9/2024 - 08 - 09 - 4:25 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Random random = new Random();
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int times = 10000;
        /*for (int i=0;i<times;i++) {
            int cur = random.nextInt(3);
            if (cur == 0) count0++;
            else if (cur == 1) count1++;
            else if (cur == 2) count2++;
        }
        System.out.println("zero: " + count0 + "; one: " + count1 + "; two: " + count2);*/
        int getPrize = 0;
        for (int i=0;i<times;i++) {
            int cur1 = random.nextInt(3);
            int cur2 = random.nextInt(3);
            if (cur1==cur2) {
                getPrize++;
            }
        }
        System.out.println(getPrize + "; ratio: " + (float)getPrize/(float)times);

    }
}
