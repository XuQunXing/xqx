package programOJ;
/*
 Calculator Ver.2
 */
import java.util.Scanner;

public class CalculatorVer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str=sc.nextLine();
            int count=0;
            for (int i = 0; i < str.length(); i++) {
                char ch=str.charAt(i);
                if (ch == '(') {
                    count++;
                } else if (ch == ')') {
                    count--;
                }
                if (count < 0) {
                    break;
                }
            }
            if (count == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
