package exercise;

import java.util.ArrayList;

/**
 * 泛型继承
 * 泛型不具备继承性！
 * 但是数据是具备继承性的
 *
 */
public class GenericsExtends {
    public static void main(String[] args) {
        ArrayList<GrandFather> arrayList1 = new ArrayList<>();
        ArrayList<Father> arrayList2 = new ArrayList<>();
        ArrayList<Son> arrayList3 = new ArrayList<>();

        // 验证泛型不具备继承性
        // 方法中的ArrayList的泛型限定为GrandFather，若泛型具备继承性，那么传递List1、2、3都可以成功调用这个方法
        // 但是传递List2、3调用这个方法都编译报错了：
        // 需要的类型:ArrayList<GrandFather>提供的类型:ArrayList<Father>
        // 需要的类型:ArrayList<GrandFather>提供的类型:ArrayList<Son>
        // 这就可以说明泛型是不具备继承性的
//        testMethod(arrayList1);
//        testMethod(arrayList2);
//        testMethod(arrayList3);

        // 验证数据具备继承性
        // 在添加集合中的数据的时候，是具备继承性的，添加泛型限定类的子类也是可以的
        // 就像是集合的原始使用，其中底层数组是Object，所以说可以添加Object的子类（也就是一切类）
        arrayList1.add(new GrandFather());
        arrayList1.add(new Father());
        arrayList1.add(new Son());

    }

    public static void testMethod(ArrayList<GrandFather> arrayList) {
        System.out.println(arrayList);
    }

}

/**
 * 这是三个简单的类，其中具备一个简单的继承结构，只是为了验证泛型的继承性
 */
class GrandFather {}

class Father extends GrandFather{}

class Son extends Father{}
