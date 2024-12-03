package ListExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListExercise {
    public static void main(String[] args) {
//        ArrayList<String> nameList = new ArrayList<>();
//        Collections.addAll(nameList, "张三", "李四", "王五", "赵六");
//        System.out.println(nameList);
//        System.out.println("查找信息");
//        if (nameList.contains("张三")) {
//            System.out.println("张三在名单中");
//        } else {
//            System.out.println("张三不在名单中");
//        }
//        nameList.set(0, "张小三");
//        System.out.println(nameList);
//        nameList.remove(1);
//        System.out.println(nameList);
//        if (nameList.contains("李四")) {
//            System.out.println("李四在名单中");
//        } else {
//            System.out.println("李四不在名单中");
//        }

        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list, "张三", "李四", "王五", "赵六");
        System.out.println(list);
        list.addFirst("钱七");
        list.addLast("王八");
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }




    }
}
