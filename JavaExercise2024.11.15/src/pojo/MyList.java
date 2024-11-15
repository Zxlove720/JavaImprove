package pojo;

/**
 * 自己模仿ArrayList用泛型技术创建一个List类
 *
 * @param <E>
 */
public class MyList <E>{
    private Object[] obj = new Object[10];
    int size;

    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E)obj[index];
    }
}
