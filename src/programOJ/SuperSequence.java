package programOJ;

import java.util.Scanner;

/*
62. Super Sequence
 */
public class SuperSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            int len=0;
            int i=1;
            while (len < n) {
                len+=Integer.toString(i++).length();
            }
            String s=Integer.toString(i-1);
            int diff=len-s.length();
            System.out.println(s.charAt(n-diff-1));
        }
    }

}
