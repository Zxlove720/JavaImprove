package exercise;

public class Student extends People{
    private String id;

    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void study() {
        System.out.println("学生在学习");
    }
}
