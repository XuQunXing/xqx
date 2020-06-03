package exam.DOPRA.thirteen;

import java.util.*;

/*
3、全排列
 */
public class AllArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }
            List<List<Integer>> ans = new ArrayList<>();
            all(0, n, arr, ans);

            Collections.sort(ans, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    int temp = 0;
                    while (temp < o1.size()) {
                        if (o1.get(temp) == o2.get(temp)) {
                            temp++;
                        } else {
                            return o1.get(temp) - o2.get(temp);
                        }
//                        return o1.get(temp) == o2.get(temp) ? temp++ : o1.get(temp) - o2.get(temp);
                    }
                    return 0;
                }
            });
            for (List<Integer> list : ans
            ) {
                for (int i = 0; i < list.size() - 1; i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println(list.get(list.size() - 1));
            }
        }
    }

    //递归输出
    public static void all(int start, int end, int[] dict, List<List<Integer>> ans) {
        //得到全排列的一种情况
        if (start == end) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < end; i++) {
                temp.add(dict[i]);
            }
            ans.add(temp);
        }
        for (int i = start; i < end; i++) {
            //交换
            int temp = dict[start];
            dict[start] = dict[i];
            dict[i] = temp;
            //转化为子问题dict[start+1]...dict[end-1]的全排列
            all(start + 1, end, dict, ans);
            //回溯
            int temp1 = dict[start];
            dict[start] = dict[i];
            dict[i] = temp1;
        }
    }
}
