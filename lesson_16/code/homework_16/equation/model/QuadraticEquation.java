package homework_16.equation.model;

// В этом классе определить поля private double a; private double b; private double c;.
// Создать конструктор public QuadraticEquation(double a, double b, double c) для инициализации полей.
// Создать геттеры и сеттеры. Создать метод public void display() для печати в консоль квадратного уравнения.
// Создать методы public double delta() и public int quantityRoots() для вычисления дискриминанта и
// количества решений уравнения соответственно.

public class QuadraticEquation {

    // field

    private double a;
    private double b;
    private double c;

   // constructor


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // getters and setters


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Метод для отображения уравнения
    public void display(){
        System.out.println("Квадратное уравнение: " + a + "x^2 + " + b + "x + " + c + " = 0");
    }

    // Метод для вычисления дискриминанта (delta)
    public double delta() {
        return b * b - 4 * a * c;
    }

    // Метод для определения количества корней






} // end of class

