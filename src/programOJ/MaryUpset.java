package programOJ;
/*
38. Mary的烦恼
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MaryUpset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            int n=sc.nextInt();
            int s=sc.nextInt();
            int[] goods=new int[n];
            for (int i = 0; i < n; i++) {
                goods[i]=sc.nextInt();
            }
            //处理
            int[] dp=new int[1001];
            dp[0]=1;
            for (int i = 0; i < n; i++) {
                for (int j = s; j >=goods[i]; j--) {
                    if (dp[j - goods[i]] == 1) {
                        dp[j]=1;
                    }
                }
            }
            if (dp[s] == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
