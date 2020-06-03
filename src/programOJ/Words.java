package programOJ;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            str = str.trim();
            String[] strs = str.split(" ");
            double n = strs.length;
            double ans = 0;
            for (String s : strs
            ) {
                ans += s.length();
            }
            System.out.printf("%.2f\n",ans / n);
        }
    }
}
