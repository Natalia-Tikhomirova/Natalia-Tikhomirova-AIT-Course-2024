package classwork_27.ait.employee.model;

public class Worker extends Employee {

    private int grade;

    public Worker(int id, String firstName, String secondName, double hours, int grade) {
        super(id, firstName, secondName, hours);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = grade * hours;
        return ensureSalary(salary);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Worker{");
        sb.append("grade=").append(grade);
        sb.append(", id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append('}');
        sb.append(", salary=").append(calcSalary()); // добавил зарплату в распечатку
        return sb.toString();
    }
} // end of class
