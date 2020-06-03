package programOJ;
/*
73. N! Plus Plus
 */
import java.util.Scanner;

public class NPlusPlus_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();

            //处理
            //斯特林公式介绍 : https://blog.csdn.net/u012313335/article/details/38414477
            System.out.println(1+(int)(Math.log10(Math.PI*2*n)*0.5+n*(Math.log10(n)-Math.log10(Math.E))));
        }
    }
}
