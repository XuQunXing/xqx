package programOJ;
/*
51. 数字金字塔
 */
import java.util.Scanner;

public class DigitalPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            //输出
            for (int i = 1; i <= n; i++) {
                //前空格
                for (int j = n-i; j >0; j--) {
                    System.out.print(" ");
                }
                //前数字
                for (int j = 1; j <=i; j++) {
                    System.out.print(j);
                }
                //后数字
                for (int j = i-1; j >=1 ; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
