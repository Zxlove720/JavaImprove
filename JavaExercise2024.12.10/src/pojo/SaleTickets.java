// SaleTickets.java
package pojo;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;


public class SaleTickets implements Runnable {
    // 使用 AtomicInteger 保证原子操作
    private AtomicInteger tickets = new AtomicInteger(100);
    // 使用 ConcurrentHashMap 存储每个窗口卖出的票数
    private ConcurrentHashMap<String, Integer> soldTickets = new ConcurrentHashMap<>();
    // 标志位，用于通知线程停止，使用 AtomicBoolean 保证原子性和可见性
    private AtomicBoolean soldOut = new AtomicBoolean(false);


    @Override
    public void run() {
        String windowName = Thread.currentThread().getName();
        // 初始化每个窗口卖出票数为 0
        soldTickets.put(windowName, 0);
        while (!soldOut.get()) {
            int remainingTickets;
            int sold = soldTickets.get(windowName);
            do {
                remainingTickets = tickets.get();
                if (remainingTickets <= 0) {
                    soldOut.set(true);
                    break;
                }
            } while (!tickets.compareAndSet(remainingTickets, remainingTickets - 1));
            if (remainingTickets > 0) {
                try {
                    // 模拟出售时间
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
                soldTickets.put(windowName, sold + 1);
                System.out.println(windowName + "正在出售第" + (sold + 1) + "张票，剩余" + (remainingTickets - 1) + "张票");
            }
        }
        System.out.println(windowName + " 共卖出 " + soldTickets.get(windowName) + " 张票");
    }
}