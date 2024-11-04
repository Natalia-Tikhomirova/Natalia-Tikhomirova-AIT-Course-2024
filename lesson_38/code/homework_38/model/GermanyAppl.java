package homework_38.model;

// В классе GermanyAppl cоздать LinkedList, содержащий города - столицы земель Германии.
// Опробовать на нем методы, которые доступны для класса LinkedList.
// Добавить вольный город Гамбург в начало, в середину списка, в конец списка.
// Отсортировать список по алфавиту и в обратном порядке.

import classwork_38.linked_list_test.LinkedListAppl;

import java.util.*;

public class GermanyAppl {
    public static void main(String[] args) {

        LinkedList<String> germanStateCapitals = new LinkedList<>(Arrays.asList("Stuttgart", "München", "Berlin", "Potsdam", "Bremen", "Hamburg", "Wiesbaden", "Hannover", "Schwerin", "Düsseldorf", "Mainz", "Saarbrücken", "Dresden", "Magdeburg", "Kiel", "Erfurt"));

        printGermanStateCapitals(germanStateCapitals);

        System.out.println();
        System.out.println("________________________________");
        System.out.println(germanStateCapitals.size());
        System.out.println("----------------------------------");
        System.out.println(germanStateCapitals.getFirst());
        System.out.println("----------------------------------");
        System.out.println(germanStateCapitals.getLast());
        System.out.println("----------------------------------");
        System.out.println(germanStateCapitals.get(5)); // Hamburg
        System.out.println("----------------------------------");
        germanStateCapitals.set(1,"Hamburg"); // München ->  Hamburg
        printGermanStateCapitals(germanStateCapitals);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        Iterator<String> iterator = germanStateCapitals.iterator(); // remove Hamburg
        while (iterator.hasNext()) {
            String city = iterator.next();
            if (city.equals("Hamburg")) {
                iterator.remove();
            }
        }
        printGermanStateCapitals(germanStateCapitals);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");


        germanStateCapitals.remove(germanStateCapitals.indexOf("Bremen")); // remove Bremen
        printGermanStateCapitals(germanStateCapitals);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        printGermanStateCapitals(germanStateCapitals);
        System.out.println();

        // Добавить вольный город Гамбург в начало
        germanStateCapitals.addFirst("Hamburg");
        System.out.println(germanStateCapitals);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        //  в середину списка
        System.out.println(germanStateCapitals.size());
        System.out.println("-----------------------------------------------------------------");
        germanStateCapitals.add(germanStateCapitals.size()/ 2, "Hamburg");
        System.out.println(germanStateCapitals);
        System.out.println("-----------------------------------------------------------------");


        // в конец списка.
        germanStateCapitals.add("Hamburg");
        System.out.println(germanStateCapitals);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        // Отсортировать список по алфавиту.

        Collections.sort(germanStateCapitals);
        System.out.println("Sorted citys: " + germanStateCapitals);
        System.out.println("-----------------------------------------------------------------");

        // и в обратном порядке.

        Collections.sort(germanStateCapitals,Collections.reverseOrder());
        System.out.println("Sorted citys: " + germanStateCapitals);













    } // end of main

    private static void  printGermanStateCapitals (LinkedList<String> germanStateCapitals){

        for (String germanStateCapital : germanStateCapitals) {
            System.out.print(germanStateCapital + " , ");
        }

    }
} // end of class
