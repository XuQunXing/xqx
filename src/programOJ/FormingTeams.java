package programOJ;
/*
99. Forming Teams
 */
import java.util.*;

public class FormingTeams {
    static int[] student=new int[101];
    static int[] numForSet=new int[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            int m=sc.nextInt();

            for (int i = 1; i <=n ; i++) {
                student[i]=i;
                numForSet[i]=1;
            }

            //有两个敌人的话出列一个
            int ans=0;
            for (int i = 0; i < m; i++) {
                int temp1=sc.nextInt();
                int temp2=sc.nextInt();

                int root1=findRoot(temp1);
                int root2=findRoot(temp2);
                if (root1 == root2 && numForSet[root1] % 2 == 1) {
                    ans++;
                } else {
                    //吧找到的并起来
                    student[root2]=root1;
                    numForSet[root1]+=numForSet[root2];
                }
            }

            //奇数的话在出列一个人
            if ((n - ans) % 2 != 0) {
                ans++;
            }

            System.out.println(ans);
        }
    }

    //并查集
    public static int findRoot(int x) {
        if (student[x] != x) {
            return findRoot(student[x]);
        }
        return x;
    }
}
