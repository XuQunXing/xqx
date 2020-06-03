package exam.DOPRA.twelve;

import java.util.*;

/*
3 数数字
 */
public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            long l=sc.nextLong();
            long r=sc.nextLong();
            long n=sc.nextLong();
            //处理
            Set<Long> set=new HashSet<>();
            for (long i = l; i <=r ; i++) {
                String temp=String.valueOf(i);
                if (!temp.contains(String.valueOf(n))) {
                    set.add(i);
                }
            }
            //输出
            System.out.println(set.size());
        }
    }
}
/*
判断集合是否包含给定数组
 */