package programOJ;
/*
22.Prime Plus
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PrimePlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> prime=new ArrayList<>();
        prime.add((long) 2);
        while (sc.hasNext()) {
            long n=sc.nextLong();
            if (n == 1) {
                System.out.println(0);
            } else if (n == 2) {
                System.out.println(1);
            }else {
                long last=prime.get(prime.size()-1);
                int ans=0;
                if (last >= n) {
                    //在list中搜索
                    for (long l : prime
                    ) {
                        if (l <= n) {
                            ans++;
                        }
                    }
                } else {
                    //继续从最后一个往n去找
                    for (long i = last+1; i <=n ; i++) {
                        if (isPrime(i)) {
                            prime.add(i);
                        }
                    }
                    ans=prime.size();
                }
                System.out.println(ans);
            }
        }
    }

    //判断是否是素数
    public static boolean isPrime(long num) {
        for (long i = 2; i <num ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/*
    虽然用了list有了优化，但是还是超出时间限制，因为是两层循环，所以数值很大的时候不行。优化不够
 */
