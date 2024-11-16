package pojo;

/**
 * 模仿ArrayList创建自己的List类
 *
 * @param <E>
 */
public class MyList <E>{
    // 创建一个Object数组
    Object[] array = new Object[10];
    // 集合长度（元素个数），成员变量会自动初始化，ing初始化为0
    int size;

    /**
     * 模仿ArrayList中的add方法
     *
     * @param e 想要加入集合中的元素，根据集合创建限定的泛型决定要加入什么类型的元素
     * @return 永远return true
     */
    public boolean add(E e) {
        array[size] = e;
        size++;
        return true;
    }

    /**
     * 模仿ArrayList中的get方法
     *
     * @param index 想要获得的元素的索引
     * @return 返回参数索引对应的元素
     */
    public E get(int index) {
        return (E) array[index];
    }

    /**
     * 获取集合长度
     *
     * @return size
     */
    public int getSize() {
        return this.size;
    }

}
