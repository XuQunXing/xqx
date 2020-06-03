package programOJ;
/*
1341. 服务器连接
 */

import java.util.Scanner;

public class ServerConnection {
    static int n;
    static int[] dict;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            n = sc.nextInt();
            dict=new int[n+1];
            for (int i = 0; i < n+1; i++) {
                dict[i]=i;
            }
            //总服务器数量，一次递减
            int ans=n;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int temp=sc.nextInt();
                    //如果联通的话，根节点标记成一样。服务器数量减一
                    if (temp == 1) {
                        int rootI=find(i);
                        int rootJ=find(j);
                        if (rootI != rootJ) {
                            dict[rootJ]=rootI;
                            ans--;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }

    //查找
    public static int find(int x) {
        if (dict[x] != x) {
            return find(dict[x]);
        }
        return x;
    }
}
