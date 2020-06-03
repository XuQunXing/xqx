package programOJ;

import java.util.Scanner;

/*
1、螺旋队列
 */
public class SpiralQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            int a=sc.nextInt();
            int b=sc.nextInt();
            //处理
            int ans=0;
            if (a == 0 && b == 0) {
                ans=1;
            }else {
                int big,bigValue,littleValue;//所在层数,以及最大值
                big=Math.abs(a)>Math.abs(b)?Math.abs(a):Math.abs(b);
                bigValue=(2*big+1)*(2*big+1);
                littleValue=(2*(big-1)+1)*(2*(big-1)+1)+1;
                if (a == big && (b > -big && b <= big)) {//右边线
                    ans=littleValue+(b-(-big+1));
                }
                int rightDown=littleValue+(big-(-big+1));//右下
                if (b == big && (a >= -big && a < big)) {//下边线
                    ans=rightDown+(big-a);
                }
                int leftDown=rightDown+2*big;//左下
                if (a == -big && (b >= -big && b < big)) {//左边线
                    ans=leftDown+(big-b);
                }
                int leftUp=leftDown+2*big;//左下
                if (b == -big && (a > -big && a <= big)) {//上边线
                    ans=leftUp+(a+big);
                }
            }

            //输出
            System.out.println(ans);
        }
    }
}
/*

 */