package listExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 不可变集合
 * 长度不变，内容无法修改的集合
 * 当集合中的数据不能被修改，那么将其拷贝到不可变集合中就是一种很好的防御手段
 * 有些情况，不想让他人改变集合的内容，那么就需要使用不可变集合；
 */
public class ListExercise {
    public static void main(String[] args) {
        // 不可变的集合有不可变List、不可变Set、不可变Map

        // 不可变List
        // 使用List.of方法创建一个不可变的List集合
//        List<String> list= List.of("张三","李四","王五","赵六");
//        // 发现使用List.of方法创建的集合是不可变的集合，只能查询，无法修改
//        // 不可变的集合可以正常查询
//        for (String s : list) {
//            System.out.println(s);
//        }
//        // 但是想要改变这个集合是不可以的，无法通过编译
//        list.remove(0);
//        list.remove("张三");
//        list.add("前七");

//        // 不可变的Set集合
//        // 不可变的Set大部分情况下和不可变List类似，但是使用of方法创建集合的时候，参数必须保证唯一性
//        Set<String> set = Set.of("张三","李四","王五","赵六");
//        for (String s : set) {
//            System.out.println(s);
//        }
//        // 使用Set.of创建集合的时候，参数必须保证唯一性，否则直接编译错误
//        Set<Integer> errorSet = Set.of(1,2,3,4,5,5);
//        set.remove("王五");
//        set.add("13");
//        set.remove("李四");

        // 不可变的Map集合
        // 如果使用Map.of方法，参数的键值对个数最多10个，其不支持不定参数的写法：
        // 因为不定参数只能有一个，并且必须写在参数列表的最后；但是Map中键值对一一对应，必须有两个不定参数，这是不符合语法的
        // 假如说想要传递多个键值对对象，数量大于10个，那么不能使用Map.of方法


        // Map.of方法不能传递相同的键，否则直接编译报错
//        Map<String, String> map = Map.of("张三", "南京", "张三", "北京", "王五", "上海",
//                "赵六", "广州", "孙七", "深圳", "周八", "杭州",
//                "吴九", "宁波", "郑十", "苏州", "刘一", "无锡",
//                "陈二", "嘉兴");


//        put方法可以传递相同的键，以后面的键值为准
//        Map<String, String> map1 = new HashMap<>();
//        map1.put("zhangsan", "123");
//        map1.put("zhangsan", "123");

        // 创建一个不可变的Map对象，键值对的数量不超过10
//        Map<String, String> map = Map.of("张三", "南京", "王五", "上海",
//                "赵六", "广州", "孙七", "深圳", "周八", "杭州",
//                "吴九", "宁波", "郑十", "苏州", "刘一", "无锡",
//                "陈二", "嘉兴");
//
//        // 通过得到keySet，然后遍历key得到value
//        Set<String> keySet = map.keySet();
//        for (String key : keySet) {
//            String value = map.get(key);
//            System.out.println(value + " " + key);
//        }
//
//        // 通过获得键值对集合，直接遍历
//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//
//        // 修改map失败
//        map.remove("张三");
//        map.put("123", "456");

        // 创建一个不可变的Map对象，但是键值对超过10

        // 创建一个普通的map对象
        HashMap<String, String> map = new HashMap<>();
        map.put("张三", "南京");
        map.put("李四", "北京");
        map.put("王五", "上海");
        map.put("赵六", "北京");
        map.put("孙七", "深圳");
        map.put("周八", "杭州");
        map.put("吴九", "宁波");
        map.put("郑十", "苏州");
        map.put("刘一", "无锡");
        map.put("陈二", "嘉兴");
        map.put("aaa", "111");

//        // 利用上面的map对象创建一个不可变的map
//        // 获取所有键值对对象
//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        // 将entries变为数组
//        // 先创建一个数组，用于存储键值对
//        // 此处的数组大小可以随意，后面toArray会自己调整
//        Map.Entry[] array = new Map.Entry[0];
//        // toArray方法在底层会比较集合的长度跟数组的长度两者的大小
//        // 如果集合的长度 > 数组的长度 ：数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
//        // 如果集合的长度 <= 数组的长度：数据在数组中放的下，此时不会创建新的数组，而是直接用
//        // 成功将原hashMap中的键值对转化为了数组
//        Map.Entry[] mapArray = entries.toArray(array);
//        // 用这个键值对数组创建不可变的map
//        Map map1 = Map.ofEntries(mapArray);
//        // 不可变的map，修改直接报错
//        map1.put("1230", "4567");
//
//        // 简便方法，在JDK10之前，需要将普通Map的键值对，转化为entries集合对象；再创建一个Map.Entry类型的数组
//        // 再通过这个数组（作为模板），将entries对象转换为Map.Entry类型的数组，然后再用这个数组，作为Map.ofEntries方法的参数，创造不可变的map
//
//        // JDK10之后的简便方法
//        // copyOf底层实现也是用的上面的方法，只是JDK对其进行了封装
//        Map<String, String> easyMap = Map.copyOf(map);
//        easyMap.put("132", "123");

        // 获取Map中的键值对集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        // 创建一个Map.Entry类型的数组，用于调用entries中toArray方法时指定数组类型
        Map.Entry[] entryArray = new Map.Entry[0];
        // 将Map中的键值存到Map.Entry数组中
        Map.Entry[] array = entries.toArray(entryArray);
        // 使用Map中的ofEntries方法使用原Map中的entry数组创建一个不可变的Map
        Map map2 = Map.ofEntries(array);
        System.out.println(map2);

        // JDK10之后的简便转换方法
        Map<String, String> easyMap = Map.copyOf(map);
        System.out.println(easyMap);
    }
}
