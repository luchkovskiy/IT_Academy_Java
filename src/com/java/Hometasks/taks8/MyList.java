package com.java.Hometasks.taks8;

import java.util.Collection;

public interface MyList<T>  {

    int size();

    boolean add(T t);

    boolean add(Integer index, T t);

    boolean isEmpty();

    boolean contains(T t);

    boolean remove(T t);

    boolean addAll(Collection<? extends T> collection);

    T get(int index);

    T remove(int index);

    T set(int index, T value);

    int indexOf(T value);

    void printCollection (); // Для удобного вывода коллекции

}
