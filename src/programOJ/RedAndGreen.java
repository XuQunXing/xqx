package programOJ;
/*
25. Red And Green
 */
import java.util.Scanner;

public class RedAndGreen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str=sc.nextLine();
            int ans=0;
            while (str.contains("GR")) {
                str=str.replaceFirst("GR","");
                ans++;
            }
            System.out.println(ans);
        }
    }
}
