package exam.DOPRA.fourteen;
/*
2、pairs of numbers
 */

import java.util.Scanner;

/**
 * 逆向递归实现
 */
public class PairsOfNumbers_1 {
    static int min = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            min = n - 1;
            for (int i = 1; i <= n / 2; i++) {
                int step = find(n - i, i) + 1;
                min = Math.min(step, min);
            }
            System.out.println(min == Integer.MAX_VALUE ? 0 : min);
        }
    }

    /**
     * 递归求步数
     * a=k*b+r
     * step=k+find(b,r) =>a/b+find(b,a%b)
     *
     * @param a
     * @param b
     * @return
     */
    public static int find(int a, int b) {
        if (b == 0) {
            return min;
        }
        if (b == 1) {
            return a - b;
        }
        return a / b + find(b, a % b);
    }
}
