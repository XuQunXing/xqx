package programOJ;
/*
240. 英雄联盟
 */
import java.util.Scanner;

public class LeagueOfLegends {
    static int total;
    static int sum;
    static int res=0x7fffffff;
    static int[] heroes=new int[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            for (int i = 0; i <10 ; i++) {
                heroes[i]=sc.nextInt();
                total+=heroes[i];
            }
            dfs(1,-1);
            System.out.println(res);
        }
    }

    //求解
    public static void dfs(int index, int last) {
        if (index == 6) {
            int t=Math.abs(total-sum*2);
            res=t<res?t:res;
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (i > last) {
                sum+=heroes[i];
                dfs(index+1,i);
                sum-=heroes[i];
            }
        }
    }
}
