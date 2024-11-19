package StreamExercise;

import java.util.*;
import java.util.stream.Stream;

/**
 * Stream流练习
 *
 */
public class StreamExercise {
    public static void main(String[] args) {
        // 不使用Stream流

        // 需求：有个存储了名字的集合，需要将以“张”开头，长度为3的元素拷贝到另一个集合
        List<String> list = new ArrayList<>();
        List<String> copyList = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五", "张三丰","张无忌","张翠山","王二麻子","张良","谢广坤");
//        for (String s : list) {
//            if (s.startsWith("张") && s.length() == 3) {
//                copyList.add(s);
//            }
//        }
//        System.out.println(copyList);

        // 使用Stream流便捷添加
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> copyList.add(s));
        System.out.println(copyList);

        // Stream流的好处
        // 直接阅读代码的字面意思就可以完美展示代码逻辑：
            // 1.从list集合获取一个Stream流
            // 2.过滤所有以张开头的元素
            // 3.过滤所有长度＝3的元素
            // 4.遍历所有过滤之后剩下的元素，并加入到copyList集合中
        // Stream流具有鲜明的函数式编程的风格
        // 代码简洁

        // Stream流的思想
        // 1.首先需要获取Stream流：就相当于创建一条流水线，并将数据放在流水线上准备对其进行处理
        // 2.中间方法：流水线上对于数据的操作，一次操作完毕之后，还可以继续其他操作（相当于一个Stream流中可以有多个中间方法）
        // 3.终结方法：流水线上的最后一个操作，Stream流只能有一个终结方法

        // 生成Stream流的方式
        // 1.Collection体系的集合：使用默认的stream()方法生成流
        // 2.Map体系集合：将Map转为Set集合，间接生成流
        // 3.数组：通过Arrays中的静态方法stream生成流
        // 4.同种数据类型的多个数据：Stream接口的静态方法of(T...values)生成流

        // Collection体系的集合都可以使用自带的Stream()方法生成流
        List<String> newList = new ArrayList<>();
        Stream<String> streamList = newList.stream();

        Set<String> newSet = new HashSet<>();
        Stream<String> stream = newSet.stream();

        // Map体系集合间接生成的流
        Map<String, String> map = new HashMap<>();
        Stream<String> mapStream = map.keySet().stream();
        Stream<String> mapStream1 = map.values().stream();
        Stream<Map.Entry<String, String>> mapStream2 = map.entrySet().stream();

        // 数组通过Arrays中的静态方法生成流
        String[] strArray = {"hello", "world", "haha"};
        Stream<String> arrayStream = Arrays.stream(strArray);

        // 多个同种类型的数据可以通过Stream接口的静态方法of生成流
        Stream<String> hello = Stream.of("hello", "world", "haha");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);


    }
}
