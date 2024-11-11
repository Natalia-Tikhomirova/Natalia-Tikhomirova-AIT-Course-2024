package homework_43.student;

import java.util.List;
import java.util.Objects;

public class Student {

    private String name;
    private List<Integer> grades;

    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(name, student.name) && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grades);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", grades=").append(grades);
        sb.append('}');
        return sb.toString();
    }

    public double getAverageGrade() {

        return grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0); // Если список пуст, возвращаем 0.0
    }
} // end of class
