package pojo;


import java.util.Arrays;

public class Basket<T>{
    // 篮子的总大小
    private int size;
    // 篮子中实际放的物品
    private int total;
    private Object[] array;

    public Basket(int size) {
        this.total = 0;
        this.size = size;
        this.array = new Object[size];
    }

    public boolean add(T element) {
        if (total >= size) {
            return false;
        }
        array[total] = element;
        total++;
        return true;
    }

    public int getSize() {
        return this.size;
    }

    public int getTotal() {
        return this.total;
    }

    @Override
    public String toString() {
        String result = "";
        for (Object o : this.array) {
            if (o != null) {
            result = result + o.toString() + " ";

            }
        }
        return result;
    }
}
