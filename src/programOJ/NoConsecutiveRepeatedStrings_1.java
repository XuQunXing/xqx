package programOJ;
/*
91. 无连续重复字符串
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NoConsecutiveRepeatedStrings_1 {
    static int n;
    static List<String> arr=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n=sc.nextInt();


            //处理        使用递归方法获得字符串
            for (int i = 1; i <=3 ; i++) {
                addStr(String.valueOf(i));
            }

            //输出        基于正则表达式的去重
            for (String s:arr
                 ) {
                if (s.matches(".*(\\d+)\\1+.*")) {
                    continue;
                }
                System.out.println(s);
            }
        }
    }
    //返回String的list
    private static void addStr(String s) {
        int len=s.length();
        if (len == n) {
            arr.add(s);
            return;
        }
        if (s.charAt(len - 1) == '1') {
            addStr(s+2);
            addStr(s+3);
        }
        if (s.charAt(len - 1) == '2') {
            addStr(s+1);
            addStr(s+3);
        }
        if (s.charAt(len - 1) == '3') {
            addStr(s+1);
            addStr(s+2);
        }
    }

}
