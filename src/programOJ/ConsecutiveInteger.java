package programOJ;

import java.util.Scanner;

public class ConsecutiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            if ((a & a- 1) == 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}
