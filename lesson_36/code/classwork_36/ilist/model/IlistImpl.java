package classwork_36.ilist.model;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;

public class IlistImpl implements Ilist {

    Object[] elements;
    private int size;

    public IlistImpl(int initialCapacity) { // с нее стартуем и будем увеличивать
        // this.elements = new Object[initialCapacity];
        if(initialCapacity < 0){
            throw new IllegalArgumentException("Illegal capacity " + initialCapacity); // класс избегания ошибок
        }
        elements = new Object[initialCapacity];
    }

    public IlistImpl(){
        this(10); // начальный массив на 10 элементов
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public void clean() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean add(Object element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    private void ensureCapacity(){
        if (size == elements.length){
            if(size == Integer.MAX_VALUE){
                throw new OutOfMemoryError();
            }
            int newCapacity = elements.length + elements.length / 2; // увеличение в полтора раза
            if (newCapacity < 0)
                newCapacity = Integer.MAX_VALUE;
            elements = Arrays.copyOf(elements,newCapacity); // копируем в этот же массив с новой длиной

        }
    }

    @Override
    public boolean add(int index, Object element) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
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
    public @NotNull Iterator iterator() {
        return null;
    }
} // end of class
