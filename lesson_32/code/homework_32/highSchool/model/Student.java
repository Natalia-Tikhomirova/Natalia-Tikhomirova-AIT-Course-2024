package homework_32.highSchool.model;

import java.util.Objects;

public class Student extends Person{

    private double averageScore;

    public Student(int id, String name, int age, double averageScore) {
        super(id, name, age);
        this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(averageScore, student.averageScore) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), averageScore);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("averageScore=").append(averageScore);
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
} // end of class
