package classwork_39.ihash_set;

public interface ISet<E> extends Iterable<E>{

    boolean addElement(E element); // добавить элемент во множество

    boolean contains (Object o); // проверить наличие элемента во множестве

    boolean remove(Object o); // удалить элемент из множества

    int size();

} // end of class
