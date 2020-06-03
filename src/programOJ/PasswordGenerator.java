package programOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
80. 密码发生器
 */
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            int n=Integer.valueOf(sc.nextLine());
            for (int i = 0; i < n; i++) {
                String str=sc.nextLine();

                //1.字符串分割
                List<String> list=new ArrayList<>();
                while (str.length() > 6) {
                    list.add(str.substring(0,6));
                    str=str.substring(6);
                }
                list.add(str);

                //2.得到数字
                int[] number=getNum(list);

                //3.数字缩位
                String ans=littleNum(number);

                //输出
                System.out.println(ans);
            }


        }
    }

    //对应位置的ascii吗值相加得到数字
    public static int[] getNum(List<String> list) {
        int[] num=new int[6];
        for (int i = 0; i < 6; i++) {
            for (String s:list
                 ) {
                if (s.length() > i) {
                    num[i]+=s.charAt(i);
                }
            }
        }
        return num;
    }

    //数字缩位处理，每个位置的数字相加
    public static String  littleNum(int[] num) {
        String ans="";
        for (int i = 0; i < 6; i++) {
            while (num[i] > 9) {
                String str=String.valueOf(num[i]);
                int temp=0;
                for (int j = 0; j < str.length(); j++) {
                    temp+=str.charAt(j)-'0';
                }
                num[i]=temp;
            }
            ans+=num[i];
        }
        return ans;
    }
}
