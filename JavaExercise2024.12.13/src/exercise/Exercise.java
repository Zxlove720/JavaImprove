package exercise;

import pojo.MyThread;

public class Exercise {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread, "线程1");
        Thread thread2 = new Thread(myThread, "线程2");
        thread1.start();
        thread2.start();
    }
}
