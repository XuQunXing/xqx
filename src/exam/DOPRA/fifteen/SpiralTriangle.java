package exam.DOPRA.fifteen;

import java.util.Scanner;

/*
2、螺旋三角
 */
public class SpiralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            int[][] arr=new int[n][n];
            //处理
            int count=1;//数字
            int num=1;
            int i=0,j=-1;
            int last=n;
            DIRECT direct=DIRECT.RIGHT;
            while (last > 0) {
                if (direct == DIRECT.RIGHT) {
                    arr[i][++j]=num++;
                    count++;
                    if (count > last) {
                        count=1;
                        direct=DIRECT.DOWN;
                        last--;
                    }
                } else if (direct == DIRECT.DOWN) {
                    arr[++i][--j] = num++;
                    count++;
                    if (count > last) {
                        count = 1;
                        direct = DIRECT.UP;
                        last--;
                    }
                } else {
                    arr[--i][j]=num++;
                    count++;
                    if (count > last) {
                        count=1;
                        direct=DIRECT.RIGHT;
                        last--;
                    }
                } 
            }
            //输出
            int next=n;
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    if (arr[k][l] != 0) {
                        if (l != next - 1) {
                            System.out.print(arr[k][l] + " ");
                        } else {
                            System.out.println(arr[k][l]);
                        }
                    }
                }
                next--;
            }
        }
    }

    enum DIRECT {
        RIGHT,
        UP,
        DOWN;
    }
}

