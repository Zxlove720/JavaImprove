package exercise;

import pojo.Student;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise1 {
    public static void main(String[] args) {
//        Set<Student> studentSet = new HashSet<>();
//        Collections.addAll(studentSet, new Student(1, "张三"),
//                                       new Student(2, "李四"),
//                                       new Student(3, "李四"));
//        for (Student student : studentSet) {
//            System.out.println(student);
//        }

//        Set<String> treeSet = new TreeSet<>();
//        Collections.addAll(treeSet, "张三", "李四", "王五");
//        System.out.println(treeSet);


        Set<Student> students1 = new HashSet<>();
        Set<Student> students2 = new HashSet<>();

        Collections.addAll(students1, new Student(1, "1"),
                new Student(2, "2"),
                new Student(3, "3"));

        Collections.addAll(students2, new Student(3, "3"),
                new Student(4, "4"),
                new Student(5, "5"));

        students1.addAll(students2);
        System.out.println(students1);

        TreeSet<Student> treeSet = new TreeSet<>(students1);
        System.out.println(treeSet);
    }
}
