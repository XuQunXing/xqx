package programOJ;

import java.util.Scanner;

/*
37. Matrix
 */
public class Matrix_1 {
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
            // 处理 参考别人的动态规划
            // 初始化首行
            for (int i = 1; i < m; i++) {
                matrix[0][i] = matrix[0][i] + matrix[0][i - 1];
            }
            //初始化首列
            for (int i = 1; i < n; i++) {
                matrix[i][0] = matrix[i][0] + matrix[i - 1][0];
            }
            // 按行遍历其他
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]) + matrix[i][j];
                }
            }

            // 输出
            System.out.println(matrix[n - 1][m - 1]);
        }
    }
}
