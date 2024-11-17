package ReflectExercise;

import ReflectExercise.pojo.BigStar;
import ReflectExercise.pojo.ProxyUtil;
import ReflectExercise.pojo.Star;

/**
 * 动态代理
 * 无侵入的给方法增强功能
 */
public class ReflectExercise {
    public static void main(String[] args) {
        // 动态代理的三要素
        // 1.真正干活的对象
        // 2.代理对象
        // 3.利用代理调用方法

        /*
        假如有个明星需要可以唱歌跳舞，但是表演时，唱歌跳舞需要准备场地、收钱；于是就有了代理人，也就是代理
        代理 代理了明星的唱歌跳舞的方法，唱歌跳舞的提前准备就由代理完成了，就相当于将被代理的对象的方法增强了
         */

        //1. 获取代理的对象
        BigStar bigStar = new BigStar("鸡哥", 18);
        Star proxy = ProxyUtil.createProxy(bigStar);

        //2. 调用唱歌的方法
        String result = proxy.sing("只因你太美");
        System.out.println(result);

        //3. 调用跳舞的方法
        proxy.dance();


    }

}
