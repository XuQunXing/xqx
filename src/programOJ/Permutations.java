package programOJ;

import java.util.Scanner;

/*
71. Permutations
 */
public class Permutations {
    private static int N;
    private static boolean[] used;
    private static int[] results;
    private static int[][] numbers;
    private static int min;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            String[] strings=sc.nextLine().split(" ");
            int n=Integer.valueOf(strings[0]);
            int k=Integer.valueOf(strings[1]);

            N=k;
            numbers=new int[n][k];
            used=new boolean[k];
            results=new int[k];
            min=Integer.MAX_VALUE;


            for (int i = 0; i < n; i++) {
                String str=sc.nextLine();
                for (int j = 0; j < k; j++) {
                    numbers[i][j]=str.charAt(j)-'0';
                }

            }
            //处理
            //求k位数的全排列，并计算差值
            make(0);

            //输出
            System.out.println(min);
        }
    }
    //重排
    public static void make(int level) {

        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                used[i]=true;
                results[level]=i;

                make(level+1);
                used[i]=false;
            }
        }

        if (level == N - 1) {
            //计算本次重排的最大数和最小数差值
            int difference=getDiff();
            min=Math.min(min,difference);
        }
    }
    //得到差值
    public static int getDiff() {
        int maxNum=-1;
        int minNUm=Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            //计算重排后的整数值
            int number=0;
            for (int j = 0; j < N; j++) {
                number=number*10+numbers[i][results[j]];
            }

            maxNum=Math.max(maxNum,number);
            minNUm=Math.min(minNUm,number);
        }
        return maxNum-minNUm;
    }
}
