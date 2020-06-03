package programOJ;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
30.字符串重排
 */
public class StringRearrangement_1 {
    /**
     *  运用数学方法，总的长度的阶乘处于每个字母的阶乘
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int up=factorial(str.length());
            int down=1;
            int[] count=count(str);
            for (int i:count
                 ) {
                if (i != 0) {
                    down*=factorial(i);
                }
            }
            System.out.println(up/down);
        }
    }

    //求字母出现频次
    public static int[] count(String string) {
        int[] count=new int[26];
        for (int i = 0; i < string.length(); i++) {
            char ch=string.charAt(i);
            count[ch-'A']++;
        }
        return count;
    }
    //阶乘
    public static int factorial(int n) {
        int ans=1;
        for (int i = 2; i <= n; i++) {
            ans*=i;
        }
        return ans;
    }
}
