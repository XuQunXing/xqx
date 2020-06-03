package exam.DOPRA.thirteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
2、24点游戏
 */
public class TwentyFourGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            String string=sc.nextLine();
            List<Integer> poke=new ArrayList<>();
            String[] strs=string.split(" ");
            for (int i = 0; i < 4; i++) {
                switch (strs[i]) {
                    case "A":
                        poke.add(1);break;
                    case "T":
                        poke.add(10);break;
                    case "J":
                        poke.add(11);break;
                    case "Q":
                        poke.add(12);break;
                    case "K":
                        poke.add(13);break;
                    default:
                        poke.add(Integer.parseInt(strs[i]));
                }
            }
            if (judge(poke)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    //判断能否组成24点
    public static boolean judge(List<Integer> poke) {
        if (poke.size() == 1) {
            if (poke.get(0) == 24) {
                return true;
            } else {
                return false;
            }
        }
        for (int i = 0; i < poke.size()-1; i++) {
            for (int j = i+1; j < poke.size(); j++) {
                int a=poke.remove(i);
                int b=poke.remove(j);
                poke.add(0,a+b);
                judge(poke);
                poke.remove(0);

                poke.add(0,a-b);
                judge(poke);
                poke.remove(0);

                poke.add(0,b-a);
                judge(poke);
                poke.remove(0);

                poke.add(0,a*b);
                judge(poke);
                poke.remove(0);

                if (b != 0) {
                    poke.add(0,a/b);
                    judge(poke);
                    poke.remove(0);
                }

                if (a != 0) {
                    poke.add(0,b/a);
                    judge(poke);
                    poke.remove(0);
                }
            }
        }
        return false;
    }
}
