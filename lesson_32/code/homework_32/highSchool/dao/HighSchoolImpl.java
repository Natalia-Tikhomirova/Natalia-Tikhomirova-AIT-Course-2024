package homework_32.highSchool.dao;

import homework_32.highSchool.model.Student;

import java.util.Arrays;

public class HighSchoolImpl implements HighSchool{

    Student[] students;
    private int size;

    public HighSchoolImpl(int capacity) {
        this.students = new Student[capacity];
        this.size = 0;
    }

    @Override
    public void printStudents() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }


    @Override
    public void addStudent(Student student) {
        if(size >= students.length){
            students = Arrays.copyOf(students, size + 1);
        }
        students[size++] = student;

    }
    @Override
    public Student findStudentById(int id) {
        for (int i = 0; i < size; i++) {
            if (students[i] != null && students[i].getId() == id){
                return students[i];
            }
        }
        return null;
    }

    @Override
    public Student removeStudentById(int id) {
        for (int i = 0; i < size; i++) {
            if (students[i] != null && students[i].getId() == id) { // Проверка на null
                Student removed = students[i]; // Сохраняем ссылку на удаляемого студента
                System.arraycopy(students, i + 1, students, i, size - i - 1); // Сдвигаем элементы влево
                students[--size] = null; // Освобождаем последнее место
                return removed; // Возвращаем удалённого студента
            }
        }
        return  null;
    }


    @Override
    public Student[] findStudentsByAverageScore(double minScore, double maxScore) {
        Student[] result = new Student[size]; // Массив для хранения подходящих студентов
        int resultSize = 0; // Счетчик для подходящих студентов

        for (int i = 0; i < size; i++) {
            // Проверка, попадает ли средний балл в заданный диапазон
            if (students[i] != null && students[i].getAverageScore() >= minScore && students[i].getAverageScore() <= maxScore) {
                result[resultSize++] = students[i]; // Добавление подходящего студента в результат
            }
        }

        return Arrays.copyOf(result, resultSize); // Возвращение массива с подходящими студентами
    }

    @Override
    public Student[] findStudentsByAgeRange(int minAge, int maxAge) {
        Student[] result = new Student[size];
        int resultSize = 0;

        for (int i = 0; i < size; i++) {
            if (students[i] != null && students[i].getAge() >= minAge && students[i].getAge() <= maxAge) {
                result[resultSize] = students[i];
                resultSize++;
            }
        }

        return Arrays.copyOf(result, resultSize);
    }

    @Override
    public int size() {
        return size;
    }

} // end of class
