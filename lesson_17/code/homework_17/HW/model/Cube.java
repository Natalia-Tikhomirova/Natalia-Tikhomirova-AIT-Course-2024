package homework_17.HW.model;

// Создать класс Cube, описывающий куб cо стороной a. Реализовать в нем методы определения периметра p (сумма длин всех ребер), площади s (сумма площадей всех граней) и объема v. Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube. Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

public class Cube {

    private double a;                                     // Длина ребра куба

    // Конструктор для инициализации длины стороны куба:
    public Cube(double a) {
        this.a = a;
    }

    // Геттер для получения значения стороны куба:
    public double getA() {
        return a;
    }

    // Сеттер для изменения значения стороны куба:
    public void setA(double a) {
        this.a = a;
    }

    // Метод для вычисления периметра куба (сумма длин всех ребер):
    public double perimetr(){
        double sum = 12 * a;                            // У куба 12 ребер
        return sum ;
    }

    // Метод для вычисления площади поверхности куба (сумма площадей всех граней):
    public double surfaceArea(){
        double surfaceArea = 6 * (a * a);              // Площадь одной грани: a*a, у куба 6 граней
        return surfaceArea;
    }

    // Метод для вычисления объема куба:
    private double volume(){
        double volume = a * a * a;                     // Объем куба: a^3
        return volume;
    }

    public void display(){

        System.out.println( " Куб со стороной а = " + a + " см");
        System.out.println( " Периметр: " + perimetr() + " см");
        System.out.println( " Площадь всех граней: " + surfaceArea() + " см");
        System.out.println( " Объём: " + volume() + " см");
    }

} // end of class
