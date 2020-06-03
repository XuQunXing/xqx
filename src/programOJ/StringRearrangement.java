package programOJ;

import java.util.*;

/*
30.字符串重排
 */
public class StringRearrangement {
    /**
     *  运行内存超出限制
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            Set<String> set = new HashSet<>();
            char[] chars = str.toCharArray();
            rearrange(chars, 0, chars.length, set);
            System.out.println(set.size());
        }
    }

    //排列
    public static void rearrange(char[] chars, int start, int end, Set<String> set) {
        if (start == end) {
            set.add(String.valueOf(chars));
        }
        for (int i = start; i < end; i++) {
            char temp = chars[start];
            chars[start] = chars[i];
            chars[i] = temp;

            rearrange(chars, start + 1, end, set);

            temp = chars[start];
            chars[start] = chars[i];
            chars[i] = temp;
        }

    }
}
