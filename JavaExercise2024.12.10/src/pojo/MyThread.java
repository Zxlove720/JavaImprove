package pojo;

public class MyThread extends Thread{
    @Override
    public void run() {
        while(true) {
            System.out.println(this.getName() + "正在运行");
        }
    }
}
