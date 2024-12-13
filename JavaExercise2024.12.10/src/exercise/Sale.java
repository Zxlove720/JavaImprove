package exercise;

import pojo.SaleTickets;


public class Sale {
    public static void main(String[] args) {
        SaleTickets saleTickets = new SaleTickets();
        Thread thread1 = new Thread(saleTickets, "窗口1");
        Thread thread2 = new Thread(saleTickets, "窗口2");
        Thread thread3 = new Thread(saleTickets, "窗口3");
        Thread thread4 = new Thread(saleTickets, "窗口4");
        thread1.setPriority(10);
        thread2.setPriority(9);
        thread3.setPriority(8);
        thread4.setPriority(7);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
