package test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(8);
        set.add(12);
        set.add(3);
        set.add(7);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
    }
}
