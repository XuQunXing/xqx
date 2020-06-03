package programOJ;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
64. Lucky Number
 */
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            long n=sc.nextLong();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();

            //处理
            long ans=0;
            ans+=(n/x+n/y+n/z+n/getBigCommon(x,getBigCommon(y,z)));
            ans-=(n/getBigCommon(x,y)+n/getBigCommon(x,z)+n/getBigCommon(y,z));
            System.out.println(ans);
        }
    }

    //得到该数字对应的数量
    public static int getBigCommon(int x,int y) {
        int a=x,b=y;
        int temp = a % b;
        while (temp != 0) {
            a = b;
            b = temp;
            temp = a % b;
        }
        return x*y/b;
    }
}
