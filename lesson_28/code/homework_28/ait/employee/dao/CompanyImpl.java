package homework_28.ait.employee.dao;

import homework_28.ait.employee.model.Employee;
import homework_28.ait.employee.model.SalesManager;

import java.util.function.Predicate;

public class CompanyImpl implements Company {

    private Employee[]employees; // element массива employees[0], employees[1],
    private int size;

   // capacity - возможное количество сотрудников
    public CompanyImpl(int capacity) {
        this.employees = new Employee[capacity];
        this.size = size;
    }

    @Override
    public boolean addEmployee(Employee employee) { // тип сущности - Employee; employee - конкретный экземпляр такого типа, и это временная переменная этого метода
        // bad case
        if (employee == null){
            return false;
        }
        if (size == employees.length){ // mployees.length -
            return false;
        }

        if(findEmployee(employee.getId()) != null){ //
            return false;
        }

        // good case
        employees[size] = employee;// на индекс последнего элемента добавляем сотрудника - put in array
        size++;  // за счет нового сотрудника size увеличивается
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
//        Employee victim = findEmployee(id); // нашли по id
//        // на место жертвы ставим  (копируем ) последний элемент массива
//        employees[victim.getId()] = employees[size - 1];
//        // последний элемент массива затираем с помомощью null;
//        employees[size - 1] = null;
        // size--;
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                Employee victim = employees[i];
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {

        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id ){
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary(); // метод - calcSalary();
        }
        return totalSalary;
    }



    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager){ // проверка перед кастингом
                SalesManager sm = (SalesManager) employees[i];
                totalSales += sm.getSalesValue();
            }
        }
        return totalSales;
    }

    @Override
    public double averageSalary() {
        return totalSalary()/size;
    }

    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        return findEmployeeByPredicate(employee -> employee.getHours() > hours);
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
       return findEmployeeByPredicate(employee -> employee.calcSalary() > min && employee.calcSalary() < max);
    }

    // в этот метод передаем логическое выражение, которое будет тестировать объекты типа Employee
    public Employee[] findEmployeeByPredicate(Predicate<Employee> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(employees[i])){
                count++;
            }
        }
        Employee[]res = new Employee[count];

        for (int i = 0, j = 0; j < res.length; i++) {
            if(predicate.test(employees[i])){
                res[j++] = employees[i];
            }
        }
       return res;
    }


} // end of class
