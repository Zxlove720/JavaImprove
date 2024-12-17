package pojo;

public class Read implements Runnable {
    private final Object object = new Object();

    @Override
    public void run() {
        synchronized (object) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "第" + i + "次");
            }
        }

    }
}
