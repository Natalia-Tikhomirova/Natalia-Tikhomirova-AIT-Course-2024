package classwork_41.collections;

// .max, .min
// .reverse
// .shuffle

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsMethods {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("papaya");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("grape");
        fruits.add("apricot");
        fruits.add("peach");
        fruits.add("pear");
        fruits.add("banane");

        for (String fruit : fruits) {
            System.out.println(fruit + " | ");
        }

        System.out.println();
        System.out.println("_________________________________________");
        fruits.forEach(System.out::println);

        System.out.println("_________________sorting________________");

        Comparator<String> fruitComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return - o1.compareTo(o2);
            }
        };

//        Comparator<String> fruitComparator2 = String::compareTo;
//        Collections.sort(fruits, fruitComparator2);
//        fruits.forEach(System.out::println);

        Collections.sort(fruits); // sorting
        fruits.forEach(System.out::println);

        System.out.println("_________________sorting reverse________________");

        Collections.sort(fruits,fruitComparator); // sorting, rewrite collection (элементы переставляются местами)
        fruits.forEach(System.out::println);
        System.out.println("_________________________________________");

        Collections.sort(fruits.reversed()); // 2 - й вариант sorting
        System.out.println(fruits);
        System.out.println("_________________________________________");




        System.out.println("______________________max_________________");
        System.out.println(Collections.max(fruits,fruitComparator)); // pineapple


        System.out.println("______________________reverse_________________");
        Collections.reverse(fruits);
        fruits.forEach(System.out::println);

        System.out.println("___________________shuffle____________________");
        Collections.shuffle(fruits);
        fruits.forEach(System.out::println);

    }
} // end of class
