package exam.twelve;

import java.util.Scanner;

/*
DOPRA模拟考试第十二期工作级（5.20 ~ 6.3）
    2、数字金字塔
 */
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            for (int i = 1; i <= n; i++) {
                //开始空格
                for (int j = n-i; j >=1; j--) {
                    System.out.print(" ");
                }
                //中间数据
                for (int j = 1; j <=i ; j++) {
                    System.out.print(j);
                }
                for (int j = i-1; j >=1 ; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
