package homework_40.ait.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetNumbersAppl {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // add
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(25);
        numbers.add(15);
        numbers.add(30);
        numbers.add(1);

        System.out.println("All numbers: " + numbers);
        System.out.println("___________________________________________________________");

        // Метод remove() – удаление элемента
        numbers.remove(15);
        System.out.println("After removing '15': " + numbers);
        System.out.println("___________________________________________________________");

        // Метод contains() – проверка наличия элемента
        System.out.println("Contains '10'? " + numbers.contains(10));
        System.out.println("Contains '50'? " + numbers.contains(50));
        System.out.println("___________________________________________________________");

        // first() – получение первого элемента
        System.out.println("The first number in the set: " + numbers.first());

        // Метод pollFirst() – извлечение и удаление первого элемента
        Integer first = numbers.pollFirst();
        System.out.println("Removed first element: " + first);
        System.out.println("Set after removing the first element: " + numbers);
        System.out.println("___________________________________________________________");

        // last() – получение последнего элемента
        System.out.println("The last number in the set: " + numbers.last());

        // Метод pollLast() – извлечение и удаление последнего элемента
        Integer last = numbers.pollLast();
        System.out.println("Last element removed: " + last);
        System.out.println("Set after removing the last element: " + numbers);
        System.out.println("___________________________________________________________");

        // Метод higher() – получение следующего элемента после указанного
        System.out.println("Next higher number after 10: " + numbers.higher(10));

        // Метод lower() – получение предыдущего элемента до указанного
        System.out.println("Next lower number before 10: " + numbers.lower(10));
        System.out.println("___________________________________________________________");

        // size
        System.out.println("Number of elements: " + numbers.size());

        // isEmpty - пуст ли набор
        System.out.println("Is the set empty? " + numbers.isEmpty());
        System.out.println("___________________________________________________________");

        // Проверка метода comparator()
        Comparator<? super Integer> comparator = numbers.comparator();
        if (comparator == null) {
            System.out.println("Comparator: natural order is used (natural ordering)");
        } else {
            System.out.println("Comparator: " + comparator);
        }
        System.out.println("___________________________________________________________");

        // Метод subSet() - поднабор от 5 до 25 (включая оба)
        TreeSet<Integer> subset = new TreeSet<>(numbers.subSet(5, true, 25, true));
        System.out.println("Subset from 5 to 25 inclusive: " + subset);
        System.out.println("___________________________________________________________");

        // Метод headSet() до 20 (включая)
        TreeSet<Integer> headSet = new TreeSet<>(numbers.headSet(20, true));
        System.out.println("Subset up to and including 20: " + headSet);
        System.out.println("___________________________________________________________");

        // Метод tailSet() от 15 включительно и далее
        TreeSet<Integer> tailSet = new TreeSet<>(numbers.tailSet(15, true));
        System.out.println("Subset from 15 inclusive and further: " + tailSet);
        System.out.println("___________________________________________________________");

        // Метод descendingSet() - получение элементов в обратном порядке
        TreeSet<Integer> descendingSet = new TreeSet<>(numbers.descendingSet());
        System.out.println("Set in reverse order: " + descendingSet);
        System.out.println("___________________________________________________________");

        // Метод clear() – очистка набора
        numbers.clear();
        System.out.println("Clear");
    }
} // end of class
