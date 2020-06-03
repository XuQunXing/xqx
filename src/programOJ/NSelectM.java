package programOJ;
/*
47. n选m
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NSelectM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            List<Integer> list=new ArrayList<>();
            dfs(n,m,1,list);
        }
    }

    //dfs
    public static void dfs(int n, int m, int now, List<Integer> result) {
        if (result.size() == m) {
            for (int i = 0; i < result.size()-1; i++) {
                System.out.print(result.get(i)+" ");

            }
            System.out.println(result.get(result.size()-1));
            return;
        }
        for (int i = now; i <=n ; i++) {
            result.add(i);
            dfs(n,m,i+1,result);
            result.remove(result.size()-1);
        }
    }
}
