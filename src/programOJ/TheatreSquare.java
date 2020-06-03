package programOJ;
/*
50. Theatre Square
 */
import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long n=sc.nextLong();
            long m=sc.nextLong();
            long a=sc.nextLong();

            //处理
            long x=0,y=0;
            while (x * a < n) {
                x++;
            }
            while (y * a < m) {
                y++;
            }
            System.out.println(x*y);
        }
    }
}
