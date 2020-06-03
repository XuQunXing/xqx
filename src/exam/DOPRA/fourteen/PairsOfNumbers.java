package exam.DOPRA.fourteen;
/*
2、pairs of numbers
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 可以实现，但是超时，正向会超时。考虑逆向实现
 */
public class PairsOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            List<pair> list = new ArrayList<>();
            list.add(new pair(1, 1));
            int count=0;
            while (!isTrue(list, n)) {
                List<pair> temp = new ArrayList<>();
                for (pair p : list
                ) {
                    temp.add(new pair(p.a + p.b, p.b));
                    temp.add(new pair(p.a, p.a + p.b));
                }
                list=temp;
                count++;
            }
            System.out.println(count);
        }
    }

    //判断list中是否有对应数字
    public static boolean isTrue(List<pair> list, int target) {
        for (pair p : list
        ) {
            if (p.a == target || p.b == target) {
                return true;
            }
        }
        return false;
    }

    //对象：数对
    private static class pair {
        int a;
        int b;

        public pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
