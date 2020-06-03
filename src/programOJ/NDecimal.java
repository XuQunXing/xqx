package programOJ;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * n进制小数
 */
public class NDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double a = sc.nextDouble();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            BigDecimal ba = new BigDecimal(a);
            BigDecimal bb = new BigDecimal(b);
            String ans = "0.";
            for (int i = 0; i < 10; i++) {
                ba = ba.multiply(bb);
                ans += ba.intValue();
                ba = ba.subtract(BigDecimal.valueOf(ba.intValue()));
            }
            System.out.println(ans);
        }
    }
}
