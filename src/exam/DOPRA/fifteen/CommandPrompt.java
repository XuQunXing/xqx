package exam.DOPRA.fifteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
3、命令提示符
 */
public class CommandPrompt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            List<String> list = new ArrayList<>();
            list.add("C:");
            list.add("Users");
            list.add("hp");

            int n = Integer.valueOf(sc.nextLine());
            String ans = "";
            out(list, ans);
            for (int i = 0; i < n; i++) {
                String[] strings = sc.nextLine().split(" ");
                if ("..".equals(strings[1])) {
                    if (list.size() != 1) {
                        list.remove(list.size() - 1);
                    }
                } else {
                    list.add(strings[1]);
                }
                //输出
                if (list.size() == 1) {
                    System.out.println("C:\\>");
                } else {
                    ans = "";
                    out(list, ans);
                }

            }
        }
        sc.close();
    }

    private static void out(List<String> list, String ans) {
        for (int j = 0; j < list.size(); j++) {
            if (j != list.size() - 1) {
                ans += list.get(j) + "\\";
            } else {
                ans += list.get(j) + ">";
            }

        }
        System.out.println(ans);
    }
}
