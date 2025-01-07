package exercise;

public class Exercise {
    public static void main(String[] args) {
        People student = new Student("yyc", 20, "123");
        People teacher = new Teacher("yyc", 20, 12345);
        ((Student) student).study();
        ((Teacher) teacher).teach();
    }
}


