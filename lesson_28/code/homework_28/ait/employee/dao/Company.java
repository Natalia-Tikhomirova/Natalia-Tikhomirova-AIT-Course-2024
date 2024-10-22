package homework_28.ait.employee.dao;

import homework_28.ait.employee.model.Employee;// - нахождение сотрудника по id +
// - обновление cотрудника +
// - удаление сотрудника +
// - печать списка сотрудников +
// - кол-во сотрудников +
// - объем ФОТ
// - объем продаж
// Запрещено в этом классе создание объектов!!!

public interface Company {

    boolean addEmployee(Employee employee); // добавление
    // boolean addEEmployeeById(int id,); - bad idea

    Employee findEmployee(int id); // нахождение

    Employee updateEmployee(Employee employee); //обновление

    Employee removeEmployee(int id); // удаление; вернет объект типа  Employee - сотрудника

    void printEmployee(); // печать

    int quantity();  // кол-во сотрудников; это метод похожий на size

    double totalSalary();

    double totalSales(); //  totalSales только у SalesManager

    double averageSalary();

    Employee[] findEmployeeHoursGreaterThan (int hours); // массив сотрудников

    Employee[] findEmployeeSalaryRange(double min, double max);

}
