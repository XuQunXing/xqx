package programOJ;
/*
1343. 前K个高频单词
 */
import java.util.*;

public class TopKHighFrequencyWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t=Integer.parseInt(sc.nextLine());
            Map<String,Integer> map=new TreeMap<>();
            for (int i = 0; i < t; i++) {
                String temp=sc.nextLine();
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp,1);
                }
            }
            int m=sc.nextInt();

            List<Map.Entry> list=new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry>() {
                @Override
                public int compare(Map.Entry o1, Map.Entry o2) {
                    return (int)o2.getValue()-(int)o1.getValue();
                }
            });

            for (int i = 0; i < m; i++) {
                Map.Entry temp=list.get(i);
                System.out.println(temp.getKey());
            }
        }
    }
}
