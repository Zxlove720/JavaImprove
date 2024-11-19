package StreamExercise;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Stream流中的中间方法练习
 *
 */
public class StreamMethodExercise {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张三丰");
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");

        // filter 对流中的数据进行过滤，只会留下符合filter中条件的数据
//        // 这次过滤留下了“张”开头的元素
//        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
//
//        // 这次过滤留下了长度为3的元素
//        list.stream().filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
//
//        // 但是流的操作并不会对原集合有影响


        // limit 和 skip
        // limit 返回此流中元素组成的流，截取前指定参数个数的元素
        // skip 跳过指定参数个元素，返回由该流剩余元素组成的流
//        list.stream().limit(2).forEach(s -> System.out.println(s));
//        list.stream().skip(2).forEach(s -> System.out.println(s));


        // concat 将两个流合为一个流
//        Stream<String> name1 = list.stream().filter(s -> s.startsWith("张"));
//        Stream<String> name2 = list.stream().filter(s -> s.startsWith("王"));
//        Stream.concat(name1, name2).forEach(s -> System.out.println(s));


        // distinct 返回该流的不同元素（是根据Object.equals(Object o)组成的流）
        list.stream().distinct().forEach(s -> System.out.println(s));
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));


    }
}
