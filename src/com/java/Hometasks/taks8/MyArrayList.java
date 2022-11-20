package com.java.Hometasks.taks8;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<T> implements MyList {

    private final int DEFAULT_CAPACITY = 10;

    private int CURRENT_CAPACITY;
    private int size = 0;


    private Object[] elementArray;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Object o) {
        elementArray = rangeCheck(elementArray);
        elementArray[size] = o;
        if (o != null) {
            size++;
            return true;
        }
        return false;
    }

    @Override
    public boolean add(Integer index, Object o) {
        elementArray = rangeCheck(elementArray);
        if (index == null || o == null) {
            return false;
        }
        for (int i = 0, q = 1; q < elementArray.length; i++, q++) {
            Object interoperative;
            if (i == index) {
                elementArray[q] = elementArray[i];
                elementArray[i] = o;
                for (int n = i + 2, j = q + 2; j < elementArray.length; n++, j++) {
                    interoperative = elementArray[n];
                    elementArray[j] = interoperative;
                }
            }
        }
        size++;
        return true;
    }

    @Override
    public boolean contains(Object o) {
        for (Object element : elementArray) {
            if (element != null) {
                if (element.equals(o)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        for (Object element : elementArray) {
            if (element != null)
                return false;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        boolean answer = false;
        for (int i = 0; i < elementArray.length; i++) {
            if (elementArray[i] == null)
                continue;
            if (elementArray[i].equals(o)) {
                answer = true;
                for (int n = i, j = n + 1; n < elementArray.length - 1; n++, j++) {
                    elementArray[n] = elementArray[j];
                }
            }
        }
        size--;
        return answer;
    }

    @Override
    public boolean addAll(Collection collection) {
        if (collection == null)
            return false;
        int currentSize = size;
        for (Object collectionElement : collection) {
            elementArray[currentSize] = collectionElement;
            currentSize++;
        }
        return true;
    }

    @Override
    public Object get(int index) {
        for (int i = 0; i < elementArray.length; i++) {
            if (i == index) {
                return elementArray[index];
            }
        }
        return -1;
    }

    @Override
    public Object remove(int index) {
        for (int i = 0; i < elementArray.length; i++) {
            if (i == index) {
                for (int n = i, j = n + 1; n < elementArray.length - 1; n++, j++) {
                    elementArray[n] = elementArray[j];
                }
            }
        }
        return elementArray[index];
    }

    @Override
    public Object set(int index, Object value) {
        for (int i = 0; i < elementArray.length; i++) {
            if (i == index) {
                elementArray[i] = value;
            }
        }
        return elementArray[index];
    }

    @Override
    public int indexOf(Object value) {
        int i = 0;
        for (Object element : elementArray) {
            if (element.equals(value)) {
                return i;
            }
            i++;
        }
        return i;
    }

    @Override
    public void printCollection() {
        for (Object element : elementArray) {
            if (element == null) {
                continue;
            }
            System.out.println(element);
        }
    }

    private Object[] rangeCheck(Object[] elementArray) {
        if (size == elementArray.length) {
            CURRENT_CAPACITY *= 1.5 + 1;
            Object[] newElementArray = Arrays.copyOf(elementArray, elementArray.length);
            return newElementArray;
        }
        return elementArray;
    }

    private int getDEFAULT_CAPACITY() {
        return DEFAULT_CAPACITY;
    }

    MyArrayList() {
        CURRENT_CAPACITY = getDEFAULT_CAPACITY();
        elementArray = new Object[CURRENT_CAPACITY];
    }

    MyArrayList(int capacity) {
        CURRENT_CAPACITY = capacity;
        elementArray = new Object[CURRENT_CAPACITY];
    }

    MyArrayList(Collection<T> collection) {
        elementArray = collection.toArray();
        elementArray = rangeCheck(elementArray);
        CURRENT_CAPACITY = collection.toArray().length;
        size = CURRENT_CAPACITY;
    }

}

