package programOJ;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
23. 最大公约数 Plus
 */
public class GreatestCommonDivisorplus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            System.out.println(2*n&-(2*n));
        }
    }

    /*//求最大公约数
    public static int bigNum(int a, int b) {
        int temp = a % b;
        while (temp != 0) {
            a = b;
            b = temp;
            temp = a % b;
        }
        return b;
    }*/
}
