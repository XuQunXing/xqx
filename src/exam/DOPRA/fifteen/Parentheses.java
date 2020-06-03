package exam.DOPRA.fifteen;

import java.util.Scanner;

/*
1、Parentheses
 */
public class Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            while (str.contains("()")) {
                str=str.replace("()","");
            }
            System.out.println(str.length());
        }
    }
}
