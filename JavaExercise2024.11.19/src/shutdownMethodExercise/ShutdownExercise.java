package shutdownMethodExercise;

import java.util.ArrayList;

/**
 * 流中终结方法
 *
 */
public class ShutdownExercise {
    public static void main(String[] args) {
        // Stream 流可以有很多中间方法，但是只能有一个终结方法，使用了终结方法之后，流将关闭，然后不能再对流进行其他操作
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张三丰");
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");

        // forEach 对此流中的每个元素遍历
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);


        // count 返回此流中的元素个数
        System.out.println(list.stream().filter(s -> s.length() == 3).count());

        // 在终结方法之后再使用流中的方法，直接编译错误
//        list.stream().filter(s -> s.startsWith("王")).forEach(System.out::println).filter;


    }
}
