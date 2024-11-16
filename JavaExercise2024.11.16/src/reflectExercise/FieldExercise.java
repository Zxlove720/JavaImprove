package reflectExercise;

import java.lang.reflect.Field;

/**
 * 反射获取成员变量
 *
 */
public class FieldExercise {
    public static void main(String[] args) throws Exception {
        // 获取字节码文件
//        Class clazz = Class.forName("reflectExercise.Animal");
//        // 反射获取成员变量的方法和反射获取构造方法的使用方法一致，不过多赘述
//        Field number = clazz.getField("number");
//        System.out.println(number);
//        // 获取到private的成员变量，仍然无法直接使用
//        Field name = clazz.getDeclaredField("name");
//        System.out.println(name);
//        Field age = clazz.getDeclaredField("age");
//        System.out.println(age);
//
//        Field[] fields = clazz.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }


        // 通过反射获取一个类的成员变量并修改
        // void set(Object obj, Object value) 赋值     Object get(Object obj) 获取值
        Animal animal1 = new Animal("狗", 18, "123");
        Animal animal2 = new Animal("猫", 18, "456");
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println("----------------------------------------");

        // 获取字节码文件对象
        Class clazz = Class.forName("reflectExercise.Animal");
        // 修改姓名
        Field name = clazz.getDeclaredField("name");
        // 对于private权限的变量，临时修改其访问权限
        name.setAccessible(true);
        name.set(animal1, "炫狗");
        name.set(animal2, "哈机密");
        // 修改年龄
        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(animal1, 1);
        age.set(animal2, 2);
        // 修改编号
        Field number = clazz.getDeclaredField("number");
        number.set(animal1, "147");
        number.set(animal2, "258");

        System.out.println(animal1);
        System.out.println(animal2);


    }

}

class Animal{
    private String name;
    private int age;
    public String number;

    public Animal() {
    }

    public Animal(String name, int age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
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
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                '}';
    }
}


