package classwork_26.ait.employee.model;

public class SalesManager extends Employee{

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
}