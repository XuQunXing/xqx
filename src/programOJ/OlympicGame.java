package programOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OlympicGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入数据
            int n = sc.nextInt();
            List<County> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                County county = new County(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                list.add(county);
            }
            //处理数据
            list.stream().sorted().forEach((item) -> {
                System.out.println(item.name);
            });
        }
    }

    private static class County implements Comparable<County> {
        private String name;
        private int g;
        private int s;
        private int b;

        public County(String name, int g, int s, int b) {
            this.name = name;
            this.g = g;
            this.s = s;
            this.b = b;
        }

        @Override
        public int compareTo(County county) {
            if (g > county.g) {
                return -1;
            } else if (g == county.g) {
                if (s > county.s) {
                    return -1;
                } else if (s == county.s) {
                    if (b > county.b) {
                        return -1;
                    } else if (b == county.b) {
                        return name.compareTo(county.name);
                    } else {
                        return 1;
                    }
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        }
    }
}
