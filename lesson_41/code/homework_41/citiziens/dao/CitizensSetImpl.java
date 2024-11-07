package homework_41.citiziens.dao;

import homework_41.citiziens.model.Person;

import java.time.LocalDate;
import java.util.*;

public class CitizensSetImpl implements Citizens{

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
    private Set<Person> idSet;
    private Set<Person> lastNameSet;
    private Set<Person> ageSet;

    public CitizensSetImpl() {
        idSet = new HashSet<>();
        lastNameSet = new HashSet<>();
        ageSet = new HashSet<>();
    }

    public CitizensSetImpl(Set<Person> citizens){
        this(); // вызывает конструктор по умолчанию для инициализации пустых множеств
        citizens.forEach(this::add); // добавляет каждого элемента из множества в соответствующие множества по сортировкам
    }

   // O(1)
    @Override
    public boolean add(Person person) {
        if (person == null && !idSet.add(person)) {
            return false;
        }
        idSet.add(person);
        ageSet.add(person);
        lastNameSet.add(person);

        return true;
    }

    //  O(n),  так как требует поиска в множестве
    @Override
    public boolean remove(int id) {
        Person victim = find(id); // O(n)
        if (victim == null) {
            return false;
        }
        idSet.remove(victim); // O(1)
        ageSet.remove(victim); // O(1)
        lastNameSet.remove(victim); //O(1)
        return true;
    }

    // O (n)
    @Override
    public Person find(int id) {
        for (Person person : idSet) { // O(n)
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }


    //O(n)
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        Set<Person> result = new HashSet<>();
        for (Person person : ageSet) { // O(n)
            if (person.getAge() >= minAge && person.getAge() <= maxAge) {
                result.add(person);
            }
        }
        return result;
    }

    //O(n)
    @Override
    public Iterable<Person> find(String lastName) {
        Set<Person> result = new HashSet<>();
        for (Person person : lastNameSet) { // O(n)
            if (person.getLastName().equals(lastName)) {
                result.add(person);
            }
        }
        return result;
    }

    // O(1)
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return getAllPersonSortedById();
    }

    // O(1)
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return getAllPersonSortedByLastName();
    }

    // O(1)
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return getAllPersonSortedByAge();
    }

    // O(1)
    @Override
    public int size() {
        return size();
    }
} // end of class
