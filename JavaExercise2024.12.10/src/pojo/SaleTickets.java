package pojo;


public class SaleTickets implements Runnable {
    private int tickets = 100;
    private final Object lock = new Object();

    @Override
    public void run() {
        while (true) {
//            synchronized (lock) {
//                if (tickets > 0) {
//                    System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    tickets--;
//                }
//            }
//            if (tickets == 0) {
//                break;
//            }

            sale();
            if (tickets == 0) {
                System.out.println("票卖完了");
                break;
            }
        }
    }

    private synchronized void sale() {
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        tickets--;
        }

    }
}
