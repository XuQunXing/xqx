package exam.DOPRA.twelve;

import java.util.*;

/*
3 数数字
 */
public class CountNumbers_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[][] dp=new long[1000000000][10];
        for (int i = 0; i <10 ; i++) {
            if (i == 1) {
                dp[1][i] = 0;
            } else {
                dp[1][i]=1;
            }
        }
/*        for (int i = 2; i <= 1000000000; i++) {
            for (int j = 0; j < 10; j++) {
                if (String.valueOf(i).contains(String.valueOf(j))) {
                    dp[i][j]=dp[i-1][j];
                }else {
                    dp[i][j]=dp[i-1][j]+1;
                }

            }
        }*/
        while (sc.hasNext()) {
            //输入
            int l=sc.nextInt();
            int r=sc.nextInt();
            int n=sc.nextInt();
            //处理
            for (int i = 2; i <=r ; i++) {
                if (String.valueOf(i).contains(String.valueOf(n))) {
                    dp[i][n]=dp[i-1][n];
                }else {
                    dp[i][n]=dp[i-1][n]+1;
                }
            }
            long ans=dp[r][n]-dp[l][n];
            //输出
            System.out.println(ans);
        }
    }
}
/*
判断集合是否包含给定数组
 */