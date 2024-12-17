package exercise;

import pojo.MyThread;

public class Exercise {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread, "线程1");

        thread1.start();
        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                System.out.println(thread1.getName() + "插队");
                thread1.join();
            }
            System.out.println("主线程执行");
        }
    }
}
