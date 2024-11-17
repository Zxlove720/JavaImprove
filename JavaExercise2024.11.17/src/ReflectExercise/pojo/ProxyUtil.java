package ReflectExercise.pojo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建代理的工具类
 *
 */
public class ProxyUtil {

    /**
     * 该方法是返回一个明星的代理对象；明星可以唱歌跳舞，但是唱歌跳舞需要前提准备，所以说代理对象就是增强了这两个方法
     *
     * @param bigStar
     * @return
     */
    public static Star createProxy(BigStar bigStar) {
        /*
        java.lang.reflect.proxy类：提供了为对象产生代理对象的方法

        public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
        参数1：用于指定那个类加载器，去加载生成的代理类
        参数2：指定接口，这些接口用于指定代理代理了那些方法
        参数3：用于指定生成的代理对象要做什么事情

         */

        // 指定用哪个类加载器
        // 指定接口，这些接口用于指定代理中代理了哪些方法
        // 参数1：代理的对象
        // 参数2：要运行的方法
        // 参数3：调用要运行的对象时，传递的参数
        // 使用被代理对象中的方法
        return (Star)Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(), // 指定用哪个类加载器
                new Class[]{Star.class}, // 指定接口，这些接口用于指定代理中代理了哪些方法
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 参数1：代理的对象
                        // 参数2：要运行的方法
                        // 参数3：调用要运行的对象时，传递的参数
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒，收钱");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地，收钱");
                        }
                        // 使用被代理对象中的方法
                        return method.invoke(bigStar, args);
                    }
                }
        );

    }

}
