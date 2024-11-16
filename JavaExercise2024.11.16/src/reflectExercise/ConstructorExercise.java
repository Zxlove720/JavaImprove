package reflectExercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取构造方法
 */
public class ConstructorExercise {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 通过反射获取类中的构造方法
        // 方法构成规则
        // get 表示获取
        // Declared 表示私有
        // Constructor 构造方法
        // s 表示获取所有（复数形式）
        // get...方法会返回一个指定的Constructor对象，根据构造方法的参数类型（也需要字节码文件）指定
        // get...s方法会返回一个Constructor[]数组，包含当前方法能够获得的所有构造方法

        // 注：若获取到的构造方法是私有的，必须要临时修改其访问权限，否则无法使用

        // 想要通过反射获取，必须先获取其字节码文件对象
        Class clazz = Class.forName("reflectExercise.Person");

        // 获取指定的构造方法
        // 空参
        Constructor constructor1 = clazz.getConstructor();
        // 指定参数 是根据构造方法的参数类型进行查询的，传递的参数需要使用字节码文件对象
        Constructor constructor2 = clazz.getConstructor(String.class, int.class);
        // 使用get方法，不带Declared，无法获得非Public的构造方法
        // Constructor constructor3 = clazz.getConstructor(String.class); // NoSuchMethodException
        Constructor constructor3 = clazz.getDeclaredConstructor(String.class);
        // 非private构造方法，可以直接使用（要根据获得的对应的构造方法传递参数）
        Person p1 = (Person)constructor1.newInstance();
        Person p2 = (Person)constructor2.newInstance("张三", 18);
        System.out.println(p1);
        System.out.println(p2);
        // private构造方法，虽然可以通过Declared方法获取，但是无法直接使用
        // Person p3 = (Person)constructor3.newInstance("张三"); // IllegalAccessException
        // 需要临时修改其访问权限（暴力反射）
        constructor3.setAccessible(true);
        Person p3 = (Person)constructor3.newInstance("张三");
        System.out.println(p3);
        // 使用get...s方法获取
        Constructor[] constructors = clazz.getConstructors();
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
