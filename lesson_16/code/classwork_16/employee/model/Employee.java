package classwork_16.employee.model;

// - создадим класс Employee (работник):
//  - поля
//  - конструктор
//  - геттеры и сеттеры
//  - метод display
//  -создадим класс FirmaAppl, в котором:
//  - создаем объекты типа Employee
//  - определим зарплату и вычислим ее общую сумму.

import classwork_16.Adress;
import classwork_16.car_object.model.Car;

public class Employee {
    // field
    private int id;
    private String name;
    private String lastName;
    private double salary; // зарплата
    private boolean gender; //
    // private Adress adress;// пол
   //  private Car car;

    // constructor
    public Employee(int id, String name, String lastName, double salary, boolean gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName; //можно менять -> setter
        this.salary = salary; //можно менять -> setter
        this.gender = gender;
    }

    // getters and setters

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isGender() {
        return gender;
    }

    public  String displayEmployee(){
        return String.format("ID: %d, name: %s, lastName: %s, salary: %.2f, gender: %s",id,name,lastName,salary,gender);
    }

} // end of class
