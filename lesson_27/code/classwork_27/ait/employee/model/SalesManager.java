package classwork_27.ait.employee.model;

public class SalesManager extends Employee {

    private double salesValue; // на сколько продаст в месяц
    private  double percent;

    public SalesManager(int id, String firstName, String secondName, double hours, double salesValue, double percent) {
        super(id, firstName, secondName, hours);
        this.salesValue = salesValue;
        this.percent = percent;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double calcSalary() {
        double salary = salesValue * percent;
        return ensureSalary(salary);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SalesManager{");
        sb.append("salesValue=").append(salesValue);
        sb.append(", percent=").append(percent);
        sb.append(", id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append('}');
        sb.append(", salary=").append(calcSalary()); // добавил зарплату в распечатку
        return sb.toString();
    }
} // end of class
