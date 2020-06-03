package programOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
75. Prime Ring Problem
 */
public class PrimeRingProblem {

    private static boolean[] visited;
    private static int[] dict;
    private static boolean[] isPrime;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //找出30以内的素数
        isPrime=new boolean[30];
        isPrime[2]=true;
        for (int i = 3; i <=30 ; i++) {
            int flag=0;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    flag=1;
                    break;
                }
            }
            if (flag == 0) {
                isPrime[i]=true;
            }
        }

        int x=1;
        List<Integer> list=new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            int n=list.get(i);
            visited=new boolean[n+1];
            dict=new int[n];
            dict[0]=1;
            visited[1]=true;

            //输出

            System.out.println("Case "+(x++)+" :");
            permutations(1,n);
            if (i != list.size() - 1) {
                System.out.println();
            }
        }
    }

    //打印符合圆环数字的序列
    public static void permutations(int index, int n) {
        if (index == n) {
            if (isPrime[dict[0] + dict[n - 1]]) {
                for (int i = 0; i < n - 1; i++) {
                    System.out.print(dict[i] + " ");
                }
                System.out.println(dict[n - 1]);
            }
        } else {
            for (int i = 2; i <=n ; i++) {
                if (visited[i]) {
                    continue;
                }
                if (isPrime[dict[index - 1] + i]) {
                    dict[index]=i;
                    visited[i]=true;

                    permutations(index+1,n);

                    visited[i]=false;
                }
            }
        }

    }
}
