package pojo;

public class Music implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + "第" + i + "次");
        }
    }
}
