package reflectExercise;

/**
 * 反射练习
 *
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        // 反射 Reflect
        // 在运行状态中，对于任何一个类，都可以知道这个类的所有属性和方法；对于任何一个对象，都能够调用其任意属性和方法
        // 这种动态获取信息及调用对象方法的功能就是反射

        // 利用反射创建的对象可以无视访问权限修饰符调用类中的内容
        // 反射可以和配置文件结合使用，将要创建的对象信息和方法写在配置文件中，配置文件读取到什么类，就创建什么类
        // 读取到什么方法，就调用什么方法
        // 若需求变更时，就无需修改代码，直接修改配置文件即可



        // 反射都是从class字节码文件中获取内容，所以说想要使用反射，必须先获取class字节码

        // 获取字节码文件对象
        // 1.使用Class类中的静态方法：Class.forName(“全类名（包名 + 类名）”)
        Class studentClazz1 = Class.forName("reflectExercise.Student");
        System.out.println(studentClazz1);

        // 2.使用类中的class属性获取
        Class studentClazz2 = Student.class;
        System.out.println(studentClazz2);

        // 3.通过实例对象获取字节码文件对象
        Student student = new Student("张三", 18);
        Class studentClazz3 = student.getClass();
        System.out.println(studentClazz3);

        // 通过三种方式获得的字节码文件对象是同一个
        System.out.println(studentClazz1 == studentClazz2); // true
        System.out.println(studentClazz2 == studentClazz3); // true

    }

}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
}
