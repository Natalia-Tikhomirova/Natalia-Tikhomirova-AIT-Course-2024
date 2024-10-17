package classwork_26.ait.employee.dao;

import classwork_26.ait.employee.model.Employee;

// - добавление сотрудника +
// - нахождение сотрудника по id +
// - обновление cотрудника +
// - удаление сотрудника +
// - печать списка сотрудников +
// - кол-во сотрудников +
// - объем ФОТ
// - объем продаж

public interface Company {

    boolean addEmployee(Employee employee); // добавление

    Employee findEmployee(int id); // нахождение

    Employee updateEmployee(Employee employee); //обновление

    Employee removeEmployee(int id); // удаление; вернет объект типа  Employee - сотрудника

    void printEmployee(); // печать

    int quantity();  // кол-во сотрудников; это метод похожий на size

    double totalSalary();

    double totalSales(); //  totalSales только у SalesManager

    Employee[] findEmployeeHoursGreaterThan (int hours); // массив сотрудников

    Employee[] findEmployeeSalaryRange(double min,double max);

}
