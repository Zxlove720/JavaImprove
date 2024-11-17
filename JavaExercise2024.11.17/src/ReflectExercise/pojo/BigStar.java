package ReflectExercise.pojo;

/**
 * 明星类
 * 拥有唱歌、跳舞的方法
 */
public class BigStar implements Star {
    private String name;
    private int age;

    public BigStar() {
    }

    public BigStar(String name, int age) {
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
    public String sing(String name) {
        System.out.println(this.name + "正在唱" + name);
        return "多谢";
    }

    @Override
    public void dance() {
        System.out.println(this.name + "正在跳舞");
    }
}
