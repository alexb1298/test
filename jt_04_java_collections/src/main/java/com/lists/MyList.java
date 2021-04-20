package com.lists;

import java.util.*;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 1;
    private Object []elements;

    public MyList()
    {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public void insert(final E entity)
    {
        if (this.size == this.elements.length) {
            this.ensureCapacity();
        }
        this.elements[this.size++] = entity;
    }
    @SuppressWarnings("unchecked")
    public E get(final int index)
    {
        if (index >= this.size || index < 0)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) this.elements[index];
    }
    @SuppressWarnings("unchecked")
    public E deleteByIndex(final int index)
    {
        if (index >= this.size || index < 0)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        final Object item = this.elements[index];
        final int newSize = this.elements.length - ( index + 1 ) ;
        System.arraycopy(this.elements, index + 1, this.elements, index, newSize ) ;
        this.size--;
        return (E) item;
    }

    public int size()
    {
        return this.size;
    }

    @Override
    public String toString()
    {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for(int index = 0; index < this.size; index++) {
            stringBuilder.append(this.elements[index].toString());
            if(index< this.size -1){
                stringBuilder.append(",\n");
            }
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    private void ensureCapacity()
    {
        final int newSize = this.elements.length +1;
        this.elements = Arrays.copyOf(this.elements, newSize);
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        final MyList<?> myList = (MyList<?>) object;
        return this.size == myList.size && Arrays.equals(this.elements, myList.elements);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(this.size);
        result = 31 * result + Arrays.hashCode(this.elements);
        return result;
    }

    public void sort()
    {
        Arrays.sort(this.elements);
    }
}

