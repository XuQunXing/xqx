package programOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Standings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long a = sc.nextLong();
            List<Long> ans = new ArrayList<>();
            for (long i = 1; i <= a; i++) {
                if (a % i == 0) {
                    ans.add(i);
                }
            }
            System.out.print(ans.size() + " ");
            for (long l : ans
            ) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
