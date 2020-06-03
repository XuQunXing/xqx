package programOJ;
/*
90. 数列之和
 */
import java.math.BigInteger;
import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m=sc.nextInt();
            int n=sc.nextInt();

            //处理
            BigInteger ans=BigInteger.ZERO;
            String str=String.valueOf(m);
            ans=ans.add(new BigInteger(str));
            for (int i = 1; i <n ; i++) {
                str+=m;
                ans=ans.add(new BigInteger(str));
            }

            //输出
            System.out.println(ans);
        }
    }
}
