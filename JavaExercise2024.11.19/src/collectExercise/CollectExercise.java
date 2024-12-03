package collectExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Stream流中的收集操作
 */
public class CollectExercise {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰,12");
        list.add("张三丰");
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");

        // 使用Stream流方法操作完成之后，可以将流中数据收集到一个集合中
        // collect(Collector collector) 将结果收集到集合中
        // Collector toList() 收集到List集合
        // Collector toSet() 收集到Set集合
        // Collector toMap() 收集到Map集合

        //List<String> name = list.stream().filter(s -> s.startsWith("张")).collect(Collectors.toList());
        // 可以将collect(Collectors.toList())简化为toList()
        List<String> name = list.stream().filter(s -> s.startsWith("张")).toList();
        Set<String> set = list.stream().filter(s -> s.startsWith("张")).collect(Collectors.toSet());

        // toMap的第一个lambda表达式代表如何获取map中的key
        // toMap的第二个lambda表达式代表如何获取map中的value
        Map<String, String> map = list.stream().filter(s -> s.startsWith("张"))
                .collect(Collectors.toMap(s -> s.split(",")[0],
                        s -> s.split(",")[1]));
        System.out.println(name);
        System.out.println(set);

    }
}
