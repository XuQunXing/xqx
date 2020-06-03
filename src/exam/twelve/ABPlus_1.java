package exam.twelve;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
DOPRA模拟考试第十二期工作级（5.20 ~ 6.3）      1.A-B problem Plus
 */
public class ABPlus_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            for (int i = 0; i < n; i++) {
                BigInteger a=new BigInteger(String.valueOf(sc.nextInt()));
                BigInteger b=new BigInteger(String.valueOf(sc.nextInt()));
                int temp=i+1;
                String ans=a + " - " + b + " = " + a.subtract(b);
                System.out.println("Case " + temp+":");
                System.out.println(ans);
                if (i != n - 1) {
                    System.out.println();
                }
            }

        }
    }
}
