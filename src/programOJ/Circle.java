package programOJ;
/*
204. 圆
 */
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            if (n <= 2) {
                System.out.println(n);
            } else {
                long ans=2;
                for (int i = 3; i <=n ; i++) {
                    for (int j = 0; j < i-1; j++) {
                        ans += (j * (i - 2 - j) + 1);
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
