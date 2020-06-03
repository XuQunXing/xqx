package programOJ;
/*
70. 循环小数
 */
import java.util.Scanner;

public class CyclicDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str=sc.nextLine();
            if ("0".equals(str)) {
                break;
            }
            int n=Integer.valueOf(str);
            int m= (int) (Math.pow(10,str.length())-1);

            int temp=gcd(n,m);
            String ans=(n/temp)+"/"+(m/temp);
            System.out.println(ans);
        }
    }

    //得到最大公约数
    public static int gcd(int x, int y) {
        int temp = x % y;
        while (temp != 0) {
            x=y;
            y=temp;
            temp=x%y;
        }
        return y;
    }
}
