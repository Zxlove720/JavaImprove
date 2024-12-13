package exercise;

import pojo.Music;
import pojo.Read;

public class Play {
    public static void main(String[] args) {
        Read read = new Read();
        Music music = new Music();
        Thread thread1 = new Thread(read, "读书");
        Thread thread2 = new Thread(music, "听音乐");
        thread1.start();
        thread2.start();
    }
}
