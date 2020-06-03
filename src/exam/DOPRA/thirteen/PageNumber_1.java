package exam.DOPRA.thirteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
1、Page Number
 */
public class PageNumber_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            int n = sc.nextInt();
            int k = sc.nextInt();
            //处理
            if (n < 7) {
                for (int i = 1; i < n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println(n);
            } else {
                List<Integer> list=new ArrayList<>(7);
                if (k <= 3) {
                    for (int i = 1; i <= k+2; i++) {
                        list.add(i);
                    }
                    list.add(n);
                }else if (k >= n-3) {
                    list.add(1);
                    for (int i = n-2; i <= n; i++) {
                        list.add(i);
                    }
                }else {
                    list.add(1);
                    for (int i = n-2; i <= n+2; i++) {
                        if (!list.contains(i)) {
                            list.add(i);
                        }
                    }
                    if (!list.contains(n)) {
                        list.add(n);
                    }
                }
                Collections.sort(list);
                int len=list.size();
                if (list.get(1)-1 != list.get(0)&&list.get(len-1)+1 != list.get(len-1)) {
                    System.out.print(list.get(0)+" ... ");
                    for (int i = 1; i <= len-2; i++) {
                        System.out.print(list.get(i)+" ");
                    }
                    System.out.print("... "+list.get(len-1));
                } else if (list.get(1) - 1 != list.get(0) && list.get(len - 1) + 1 == list.get(len - 1)) {
                    System.out.print(list.get(0)+" ... ");
                    for (int i = 1; i <= len-2; i++) {
                        System.out.print(list.get(i)+" ");
                    }
                    System.out.print(list.get(len-1));
                } else if (list.get(1) - 1 == list.get(0) && list.get(len - 1) + 1 != list.get(len - 1)) {
                    for (int i = 0; i <= len-2; i++) {
                        System.out.print(list.get(i)+" ");
                    }
                    System.out.print("... "+list.get(len-1));
                } else {
                    for (int i = 0; i <= len-2; i++) {
                        System.out.print(list.get(i)+" ");
                    }
                    System.out.print(list.get(len-1));
                }
            }
        }
    }
}
