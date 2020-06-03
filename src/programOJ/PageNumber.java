package programOJ;
/*
61. Page Number
 */

import java.util.Scanner;

public class PageNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            //处理输出
            String ans = "";
            if (n < 7) {
                ans = get(n).trim();
            } else {
                //前半部分
                if (k > 4) {
                    ans += 1 + " ... ";
                    for (int i = k - 2; i <= k; i++) {
                        ans += i + " ";
                    }
                } else {
                    ans = get(k);
                }
                //后半部分
                if (n - k > 3) {
                    ans += (k + 1) + " ";
                    ans += (k + 2) + " ";
                    ans += "... " + n;
                } else {
                    for (int i = k + 1; i <= n; i++) {
                        if (i == n) {
                            ans += n;
                        } else {
                            ans += i + " ";
                        }
                    }

                }
            }
            System.out.println(ans);
        }
    }

    //打印
    public static String get(int n) {
        String ans = "";
        for (int i = 1; i <= n; i++) {
            ans += i + " ";
        }
        return ans;
    }
}
