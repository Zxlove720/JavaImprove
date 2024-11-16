package pojo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 泛型接口
 * 泛型接口的两种使用方式：
 * 1.实现类中给定具体的类型
 * 2.实现类继续延续泛型，创建对象时再确定泛型
 */

// 1.实现类中直接给定具体类型
//public class GenericsInterface implements List<String> {
//    @Override
//    public int size() {
//        return 0;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return false;
//    }
//
//    @Override
//    public boolean contains(Object o) {
//        return false;
//    }
//
//    @Override
//    public Iterator<String> iterator() {
//        return null;
//    }
//
//    @Override
//    public Object[] toArray() {
//        return new Object[0];
//    }
//
//    @Override
//    public <T> T[] toArray(T[] a) {
//        return null;
//    }
//
//    @Override
//    public boolean add(String s) {
//        return false;
//    }
//
//    @Override
//    public boolean remove(Object o) {
//        return false;
//    }
//
//    @Override
//    public boolean containsAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(Collection<? extends String> c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(int index, Collection<? extends String> c) {
//        return false;
//    }
//
//    @Override
//    public boolean removeAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean retainAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
//    @Override
//    public String get(int index) {
//        return "";
//    }
//
//    @Override
//    public String set(int index, String element) {
//        return "";
//    }
//
//    @Override
//    public void add(int index, String element) {
//
//    }
//
//    @Override
//    public String remove(int index) {
//        return "";
//    }
//
//    @Override
//    public int indexOf(Object o) {
//        return 0;
//    }
//
//    @Override
//    public int lastIndexOf(Object o) {
//        return 0;
//    }
//
//    @Override
//    public ListIterator<String> listIterator() {
//        return null;
//    }
//
//    @Override
//    public ListIterator<String> listIterator(int index) {
//        return null;
//    }
//
//    @Override
//    public List<String> subList(int fromIndex, int toIndex) {
//        return List.of();
//    }
//}

/**
 * 2.实现类延续泛型，创建实现类对象时再确定泛型
 * 这种使用方式，实现类仍然没有确定泛型接口的泛型，而是对其进行延续，在创建实现类对象的时候再确定的泛型
 */
public class GenericsInterface<E> implements List<E> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}