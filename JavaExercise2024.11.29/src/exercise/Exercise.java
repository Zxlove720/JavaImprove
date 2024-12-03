package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exercise {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "hello", "world", "zhangsan");
//        Iterator i = arrayList.iterator();
//        while (i.hasNext()) {
//            String element = (String)i.next();
//            System.out.println(element);
//            if (element.equals("zhangsan")) {
//                i.remove();
//            }
//        }
        for (String s : arrayList) {
            System.out.println(s);
        }

    }
}
