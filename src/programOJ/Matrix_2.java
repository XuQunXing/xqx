package programOJ;

import java.util.Scanner;

/*
37. Matrix
 */
public class Matrix_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            // 输入和处理
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n + 1][m + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    int temp = sc.nextInt();
                    matrix[i][j] += matrix[i - 1][j] > matrix[i][j - 1] ? matrix[i - 1][j] : matrix[i][j - 1];
                }
            }
            // 输出
            System.out.println(matrix[n - 1][m - 1]);
        }
    }
}
