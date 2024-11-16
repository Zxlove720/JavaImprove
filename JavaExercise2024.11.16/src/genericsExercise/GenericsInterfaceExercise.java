package genericsExercise;

import pojo.GenericsInterface;

/**
 * 根据泛型接口的两种使用方式，分别对其进行测试
 *
 */
public class GenericsInterfaceExercise {
    public static void main(String[] args) {
        // 1.实现类给出具体类型
        // 当实现类对泛型接口给出了具体类型时，则在使用时，无需再指定泛型，因为已经被实现类在实现泛型接口的时候给出了具体类型
        // 并且在添加的时候也只能添加实现类给出的具体类型的元素了

        // 添加实现类对泛型接口实现时给出的具体类型的元素，代码正常运行
//        GenericsInterface genericsInterface = new GenericsInterface();
//        genericsInterface.add("hello");
//        System.out.println(genericsInterface.getFirst());

        // 添加不同类型的元素，编译报错
//        genericsInterface.add(123);


        // 2.实现类延续泛型，创建实现类对象的时候再确定泛型
        // 这种方法就和使用Java自带的Collection系列集合是一样的，在创建对象的时候再确定的泛型
        GenericsInterface<String> genericsInterface = new GenericsInterface<>();
        genericsInterface.add("hello");
        genericsInterface.add("world");
        System.out.println(genericsInterface.getFirst());
    }
}
