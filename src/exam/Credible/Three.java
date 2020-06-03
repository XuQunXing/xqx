package exam.Credible;
/*
树形网络
 */
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Three {
    /**
     * main入口由OJ平台调用
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in, StandardCharsets.UTF_8.name());

        int nodeNum = cin.nextInt();
        int nonLeafNodeNum = cin.nextInt();
        int targetCapacity = cin.nextInt();

        int[] capacitys = new int[nodeNum];
        for (int i = 0; i < nodeNum; i++) {
            capacitys[i] = cin.nextInt();
        }

        NonLeafNode[] nonLeafNodes = new NonLeafNode[nonLeafNodeNum];
        for (int i = 0; i < nonLeafNodeNum; i++) {
            int nodeId = cin.nextInt();
            int subNodeNum = cin.nextInt();
            nonLeafNodes[i] = new NonLeafNode(nodeId, subNodeNum);
            for (int j = 0; j < subNodeNum; j++) {
                nonLeafNodes[i].subNodeIds[j] = cin.nextInt();
            }
        }
        cin.close();

        String[] paths = getPathOfCapacity(capacitys, nonLeafNodes, targetCapacity);
        if (paths != null) {
            for (String path : paths) {
                System.out.println(path);
            }
        }
    }

    static class NonLeafNode {
        int nodeId;
        int[] subNodeIds;

        NonLeafNode(int nodeId, int subNodeNum) {
            this.nodeId = nodeId;
            this.subNodeIds = new int[subNodeNum];
        }
    }

    static String[] getPathOfCapacity(int[] capacitys, NonLeafNode[] nonLeafNodes, int targetCapacity) {
        // TODO 在此补充你的代码
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> ever = new ArrayList<>();
        ever.add(00);
        lists.add(ever);
        //遍历树，吧所有的可能的路径都加入list
        List<NonLeafNode> notfind = new ArrayList<>();
        for (int i = 0; i < nonLeafNodes.length; i++) {
            int id = nonLeafNodes[i].nodeId;
            int[] leaf = nonLeafNodes[i].subNodeIds;
            boolean flag = false;
            for (int j = 0; j < lists.size(); j++) {
                List<Integer> temp = lists.get(j);
                if (temp.contains(id)) {
                    lists.remove(j);
                    for (int k = 0; k < leaf.length; k++) {
                        List<Integer> haha = new ArrayList<>();
                        for (int m : temp
                        ) {
                            haha.add(m);
                        }
                        haha.add(leaf[k]);
                        lists.add(haha);
                    }
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                notfind.add(nonLeafNodes[i]);
            }
        }
        //没找到的继续找
        while (notfind.size() != 0) {
            for (int i = 0; i <notfind.size() ; i++) {
                int id = notfind.get(i).nodeId;
                int[] leaf = notfind.get(i).subNodeIds;
                notfind.remove(i);
                boolean flag = false;
                for (int j = 0; j < lists.size(); j++) {
                    List<Integer> temp = lists.get(j);
                    if (temp.contains(id)) {
                        lists.remove(j);
                        for (int k = 0; k < leaf.length; k++) {
                            List<Integer> haha = new ArrayList<>();
                            for (int m : temp
                            ) {
                                haha.add(m);
                            }
                            haha.add(leaf[k]);
                            lists.add(haha);
                        }
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    notfind.add(notfind.get(i));
                }
            }
        }


        //编号转化为容量
        List<List<Integer>> capl = new ArrayList<>();
        for (List<Integer> x : lists
        ) {
            List<Integer> temp = new ArrayList<>();
            for (int y : x
            ) {
                temp.add(capacitys[y]);
            }
            capl.add(temp);
        }
        //list求和判断
        List<List<Integer>> sortList = new ArrayList<>();
        for (int i = 0; i < capl.size(); i++) {
            List<Integer> temp = capl.get(i);
            if (getNum(temp) == targetCapacity) {
                sortList.add(temp);
            }
        }

        //排序
        Collections.sort(sortList, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                int temp = 0;
                while (temp < o1.size() && temp < o1.size()) {
                    if (o1.get(temp) == o2.get(temp)) {
                        temp++;
                    } else {
                        return o2.get(temp) - o1.get(temp);
                    }
                }
                return o1.size() - o2.size();
            }
        });
        //输出
        String[] strings = new String[sortList.size()];
        for (int i = 0; i < sortList.size(); i++) {
            String temp = "";
            List<Integer> everyList = sortList.get(i);
            for (int j = 0; j < everyList.size(); j++) {
                if (j == everyList.size() - 1) {
                    temp += everyList.get(j);
                } else {
                    temp += everyList.get(j) + " ";
                }
            }
            strings[i] = temp;
        }
        return strings;
    }

    //list求和
    static int getNum(List<Integer> list) {
        int ans = 0;
        for (int i : list
        ) {
            ans += i;
        }
        return ans;
    }
}
