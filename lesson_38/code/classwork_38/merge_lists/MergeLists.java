package classwork_38.merge_lists;

// Напишите программу, которая объединяет два списка целых чисел (ArrayList<Integer>),
// удаляет из объединенного списка дубликаты и сортирует его в порядке возрастания.
// list1 = [3, 5, 1, 9, 3]
// list2 = [8, 2, 5, 3]

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeLists {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(List.of(3, 5, 1, 9, 3));

        ArrayList<Integer> list2 = new ArrayList<>(List.of(8, 2, 5, 3));

        // Merging list - объединение
        ArrayList<Integer> mergeList = new ArrayList<>(list1); // add list 1 to mergeList
        mergeList.addAll(list2); // add list2 to mergeList
        System.out.println(mergeList);

        // Remove duplicates
        Set<Integer> uniqeNumbers = new HashSet<>(mergeList);
        System.out.println(uniqeNumbers);

        // Put set into List
        mergeList = new ArrayList<>(uniqeNumbers);
        mergeList.sort(Integer::compareTo);

        // print result
        System.out.println(mergeList);

    }
} // end of class
