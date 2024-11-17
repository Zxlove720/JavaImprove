package ReflectExercise.pojo;

/**
 * 将想要被代理的方法定义在接口中
 * 这么做是为了让代理对象和被代理对象方法定义一致
 */
public interface Star {
    String sing(String name);

    void dance();
}
