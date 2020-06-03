package exam.Credible;
/*
危险品装箱
 */
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class One {
    /**
     * main入口由OJ平台调用
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in, StandardCharsets.UTF_8.name());
        int incompatibleNum = cin.nextInt();
        int containerNum = cin.nextInt();

        int[][] incompatibility = new int[incompatibleNum][];
        for (int i = 0; i < incompatibleNum; i++) {
            int cargoId1 = cin.nextInt();
            int cargoId2 = cin.nextInt();
            incompatibility[i] = new int[]{cargoId1, cargoId2};
        }

        List<Integer>[] containers = new List[containerNum];
        for (int i = 0; i < containerNum; i++) {
            int cargoNum = cin.nextInt();
            containers[i] = new ArrayList<>(cargoNum);
            for (int j = 0; j < cargoNum; j++) {
                containers[i].add(cin.nextInt());
            }
        }
        cin.close();

        boolean[] results = isSecure(incompatibility, containers);
        if (results != null) {
            for (boolean result : results) {
                System.out.println(result ? "Yes" : "No");
            }
        }
    }

    static boolean[] isSecure(int[][] incompatibility, List<Integer>[] containers) {
        // TODO 在此补充你的代码
        boolean[] ans=new boolean[containers.length];
        for (int i = 0; i < containers.length; i++) {
            List<Integer> temp=containers[i];
            boolean flag=true;
            for (int j = 0; j < incompatibility.length; j++) {
                if (temp.contains(incompatibility[j][0]) && temp.contains(incompatibility[j][1])) {
                    flag=false;
                    break;
                }
            }
            ans[i]=flag;
        }
        return ans;
    }
}
