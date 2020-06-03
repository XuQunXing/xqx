package programOJ;

import java.math.BigInteger;
import java.util.Scanner;

/*
16. A-B Problem Plus
 */
public class ASubtractBProblemPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            for (int i = 0; i < n; i++) {
                int temp=i+1;

                BigInteger a=new BigInteger(String.valueOf(sc.next()));
                BigInteger b=new BigInteger(String.valueOf(sc.next()));
                System.out.println("Case "+temp+":");
                System.out.println(a+" - "+b+" = "+a.subtract(b));
                if (i != n - 1) {
                    System.out.println();
                }
            }
        }
    }
}
