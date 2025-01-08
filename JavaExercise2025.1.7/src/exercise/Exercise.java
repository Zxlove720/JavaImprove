package exercise;

import java.io.*;
import java.util.*;

public class Exercise {
    public static void main(String[] args) throws Exception {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("张三", 12);
//        map.put("李四", 14);
//        map.put("王五", 16);
//        map.put("赵六", 18);
//        map.put("钱七", 20);

//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        for (Map.Entry<String, Integer> entry : entries) {
//            System.out.println(entry);
//        }
//
//        Set<String> keySet = map.keySet();
//        for (String s : keySet) {
//            System.out.print(s + "=");
//            System.out.println(map.get(s));
//        }
//        System.out.println(map.get("张三"));

//        Set<Integer> set = new HashSet<>();
//        Collections.addAll(set, 1,2,3,4,5,6,7);
//        for (Integer i : set) {
//            System.out.println(i);
//        }
//        for (Integer integer : set) {
//            System.out.println(integer);
//        }

        File file = new File("E:\\wzb.txt");
//        InputStream inputStream = new FileInputStream(file);
//        int b = 0;
//        while ((b = inputStream.read()) != -1) {
//            System.out.print((char)b);
//        }
//        inputStream.close();
//
//
        FileReader fileReader = new FileReader(file);
        int len = 0;
        char[] charArray = new char[8];
        while ((len = fileReader.read(charArray)) != -1) {
            System.out.print(new String(charArray));
        }
        fileReader.close();

//        File file = new File("E:\\wzb.txt");
////        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
////        byte[] bytes = "你好世界 Hello World".getBytes();
////        for (byte aByte : bytes) {
////            fileOutputStream.write(aByte);
////        }
////        fileOutputStream.close();
//
//        FileWriter fileWriter = new FileWriter(file, true);
//        fileWriter.write("\r\n大吉大利，今晚吃鸡ycc");
//        fileWriter.close();

        File f = new File("E:\\wzb.txt");
        FileReader fileReader1 = new FileReader(file);
        char[] temp = new char[8];
        int tempLen = 0;
        while ((tempLen = fileReader1.read(temp)) != -1) {
            System.out.print(new String(temp, 0, tempLen));
        }
    }
}


