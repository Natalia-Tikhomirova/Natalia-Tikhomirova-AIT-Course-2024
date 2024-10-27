package homework_32.highSchool;

import homework_32.highSchool.dao.HighSchool;
import homework_32.highSchool.dao.HighSchoolImpl;
import homework_32.highSchool.model.Student;

public class HighSchoolAppl {

    public static void main(String[] args) {
        HighSchool highSchool = new HighSchoolImpl(10);

        // Добавление студентов
        highSchool.addStudent(new Student(1, "Alice", 18,4.5));
        highSchool.addStudent(new Student(2, "Bob", 19,3.0));
        highSchool.addStudent(new Student(3, "Charlie", 25,4.0));
        highSchool.addStudent(new Student(4, "David", 30,5.0));

        // Печать всех студентов
        System.out.println("All students:");
        highSchool.printStudents();

        // Поиск студентов по среднему баллу
        double minScore = 3.5;
        double maxScore = 5.0;
        Student[] filteredStudents = highSchool.findStudentsByAverageScore(minScore, maxScore);

        // Печать отфильтрованных студентов
        System.out.println("\nStudents with average score between " + minScore + " and " + maxScore + ":");
        for (Student student : filteredStudents) {
            System.out.println(student);
        }
    }

} // end of class
