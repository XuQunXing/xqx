package exam.DOPRA.thirteen;

import java.util.Scanner;

/*
1、Page Number
 */
public class PageNumber {
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
            } else if (n == 7) {
                if (k < 4) {
                    for (int i = 1; i <= k + 2; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println("... " + n);
                } else if (k == 4) {
                    for (int i = 1; i <= n - 1; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println(n);
                } else {
                    System.out.print(1 + " ... ");
                    for (int i = k - 2; i < n; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println(n);
                }
            } else if (n == 8) {
                if (k <= 4) {
                    for (int i = 1; i <= k + 2; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println("... " + n);
                } else {
                    System.out.print(1 + " ... ");
                    for (int i = k - 2; i < n; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println(n);
                }
            } else {
                if (k <= 4) {
                    for (int i = 1; i <= k + 2; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println("... " + n);
                }
                if (k > 4 && k < n - 4) {
                    System.out.print(1 + " ... ");
                    for (int i = k - 2; i <= k + 2; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println("... " + n);
                }

                if (k >= n - 4) {
                    System.out.print(1 + " ... ");
                    if (k + 3 >= n) {
                        for (int i = k-2; i <= n; i++) {
                            if (i == n) {
                                System.out.println(i);
                            } else {
                                System.out.print(i + " ");
                            }
                        }
                    } else {
                        for (int i = k - 2; i <=k+2; i++) {
                            System.out.print(i + " ");
                        }
                        System.out.println("... "+n);
                    }

                }
            }
        }
    }
}
