package programOJ;
/*
939. 金币路径
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GoldCoinPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            int b = Integer.valueOf(sc.nextLine());
            String[] str = sc.nextLine().split(" ");
            int[] arr = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            //处理
            //TODO

        }
    }
    //计算最小金币
}
