package classwork_36.ilist.model;

public interface Ilist<E> extends Iterable<E>{ // расширили методами Iterable

    int size();

    default boolean isEmpty() {
        return size() == 0;
    }

    ; // пустой лист или нет

    void clean(); // очищаем память

    boolean add(E element);

    default boolean contain(Object o){
        return indexOf(o) >= 0;
    }; // содержится объект?

    default boolean remove(Object o){
        int index = indexOf(o);
        if(index < 0){
            return false;
        }
        remove(index);
        return true;
    };

    boolean add(int index, E element);

    E remove(int index);

    E get(int index);

    int indexOf(Object o);

    int lastIndexOf(Object o);


} // end of class
