package programOJ;
/*
141. 算数的最小计算时间
 */
import java.util.*;

public class ArithmeticMinimumCalculationTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            int ans=0;
            while (list.size() > 1) {
                int a=list.remove(0);
                int b=list.remove(0);
                ans+=(a+b);
                list.add(a+b);
                Collections.sort(list);
            }
            System.out.println(ans);
        }
    }
}
