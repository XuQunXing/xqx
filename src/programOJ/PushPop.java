package programOJ;
/*
327. Push Pop
 */

import java.util.*;

public class PushPop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            int n = sc.nextInt();
            String[][] strings = new String[n][2];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    strings[i][j] = sc.next();
                }
            }
            //处理
            Container container=new Container();
            for (int i = 0; i < n; i++) {
                if ("push".equals(strings[i][0])) {
                    container.push(Integer.valueOf(strings[i][1]));
                }else if ("pop".equals(strings[i][0])) {
                    System.out.println(container.pop(Integer.valueOf(strings[i][1])));
                }
            }
        }
    }

    public static class Container {
        TreeSet<Integer> set = new TreeSet<>();

        public  void push(int x) {
            set.add(x);
        }

        public  String pop(int x) {
            String ans = "No Element!";
            if (set.isEmpty()) {
                return ans;
            } else if (set.first() > x) {
                return ans;
            } else if (set.last() <= x) {
                return String.valueOf(set.pollLast());
            } else {
                //找到直接删除
                Iterator<Integer> it=set.iterator();
                while (it.hasNext()) {
                    int temp=it.next();
                    if (temp == x) {
                        set.remove(temp);
                        return  String.valueOf(temp);
                    }
                }
                //没有找到
                int big=0;
                set.add(x);
                Iterator<Integer> its=set.iterator();
                while (its.hasNext()) {
                    int temp=its.next();
                    if (temp == x) {
                        set.remove(temp);
                        break;
                    }
                    big=temp;
                }
                set.remove(big);
                return String.valueOf(big);
            }
        }
    }
}
