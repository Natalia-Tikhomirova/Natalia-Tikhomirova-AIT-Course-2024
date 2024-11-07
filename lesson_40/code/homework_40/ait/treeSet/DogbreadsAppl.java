package homework_40.ait.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class DogbreadsAppl {
    public static void main(String[] args) {

        TreeSet<String> dogBreeds = new TreeSet<>();

        // add
        dogBreeds.add("Labrador Retriever");
        dogBreeds.add("German Shepherd");
        dogBreeds.add("Golden Retriever");
        dogBreeds.add("Bulldog");
        dogBreeds.add("Poodle");
        dogBreeds.add("Beagle");
        dogBreeds.add("Cirneco dell'Etna");
        dogBreeds.add("Italian Greyhound");

        System.out.println("All dog breeds: " + dogBreeds);
        System.out.println("___________________________________________________________");

        // remove() – удаление элемента
        dogBreeds.remove("Poodle");
        System.out.println("After removing 'Poodle': " + dogBreeds);
        System.out.println("___________________________________________________________");

        // contains() – проверка наличия элемента
        System.out.println("Contains 'Bulldog'? " + dogBreeds.contains("Bulldog"));
        System.out.println("Contains 'Chihuahua'? " + dogBreeds.contains("Chihuahua"));
        System.out.println("___________________________________________________________");

        // first() – получение первого элемента
        System.out.println("The first breed in the set: " + dogBreeds.first());

        // pollFirst() – извлечение и удаление первого элемента
        String first = dogBreeds.pollFirst();
        System.out.println("Removed first element: " + first);
        System.out.println("Set after removing the first element: " + dogBreeds);
        System.out.println("___________________________________________________________");

        // last() – получение последнего элемента
        System.out.println("The last breed in the set: " + dogBreeds.last());

        // pollLast() – извлечение и удаление последнего элемента
        String last = dogBreeds.pollLast();
        System.out.println("Last element removed: " + last);
        System.out.println("Set after removing the last element: " + dogBreeds);
        System.out.println("___________________________________________________________");

        // higher() – получение следующего элемента после указанного
        System.out.println("Breed higher Italian Greyhound: " + dogBreeds.higher("Italian Greyhound"));

        // lower() – получение предыдущего элемента до указанного
        System.out.println("Breed low Italian Greyhound: " + dogBreeds.lower("Italian Greyhound"));
        System.out.println("___________________________________________________________");

        // size
        System.out.println("Number of dogs: " + dogBreeds.size());

        // isEmpty - пуст ли набор
        System.out.println("The list of breeds is empty? " + dogBreeds.isEmpty());
        System.out.println("___________________________________________________________");

        // comparator()
        Comparator<? super String> comparator = dogBreeds.comparator();
        if (comparator == null) {
            System.out.println("Comparator: natural order is used (natural ordering)");
        } else {
            System.out.println("Comparator: " + comparator);
        }
        System.out.println("___________________________________________________________");

        // subSet() - поднабор от Beagle до Italian Greyhound (включая оба)
        TreeSet<String> subset = new TreeSet<>(dogBreeds.subSet("Beagle", true, "Italian Greyhound", true));
        System.out.println("Subset from Beagle to Italian Greyhound inclusive: " + subset);
        System.out.println("___________________________________________________________");

        // headSet()  до Golden Retriever (включая)
        TreeSet<String> headSet = new TreeSet<>(dogBreeds.headSet("Golden Retriever", true));
        System.out.println("Subset up to and including Golden Retriever: " + headSet);
        System.out.println("___________________________________________________________");

        // tailSet()  от Golden Retriever включительно и далее
        TreeSet<String> tailSet = new TreeSet<>(dogBreeds.tailSet("Golden Retriever", true));
        System.out.println("Subset from Golden Retriever inclusive and further: " + tailSet);
        System.out.println("___________________________________________________________");

        // descendingSet() - получение элементов в обратном порядке
        TreeSet<String> descendingSet = new TreeSet<>(dogBreeds.descendingSet());
        System.out.println("Set in reverse order: " + descendingSet);
        System.out.println("___________________________________________________________");

        // clear() – очистка набора
        dogBreeds.clear();
        System.out.println("Clear");

    } // end of main

} // end of class
