package genericsExercise;

import pojo.MyList;

public class GenericsExercise {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("hello");
        myList.add("world");

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));

    }
}
