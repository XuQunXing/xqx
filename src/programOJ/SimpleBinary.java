package programOJ;
/*
41、简单二进制
 */

import java.util.Scanner;

public class SimpleBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int ans = binary(n);
            System.out.println(ans);
        }
    }

    //转化为二进制
    public static int binary(int n) {
        int count = 0;
        while (n > 1) {
            int temp = n % 2;
            if (temp == 1) {
                count++;
            }
            n /= 2;
        }
        if (n == 1) {
            count++;
        }
        return count;
    }
}
