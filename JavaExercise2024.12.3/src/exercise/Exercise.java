package exercise;

import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "张三", "李四", "王五");
        System.out.println(set.add("张三"));
        // 迭代器也需要泛型
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String result = iterator.next();
            System.out.println(result);
        }

        TreeSet treeSet = new TreeSet<>();
        Collections.addAll(treeSet, "张三", "李四", "王五");
        Iterator iterator1 = treeSet.iterator();
        while(iterator1.hasNext()) {
            String str = (String)iterator1.next();
            System.out.println(str);
        }
    }
}
