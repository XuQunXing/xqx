package exam.twelve;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
DOPRA模拟考试第十二期工作级（5.20 ~ 6.3）      1.A-B problem Plus
 */
public class ABPlus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            Map<BigInteger,BigInteger> map=new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                BigInteger a=new BigInteger(String.valueOf(sc.nextInt()));
                BigInteger b=new BigInteger(String.valueOf(sc.nextInt()));
                map.put(a,b);

            }
            //输出
            Set<Map.Entry<BigInteger,BigInteger>> set=map.entrySet();
            int i=1;
            for (Map.Entry<BigInteger,BigInteger> m:set
                 ) {
                BigInteger a=m.getKey();
                BigInteger b=m.getValue();
                if (i == n) {
                    System.out.println("Case " + i+":");
                    System.out.println(a + " - " + b + " = " + a.subtract(b));
                } else {
                    System.out.println("Case "+i+":");
                    System.out.println(a+" - "+b+" = "+a.subtract(b));
                    System.out.println();
                }
                i++;
            }
        }
    }
}
