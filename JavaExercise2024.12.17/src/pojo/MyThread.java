package pojo;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
//            if (i == 3) {
//                System.out.println(Thread.currentThread().getName() + "让步");
//                Thread.yield();
//            }
            if (i == 20) {
                try {
                    System.out.println(Thread.currentThread().getName() + "睡眠");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + "在执行");
        }
    }
}
