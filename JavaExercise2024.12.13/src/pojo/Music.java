package pojo;

public class Music implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 500; i++) {
            if (i == 10) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + "第" + i + "次");
        }
    }
}
