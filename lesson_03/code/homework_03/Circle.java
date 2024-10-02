package homework_03;

 // Метод вычисляющий площадь круга по его радиусу
 // В методе main вызвать вышеуказанные методы с различными аргументами, и результаты вывести в консоль.
 // площадь круга для R = 200 равна ...

public class Circle {
    public static void main(String[] args) {

        double PI = 3.14159;
        double r = 200;

        // solution 1

        double area = PI * r * r; // площадь круга для R = 200 равна PI * r * r
        System.out.println("Area of circle:" + area);


        // solution with method

        area = areaOfCircle(PI,r);
        System.out.println(area);

    } // end of main

    public static double areaOfCircle(double PI, double r){
        double res = PI * r * r;
        return res;


    }




} // end of class
