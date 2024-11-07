package homework_41.citiziens.dao;

import homework_41.citiziens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensImpl implements Citizens{

    // статические переменные класса
    private static Comparator<Person> lastNameComparator;
    private static Comparator<Person> ageComparator;

    static {
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
    }

    // fields
    private List<Person> idList;
    private List<Person> lastNameList;
    private List<Person> ageList;

    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensImpl(List<Person> citizens) {
        this();
        citizens.forEach(p -> add(p));
    }

    // Ожидаемо O (log n), но из/за сдвига элементов - O (n)
    @Override
    public boolean add(Person person) {

        // передан ли объект (не пустая ли ссылка)
        if (person == null) { // 0(1)
            return false; // нет смысла добавлять пустую ссылку
        }

        // добавляет person в idList на вычисленный index
        int index = Collections.binarySearch(idList, person); // поиск person в idList; O (log n)
        if (index >= 0) { // найден дубликат, не добавляем
            return false;
        }
        index = -index - 1; // если binarySearch не находит person в списке, то он возврашает отриц. значение. А (-index - 1) - это формула, по которой находится позиция для вставки
        idList.add(index, person); // добавляем  person в index; O(n)

        // метод добавляет объект person в списки, отсортированные по возрасту и фамилии, чтобы можно было person искать быстрее
        index = Collections.binarySearch(ageList, person, ageComparator); // O(log n)
        index = index >= 0 ? index : - index - 1;
        ageList.add(index, person); // O(n)
        index = Collections.binarySearch(lastNameList, person, lastNameComparator); // O(log n)
        index = index >= 0 ? index : -index - 1;
        lastNameList.add(index, person); // O(n)
        return true;
    }


    // Ожидаемо O (log n), но из/за сдвига элементов - O (n)
    @Override
    public boolean remove(int id) {
        Person victim = find(id); // O(log n)
        if (victim == null) {
            return false;
        }
        idList.remove(victim); //  O(n)
        ageList.remove(victim); //  O(n)
        lastNameList.remove(victim); // O(n)
        return true;
    }

    // O (log n)
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now());
        int index = Collections.binarySearch(idList, pattern);
        return index < 0 ? null : idList.get(index);
    }

    // O (log n)
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1; // O (log n)
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1; // O (log n)
        return ageList.subList(from, to); // O(1)
    }

    // O (log n)
    @Override
    public Iterable<Person> find(String lastName) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now);
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1; // O (log n)
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now);
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1; // O (log n)
        return lastNameList.subList(from, to); // O(1)
    }

    //  O(1)
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idList;
    }

    //  O(1)
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameList;
    }

    //  O(1)
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageList;
    }

    // O (1)
    @Override
    public int size() {
        return idList.size();
    }
}