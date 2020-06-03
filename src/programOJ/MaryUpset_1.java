package programOJ;
/*
38. Mary的烦恼
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MaryUpset_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] goods = new int[n];
            for (int i = 0; i < n; i++) {
                goods[i] = sc.nextInt();
            }
            //处理

            if (isFull(s, goods)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    //判断是否能装满
    public static boolean isFull(int s, int[] goods) {
        boolean[] res = new boolean[s + 1];//res代表能否装满对应质量的物品
        res[0] = true;//初始状态，装重量为0的物品肯定可以
        for (int i = 0; i < goods.length; i++) { //从1~n一次试探
            for (int j = s; j >= goods[i]; j--) {
                res[j] = res[j - goods[i]] || res[j];
            }
            if (res[s]) {
                return true;
            }
        }
        return false;
    }
}
