package programOJ;
/*
22.Prime Plus
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimePlus_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //制作素数表来判断
            int n=sc.nextInt();
            boolean[] isPrime=new boolean[n];
            //初始化
            for (int i = 0; i < isPrime.length; i++) {
                isPrime[i]=true;
            }
            //判断
            for (int i = 2; i < isPrime.length; i++) {
                if (isPrime[i]) {
                    for (int j = 2; j*i <isPrime.length ; j++) {
                        isPrime[j*i]=false;
                    }
                }
            }
            int count=0;
            for (int i = 2; i < isPrime.length; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
/*
    虽然用了list有了优化，但是还是超出时间限制，因为是两层循环，所以数值很大的时候不行。优化不够
 */
