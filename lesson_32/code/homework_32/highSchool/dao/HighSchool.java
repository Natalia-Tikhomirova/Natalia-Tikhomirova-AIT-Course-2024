package homework_32.highSchool.dao;

import homework_32.highSchool.model.Student;

public interface HighSchool {

    void addStudent(Student student);

    Student findStudentById(int id);

    Student removeStudentById(int id);

    void printStudents();

    Student[] findStudentsByAverageScore(double minScore, double maxScore);

    Student[] findStudentsByAgeRange(int minAge, int maxAge);

    int size();

} // end of class
