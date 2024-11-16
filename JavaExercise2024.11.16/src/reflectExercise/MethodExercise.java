package reflectExercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射获取成员方法
 * invoke v.调用、实行
 */
public class MethodExercise {
    public static void main(String[] args) throws Exception {
        // 综合，通过反射完成一个对象创建，赋值，使用
        Class clazz = Class.forName("reflectExercise.Car");
        // 获取构造方法
        Constructor constructor1 = clazz.getConstructor();
        Car car1 = (Car)constructor1.newInstance();
        // 获取成员变量
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(car1, "benz");
        Field price = clazz.getDeclaredField("price");
        price.setAccessible(true);
        price.set(car1, "123456");
        System.out.println(car1);
        // 获取方法
        Method run = clazz.getMethod("run");
        run.invoke(car1);
        System.out.println("--------------------------------------------");

        // 通过set方法设置对象属性
        Car car2 = (Car)constructor1.newInstance();
        Method setName = clazz.getMethod("setName", String.class);
        setName.invoke(car2, "bmw");
        Method setPrice = clazz.getMethod("setPrice", String.class);
        setPrice.invoke(car2, "456789");
        // get方法得到对象属性
        Method getName = clazz.getMethod("getName");
        Method getPrice = clazz.getMethod("getPrice");
        System.out.println((String) getName.invoke(car2));
        System.out.println((String) getPrice.invoke(car2));
        System.out.println(car2);
        run.invoke(car2);
    }
}

class Car{
    private String name;
    private String price;

    public Car() {}

    public Car(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public void run() {
        System.out.println(this.name + "   害虫！！！");
    }
}
