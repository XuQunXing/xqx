package programOJ;
/*
1027. 最优账单平衡
 */
import javax.swing.plaf.SpinnerUI;
import java.util.*;

public class OptimalBillingBalance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            Map<Integer,Integer> money=new HashMap<>();
            //价格计算
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int mon=sc.nextInt();

                if (money.containsKey(a)) {
                    money.put(a, money.get(a) - mon);
                } else {
                    money.put(a,-mon);
                }
                if (money.containsKey(b)) {
                    money.put(b, money.get(b) + mon);
                } else {
                    money.put(b,mon);
                }
            }
            
            //处理
            ArrayList<Integer> list=new ArrayList<>();
            for (Map.Entry<Integer,Integer> m:money.entrySet()
                 ) {
                if (m.getValue() != 0) {
                    list.add(m.getValue());
                }
            }
            int[] arr=new int[list.size()];
            for (int i = 0; i <list.size() ; i++) {
                arr[i]=list.get(i);
            }

            int ans=helper(arr,0,0);


            System.out.println(ans);
        }
    }
    //递归调用
    static int res=Integer.MAX_VALUE;
    public static int helper(int[] dict,int start,int count) {
        int n=dict.length;
        while (start < n && dict[start] == 0) {
            start++;
        }
        if (start == n) {
            res=Math.min(res,count);
        }
        for (int i = start+1; i <n ; i++) {
            if ((dict[i] < 0 && dict[start] > 0) || (dict[i] > 0 && dict[start] < 0)) {
                dict[i]+=dict[start];
                res=Math.min(res,helper(dict,start+1,count+1));
                dict[i]-=dict[start];
            }
        }
        return res;
    }
}
