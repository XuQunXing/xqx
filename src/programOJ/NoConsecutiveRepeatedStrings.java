package programOJ;
/*
91. 无连续重复字符串
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NoConsecutiveRepeatedStrings {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n=sc.nextInt();


            //处理
            List<String> list=new ArrayList<>();
            list.add("1");
            list.add("2");
            list.add("3");
            List<String> ans=getStr(list);
            Collections.sort(ans);

            //输出
            for (String s:ans
                 ) {
                System.out.println(s);
            }
        }
    }
    //返回String的list
    private static List<String> getStr(List<String> list) {
        while (list.get(0).length() < n) {
            List<String> ans=new ArrayList<>();
            int len=list.get(0).length();
            for (String s:list
                 ) {
                if (s.charAt(len - 1) == '1') {
                    if (isSame(s + "2")) {
                        ans.add(s+"2");
                    }
                    if (isSame(s+"3")) {
                        ans.add(s+"3");
                    }
                } else if (s.charAt(len - 1) == '2') {
                    if (isSame(s + "1")) {
                        ans.add(s+"1");
                    }
                    if (isSame(s+"3")) {
                        ans.add(s+"3");
                    }
                }else if (s.charAt(len - 1) == '3') {
                    if (isSame(s + "1")) {
                        ans.add(s+"1");
                    }
                    if (isSame(s+"2")) {
                        ans.add(s+"2");
                    }
                }
            }
            list=ans;
        }
        return list;
    }

    //判断字串
    private static boolean isSame(String str) {
        for (int i = 2; i <str.length() ; i++) {
            for (int j = 0; j <= str.length()-2*i; j++) {
                if (str.substring(j, j + i).equals(str.substring(j + i, j + 2 * i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
