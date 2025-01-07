package exercise;

public class Dog extends Animal{
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
}
