package homework_03;

 // Метод вычисляющий периметр прямоугольника по двум сторонам
 // В методе main вызвать вышеуказанные методы с различными аргументами, и результаты вывести в консоль.
 // периметр прямоугольника со сторонами 1000 и 2000 равен ...

public class Perimeter {

    public static void main(String[] args) {

        double a = 1000;
        double b = 2000;

        // double perimeter = 2 * (a + b);

        double perimeter = perimeterOfRectangle(a,b);
        System.out.println("The perimeter of rectangle with two sides " + perimeter);

    } // end of main

    public static double perimeterOfRectangle(double x, double y){

        double res = 2* ( x + y );
        return res;
    }

} // end of class
