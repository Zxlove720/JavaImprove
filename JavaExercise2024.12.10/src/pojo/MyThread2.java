package pojo;

public class MyThread2 implements Runnable{

    @Override
    public void run() {
        while(true) {
            System.out.println(Thread.currentThread().getName() + "正在运行");
        }
    }
}
