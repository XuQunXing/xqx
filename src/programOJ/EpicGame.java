package programOJ;
/*
49. Epic Game
 */
import java.util.Scanner;

public class EpicGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();

            //处理
            boolean flag;
            while (true) {
                int temp=gcd(n,a);
                if (n<temp) {
                    flag=false;
                    break;
                }
                n-=temp;

                temp=gcd(n,b);
                if (n<temp) {
                    flag=true;
                    break;
                }
                n-=temp;
            }

            //输出
            System.out.println(flag?0:1);
        }
    }

    //求最大公约数
    public static int gcd(int x, int y) {
        int temp=x%y;
        while (temp != 0) {
            x=y;
            y=temp;
            temp=x%y;
        }
        return y;
    }
}
