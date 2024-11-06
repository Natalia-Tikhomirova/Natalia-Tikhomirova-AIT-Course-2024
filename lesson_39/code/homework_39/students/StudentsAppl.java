package homework_39.students;


import java.util.*;

// Напишите программу, которая: Создает список студентов, зарегистрированных на два разных курса:
// "Математика" и "Информатика".
// Выводит: Список студентов, которые записаны на оба курса.
// Список студентов, которые записаны только на один из курсов.
// Условия: Используйте два HashSet для хранения студентов каждого курса.
// Программа должна использовать операции пересечения и разности множеств для вывода нужных списков.

public class StudentsAppl {
    public static void main(String[] args) {

        Set<String> mathStudents = new HashSet<>(Set.of("Алексей Смирнов", "Мария Иванова", "Павел Петров", "Ирина Сидорова", "Светлана Васильева", "Олег Кузнецов"));

        Set<String> infStudents = new HashSet<>(Set.of("Павел Петров", "Ирина Сидорова", "Дмитрий Орлов", "Елена Смирнова","Наталья Лебедева", "Алексей Смирнов"));

        // Студенты, записанные на оба курса
        Set<String> bothCources = new HashSet<>(mathStudents); // объявляем всех "как бы" математиками (инициализируем всех mathStudents)
        // метод retainAll изменяет текущее множество, оставляя только пересечение двух множеств:
        bothCources.retainAll(infStudents); // удаляем из "как бы" математиков тех, кто ими не является
        System.out.println("Students of both cources: " + bothCources);

        // Студенты, записанные только на один курс

        Set<String> onlyMath = new HashSet<>(mathStudents); // создаем новое множество onlyMath, которое инициализируется значениями из mathStudents

        // метод removeAll удаляет из onlyMath всех студентов, которые также записаны на курс "Информатика"
        onlyMath.removeAll(infStudents);

        Set<String> onlyInf = new HashSet<>(infStudents); // создаем множество onlyInf
        onlyInf.removeAll(mathStudents); // удаляем из него всех студентов, которые записаны на курс "Математика"

        // метод addAll  добавляет всех студентов из onlyInf в onlyMath
        onlyMath.addAll(onlyInf);
        System.out.println("Students of only one cources: " + onlyMath);

    } // end of main

} // end of class
