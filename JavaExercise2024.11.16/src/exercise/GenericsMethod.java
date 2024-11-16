package exercise;

/**
 * 泛型方法
 * 因为不知道方法具体可以接收什么类型的参数，所以说可以使用泛型方法，用泛型的方法指代具体的参数方法
 */
public class GenericsMethod {
    public static void main(String[] args) {
        // 因为是泛型方法，可以传递任何类型的参数
        printWord("hello");
        printWord(123);
        printWord('a');
        printWord(new Student("张三", 18));

    }

    /**
     * 一个简单的打印方法，但是因为不知道具体要打印什么类型的参数，所以说需要使用泛型
     *
     * @param t
     * @param <T>
     */
    public static <T> void printWord(T t) {
        System.out.println(t);
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

    @Override
    public String toString() {
        return "Student: " + this.name + " age: " + this.age;
    }
}
