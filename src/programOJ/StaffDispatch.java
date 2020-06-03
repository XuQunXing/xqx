package programOJ;
/*
217. 员工派遣
 */

import java.util.Scanner;

public class StaffDispatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int cntX = sc.nextInt();
            int cntY = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int k = cntX > cntY ? cntX : cntY;
            while ((k - k / x) < cntX || (k - k / y) < cntY || (k - k / (x * y)) < (cntX + cntY)) {
                k++;
            }
            System.out.println(k);
        }
    }
}
