package programOJ;

import java.util.Scanner;

/*
37. Matrix
 */
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            // 输入
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            // 处理 有问题：1.默认相等情况是往下走的。2.只考虑当前情况 不考虑总体的，可能结果不是最大的。
            int x = 0, y = 0;
            int ans = matrix[0][0];
            while (x < n && y < m) {
                if (x + 1 == n && y + 1 == m) {
                    break;
                } else if (x + 1 == n) {
                    ans += matrix[x][y + 1];
                    y++;
                } else if (y + 1 == m) {
                    ans += matrix[x + 1][y];
                    x++;
                } else {
                    if (matrix[x + 1][y] > matrix[x][y + 1]) {
                        ans += matrix[x + 1][y];
                        x++;
                    } else {
                        ans += matrix[x][y + 1];
                        y++;
                    }
                }
            }

            // 输出
            System.out.println(ans);
        }
    }
}
