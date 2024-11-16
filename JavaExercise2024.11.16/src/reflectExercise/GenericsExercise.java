package reflectExercise;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 验证泛型擦除
 *
 */
public class GenericsExercise {
    public static void main(String[] args) throws Exception{
        // 泛型只在编译时有效，在字节码文件中是不存在泛型的
        List<Integer> list = new ArrayList<>();
        list.add(123);
//        list.add("abc") // 泛型直接在编译时报错
        // 利用反射运行list中的add方法添加字符串，因为反射使用的是Class字节码文件，不存在泛型，是不会报错的
        Class clazz = list.getClass();

        Method add = clazz.getMethod("add", Object.class);
        add.invoke(list, "abc");
        System.out.println(list);

        // 这样就跳过了泛型的检查，成功添加了String类型的元素
    }

}
