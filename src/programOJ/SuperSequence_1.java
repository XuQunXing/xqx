package programOJ;

import java.util.Scanner;

/*
62. Super Sequence
 */
public class SuperSequence_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(num(n));
        }
    }

    //根据位置得到数字
    public static int num(int n) {
        //个位数直接返回
        if (n < 10) {
            return n;
        }
        int i = 1;
        int temp = 9;
        //得到位数
        while (n > temp) {
            n -= temp;
            i++;
            temp = (int) ((i) * 9 * Math.pow(10, i - 1));
        }

        int a = n / i;
        int b = n % i;
        int base = (int) Math.pow(10, i - 1);
        //余数为0，取前一个数字的最后一位。否则去当前数字对应位
        if (b == 0) {
            String str = String.valueOf(a + base - 1);
            return str.charAt(str.length() - 1) - '0';
        } else {
            String str = String.valueOf(a + base);
            return str.charAt(b - 1) - '0';
        }
    }
}
