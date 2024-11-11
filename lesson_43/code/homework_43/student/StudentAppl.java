package homework_43.student;

//Имеется набор оценок 20 студентов в диапазоне от 5 до 1 балла за семестр по 10 предметам.
// Смоделируйте этот набор данных, найдите студентов с максимальным/минимальным средним баллом.
// Используйте методы stream()


import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;

public class StudentAppl {

    public static void main(String[] args) {

        List<Student> students =
                new Random().ints(20, 1, 21) // Генерация чисел от 1 до 21 (для Student 1 - Student 20)
                        .distinct()
                        .mapToObj(i -> {
                            List<Integer> grades = new Random().ints(10, 1, 6) // Генерация 10 оценок для каждого студента
                                    .boxed()
                                    .collect(Collectors.toList());
                            return new Student("Student " + i, grades);
                        })
                        .toList();

        students.forEach(System.out::println);

        Student maxAverageStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getAverageGrade))
                .orElseThrow(() ->  new NoSuchElementException("No sudent found"));

        Student minAverageStudent = students.stream()
                .min(Comparator.comparingDouble(Student::getAverageGrade))
                .orElseThrow(() -> new NoSuchElementException("No sudent found"));

        System.out.println("===========================================================================");
        System.out.println("Student with max average grade: " + maxAverageStudent);
        System.out.println("Student with min average grade: " + minAverageStudent);
    }

} // end of class
