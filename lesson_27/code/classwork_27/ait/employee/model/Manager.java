package classwork_27.ait.employee.model;

// создать дочерние классы Manager, SalesManager и Worker, реализовать в них методы начисления зарплаты:
// - Manager: base + grade*hours
//- SalesManager: salesValue * percent
//- Worker: grade*hours

public class Manager extends Employee {

    private double baseSalary;
    private int grade;

    public Manager(int id, String firstName, String secondName, double hours, double baseSalary, int grade) {
        super(id, firstName, secondName, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        //return 0;
        //return baseSalary + hours * grade; // это мб меньше минимума, поэтому вводим переменную double salary
         double salary = baseSalary + hours * grade;
         return  ensureSalary(salary); // check min value of salary
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Manager{");
        sb.append("baseSalary=").append(baseSalary);
        sb.append(", grade=").append(grade);
        sb.append(", id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append('}');
        sb.append(", salary=").append(calcSalary()); // добавил зарплату в распечатку
        return sb.toString();
    }
}
