package programOJ;
/*
1343. 前K个高频单词
 */
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TopKHighFrequencyWords_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            int t=Integer.parseInt(sc.nextLine());
            List<String> words=new ArrayList<>();
            for (int i = 0; i < t; i++) {
                words.add(sc.nextLine());
            }
            int m=sc.nextInt();

            //处理        借用流的特性
            List<String> sortedWords=words.stream().sorted().collect(Collectors.toList());
            Map<String,List<String>> mapGroup=sortedWords.stream().sorted().collect(Collectors.groupingBy(str->str));
            List<String> endWords=sortedWords.stream().distinct().sorted(Comparator.comparingInt(key->mapGroup.get(key).size()).reversed()).collect(Collectors.toList());

            //输出
            for (int i = 0; i < m; i++) {
                System.out.println(endWords.get(i));
            }
        }
    }
}
