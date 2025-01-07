package exercise;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void shout() {
        System.out.println("喵喵");
    }
}
