package programOJ;
/*
73. N! Plus Plus
 */
import java.util.Scanner;

public class NPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();

            //处理
            if (n <= 1) {
                System.out.println(n);
            } else {
                double ans=0;
                for (int i = 2; i <=n ; i++) {
                    ans+=Math.log10(i);
                }
                System.out.println((int)Math.floor(ans)+1);
            }
        }
    }
}
