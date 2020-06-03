package exam.DOPRA.fourteen;
/*
3、字符串重排
 */
import java.util.Scanner;

public class StringRearrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str=sc.nextLine();
            long up=factorial(str.length());
            long down=1;
            int[] count=count(str);
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    down*=factorial(count[i]);
                }
            }
            System.out.println(up/down);
        }
    }

    //求阶乘
    public static long factorial(long n) {
        long ans=1;
        for (long i = 2; i <=n ; i++) {
            ans*=i;
        }
        return ans;
    }
    //求字母次数
    public static int[] count(String string) {
        int[] ans=new int[26];
        for (int i = 0; i < string.length(); i++) {
            char ch=string.charAt(i);
            ans[ch-'A']++;
        }
        return ans;
    }
}
