package programOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
27.calculator
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            //去除空格
            while (str.contains(" ")) {
                str = str.replace(" ", "");
            }
            List<Integer> numbers = new ArrayList<>();
            //得到第一个数
            int i = 0;
            String temp = "";
            while (i < str.length() && str.charAt(i) != '+' && str.charAt(i) != '-') {
                temp += str.charAt(i);
                i++;
            }
            int ans = Integer.parseInt(temp);
            temp = "0";
            boolean flag = true;
            while (i < str.length()) {
                if (str.charAt(i) == '+') {
                    temp = "";
                    flag = true;
                    i++;
                } else if (str.charAt(i) == '-') {
                    temp = "";
                    flag = false;
                    i++;
                } else {
                    while (i < str.length() && str.charAt(i) != '+' && str.charAt(i) != '-') {

                        temp += str.charAt(i);
                        i++;
                    }
                    if (flag) {
                        ans += Integer.parseInt(temp);
                    } else {
                        ans -= Integer.parseInt(temp);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
