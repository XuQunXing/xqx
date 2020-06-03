package programOJ;
/*
44. Calculate the Sum
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculateTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int x = Integer.valueOf(str);
            for (int i = 0; i < x; i++) {
                String m = sc.nextLine();
                String n = sc.nextLine();

                int ans = 0;
                Map<Integer, Integer> mInt = getInt(m);
                Map<Integer, Integer> nInt = getInt(n);
                for (Map.Entry<Integer, Integer> entry1 : mInt.entrySet()
                ) {
                    for (Map.Entry<Integer, Integer> entry2 : nInt.entrySet()
                    ) {
                        ans += entry1.getKey() % entry2.getKey() * entry1.getValue() * entry2.getValue();
                    }
                }

                System.out.println(ans);
            }
        }
        sc.close();
    }

    //得到每个数字的个数
    public static Map<Integer, Integer> getInt(String string) {
        Map<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            int num = ch - '0';
            if (ans.containsKey(num)) {
                ans.put(num, ans.get(num) + 1);
            } else {
                ans.put(num, 1);
            }
        }
        return ans;
    }
}
