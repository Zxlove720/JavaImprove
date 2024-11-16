package reflectExercise;

import java.lang.reflect.Field;

/**
 * 通过暴力反射修改字符串
 *
 */
public class ChangeString {
    public static void main(String[] args) throws Exception {
        // 字符串不能被修改的原因：
        // 字符串底层实现：private final byte[] value;
        // 字符串的底层是一个byte类型的数组，是将字符串中的每一个字符变为对应的编码存放到value数组中的
        // final修饰表示value记录的地址值不能修改
        // private修饰value但没有对外提供get、set方法；所以在外界不能获取或修改value记录的地址值

        // 但是可以通过暴力反射对字符串的内容修改
        String s1 = "abc";
        String s2 = "bcd";
        // 底层： private final byte[] value = {97, 98, 99}
        // 利用反射获取value的地址
        // 不可变的只是value的地址，其中的内容是可以改的

        Class clazz = s1.getClass();
        // 获取成员变量value
        Field value = clazz.getDeclaredField("value");
        // Java9之后加入模块，Java.base模块对于lang包下的类，不对外开放，所以说到此处报错，无法修改
        value.setAccessible(true);
        byte[] bytes = (byte[]) value.get(s1);
        bytes[0] = 100;
        System.out.println(s1);
        System.out.println(s2);

    }
}
