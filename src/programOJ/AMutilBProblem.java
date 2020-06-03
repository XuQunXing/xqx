package programOJ;

import java.math.BigInteger;
import java.util.Scanner;

/*
17. A×B Problem
 */
public class AMutilBProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            BigInteger a = new BigInteger(String.valueOf(sc.next()));
            BigInteger b = new BigInteger(String.valueOf(sc.next()));
            System.out.println(a.multiply(b));
        }
    }
}
