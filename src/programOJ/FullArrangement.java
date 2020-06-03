package programOJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
46.全排列
 */
public class FullArrangement {
    static List<String> list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            int[] dict=new int[n];
            for (int i = 0; i < n; i++) {
                int temp=i;
                dict[i]=temp+1;
            }
            arrange(0,dict.length,dict);
            Collections.sort(list);
            for (String s:list
                 ) {
                System.out.println(s);
            }
        }
    }

    //全排列
    public static void arrange(int start, int end, int[] dict) {
        if (start == end) {
            String temp="";
            for (int i = 0; i < dict.length; i++) {
                if (i != dict.length - 1) {
                    temp += dict[i] + " ";
                } else {
                    temp+=dict[i];
                }
            }
            list.add(temp);
        }
        for (int i = start; i < end; i++) {
            int temp=dict[start];
            dict[start]=dict[i];
            dict[i]=temp;

            arrange(start+1,end,dict);

            temp=dict[start];
            dict[start]=dict[i];
            dict[i]=temp;
        }
    }
}
