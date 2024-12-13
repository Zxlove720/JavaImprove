package exercise;

import pojo.MyThread;
import pojo.MyThread2;

public class ThreadExercise {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.setName("线程1");
//        myThread.start();
//        while(true) {
//            System.out.println("main方法");
//        }

        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        thread.setName("线程1");
        thread.start();
        while(true) {
            System.out.println("主线程正在运行");
        }
    }
}
