package programOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
27.calculator
 */
public class Calculator_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            //换一种思路  吧-换成+- 即加上﹣的
            String[] strs=str.replace(" ","").replace("-","+-").split("\\+");
            int ans=0;
            for (String s:strs
                 ) {
                if (s == null || s == "") {
                    continue;
                }
                ans+=Integer.parseInt(s);
            }
            System.out.println(ans);
        }
    }
}
