package exam.Credible;
/*
单个TLV解析II
 */
import com.sun.webkit.graphics.WCImageFrame;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Two {
    /**
     * main入口由OJ平台调用
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in, StandardCharsets.UTF_8.name());
        List<String> bitStream = new LinkedList<>();
        while (cin.hasNext()) {
            bitStream.add(cin.next());
        }
        cin.close();

        System.out.println(parseTLV(bitStream));
    }

    static String parseTLV(List<String> bitStream) {
        // TODO 在此补充你的代码
        String ans = "";
        //转化为十进制
        String TStr = bitStream.get(0) + bitStream.get(1);
        ans += "{T:" + convert(TStr) + ",";
        String LStr = bitStream.get(2) + bitStream.get(3) + bitStream.get(4) + bitStream.get(5);
        long count1 = convert(LStr);
        ans += "L:" + count1 + ",";

        if ((bitStream.size() - 6) < count1) {
            ans += "V:" + -1 + "}";
        }else {
            int count2 = 0;
            for (int i = 6; i < count1+6; i++) {
                String temp = bitStream.get(i);
                char ch=(char) convert(temp);
                if (Character.isLetter(ch)) {
                    count2++;
                }

            }
            ans += "V:" + count2 + "}";
        }
        return ans;
    }

    //十六进制转化为十进制     注意对位数的判断，应该为long。因为如果是四个f的话就会超范围
    static long convert(String str) {
        long ans=0;
        long temp=0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    temp = 10;
                    break;
                case 'b':
                    temp = 11;
                    break;
                case 'c':
                    temp = 12;
                    break;
                case 'd':
                    temp = 13;
                    break;
                case 'e':
                    temp = 14;
                    break;
                case 'f':
                    temp = 15;
                    break;
                default:
                    temp = str.charAt(i) - '0';
            }
            ans+=temp*Math.pow(16,str.length()-1-i);
        }
        return ans;
    }
}
/*
00 00 00 00 00 0a 68 65 6c 4c 6f 20 77 6f 72 64 64
 */