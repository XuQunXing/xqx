package programOJ;
/*
19. N! Plus
 */
import java.math.BigInteger;
import java.util.Scanner;

public class NFactorialPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            BigInteger ans=BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                ans=ans.multiply(new BigInteger(String.valueOf(i)));
            }
            System.out.println(ans);
        }
    }
}
