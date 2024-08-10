import java.util.Random;

/**
 * @author: cmq
 * @date: 8/9/2024 - 08 - 09 - 4:07 PM
 * @version: 1.0
 */
public class Test {
    // 0 -> open prize door; 1 -> switch and get prize; 2 -> switch and not get prize
    public static int openRandom() {
        Random random = new Random();
        int prize = random.nextInt(3);
        int picked = random.nextInt(3);
        Random random1 = new Random();
        boolean pickFirst = random1.nextBoolean();
        int open = -1;
        if (picked == 1) {
            open = pickFirst ? 2 : 3;
        } else if (picked == 2) {
            open = pickFirst ? 1 : 3;
        } else if (picked == 3) {
            open = pickFirst? 1 : 2;
        }
        if (open == prize) {
            return 0;
        } else {
            if (picked != prize) {
                return 1;
            } else {
                return 2;
            }
        }
    }
    public static void main(String[] args) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int times = 10000000;
        for (int i=0;i<times;i++) {
            int cur = openRandom();
            if (cur==0) {
                count0++;
            } else if (cur==1) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("switch and get prize: 6"+count1+" switch and no prize "+count2+"; "+(count0+count1+count2));
        System.out.println((float)count1/(float)count2);
        System.out.println((float)count1/(float)(count1+count2));
    }
}
