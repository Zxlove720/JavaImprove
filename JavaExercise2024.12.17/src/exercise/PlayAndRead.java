package exercise;

import pojo.Music;
import pojo.Read;

public class PlayAndRead {
    public static void main(String[] args) {
        Music music = new Music();
        Read read = new Read();
        Thread thread1 = new Thread(music, "听音乐");
        Thread thread2 = new Thread(read, "读书");
        thread1.start();
        thread2.start();
    }
}
