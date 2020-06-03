package exam.DOPRA.thirteen;

import java.util.Scanner;

/*
2、猴子爬山
 */
public class MonkeyClimb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            long ans=0;
            if (n < 3) {
                ans=1;
            } else if (n == 3) {
                ans=2;
            } else {
                int three=n/3;
                ans=1;
                for (int i = 1; i <=three ; i++) {
                    int total=n-3*i+i;
                    long temp=1;
                    long down=1;
                    for (int j = 0; j <i ; j++) {
                        temp*=total-j;
                        down*=i-j;
                    }
                    ans+=temp/down;
                }
            }
            System.out.println(ans);
        }
    }
}
