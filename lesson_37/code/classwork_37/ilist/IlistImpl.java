package classwork_37.ilist;

import classwork_37.ilist.model.Ilist;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;

public class IlistImpl <E> implements Ilist<E> {

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
        elements[size++] = element; // ставим element на последнее место
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
        if (index == size) { // добавление в конец массива
            add(element);
            return true;
        }
        // добавляем в середину массива

        checkIndex(index);
        ensureCapacity();
        System.arraycopy(elements,index,elements, index +1, size ++ - index);
        elements[index] = element;
        return true;
    }

    private void checkIndex(int index) {
        // индекс не мб < 0 и > size
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Wrong index: " + index);
        }
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E el = (E) elements[index];
        // удаляем
        System.arraycopy(elements,index + 1, elements, index,-- size - index);
        elements[size] = null;
        return el;
    }
    //    После выполнения System.arraycopy, когда элементы сдвигаются на одну позицию назад,
//    последний элемент становится дублированным на предпоследней позиции.
//    Затирание последнего элемента elements[size] = null; выполняется для очистки этой дублированной позиции,
//    иначе в списке может остаться ссылка на ненужный объект, что может вызвать утечку памяти.
//    Этот шаг необходим для правильной работы списка и предотвращения утечек памяти. В Java объекты не удаляются
//    сразу после вызова remove, и сборка мусора может произойти позже. Поэтому затирание последнего элемента является
//    хорошей практикой для избежания утечек памяти.

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E update = (E) elements[index];
        elements[index] = element;
        return update;
    }

    @Override
    public int indexOf(Object o) {
        if ( o != null){
            for (int i = 0; i < size; i++) {
                if(elements[i].equals(o)){
                    return i;
                }
            }
        }else {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public @NotNull Iterator iterator() {
        return new Iterator() {
            int i = 0; // указатель на текущий элемент коллекции

            @Override
            public boolean hasNext() {
                return i < size; // true, когда указатель находится внутри коллекции
            }

            @Override
            public Object next() {
                return (E) elements[i++];
            }
        };
    }
} // end of class
