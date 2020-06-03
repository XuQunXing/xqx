package programOJ;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
21. 最小公倍数 Plus
 */
public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            int n =sc.nextInt() ;
            //处理  把所有的值放入set中，两两求 直到最后剩一个数  输出
            Set<BigInteger> set = new HashSet<>();
            for (int i = 2; i <= n; i++) {
                for (int j = 2; j <= n; j++) {
                    BigInteger temp1=new BigInteger(String.valueOf(i));
                    BigInteger temp2=new BigInteger(String.valueOf(j));
                    set.add(leastNum(temp1, temp2));
                }
            }
            while (set.size() != 1) {
                Set<BigInteger> temp = new HashSet<>();
                Iterator<BigInteger> it = set.iterator();
                if (set.size() % 2 == 0) {
                    while (it.hasNext()) {
                        BigInteger a = it.next();
                        BigInteger b = it.next();
                        temp.add(leastNum(a,b));
                    }
                } else {
                    temp.add(it.next());
                    while (it.hasNext()) {
                        BigInteger a = it.next();
                        BigInteger b = it.next();
                        temp.add(leastNum(a,b));
                    }
                }
                set=temp;
            }
            //输出
            Iterator<BigInteger> it = set.iterator();
            System.out.println(it.next());
        }
    }

    //求最小公倍数
    public static BigInteger leastNum(BigInteger a, BigInteger b) {
        BigInteger temp1 = a, temp2 = b, temp = temp1.remainder(temp2);
        while (!temp.equals(BigInteger.ZERO)) {
            temp1 = temp2;
            temp2 = temp;
            temp = temp1.remainder(temp2);
        }
        BigInteger ans=a.multiply(b).divide(temp2);
        return ans;
    }
}
