package programOJ;

import java.util.Scanner;

/*
52. 字符串相等
 */
public class StringEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String strA=sc.nextLine().replaceAll(" ","");
            String strB=sc.nextLine().replaceAll(" ","");
            if (strA.equalsIgnoreCase(strB)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
