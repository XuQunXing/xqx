package programOJ;
/*
81. 奇怪的比赛
 */

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StrangeGame {
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            int n = sc.nextInt();
            int s = sc.nextInt();

            //处理
            count = 0;
            getNum(n, s);

            //输出
            System.out.println(count);
        }
    }

    //判断方法数量
    public static void getNum(int n, int s) {

        if (n > 0) {
            //所有数都可能由减得到，只有偶数能翻倍得到
            getNum(n - 1, s + n);
            if (s % 2 == 0) {
                getNum(n - 1, s / 2);
            }
        } else {
            if (n == 0 && s == 10) {
                count++;
            }
        }
    }


}
