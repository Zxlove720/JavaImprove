package genericsExercise;

import pojo.MyList;

public class GenericsExercise {
    public static void main(String[] args) {
        // 泛型可以用在类、方法、接口中

        // 泛型类
        // 在自定义MyList类中限定泛型为String，那么该MyList对象只能添加String类型的元素
        MyList<String> myList = new MyList<>();
        // 添加String类型的元素成功
        myList.add("hello");
        myList.add("world");
        // 添加非String类型元素失败，编译时报错
//        myList.add(123);
//        myList.add('a');
        // 获得集合中元素，无需进行类型转换即可使用子类的特有方法
        // 因为有了泛型，在实现get方法的时候，就可以直接进行类型转换了，集合中只有一种类型的元素，所以说转换不会报错
        byte[] bytes = myList.get(0).getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        System.out.println(myList.getSize());
    }
}
