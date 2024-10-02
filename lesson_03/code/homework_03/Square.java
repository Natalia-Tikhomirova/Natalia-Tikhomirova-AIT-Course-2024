package homework_03;

// Метод вычисляющий площадь квадрата по его стороне;
// В методе main вызвать вышеуказанные методы с различными аргументами, и результаты вывести в консоль.
// площадь квадрата со стороной 500 составляет ...

public class Square {

    public static void main(String[] args) {

        double a = 500;

        double area = areaOfSquare(a);
        System.out.println("The area of square with side " + a + " is: " + area);

    } // end of main

    public static double areaOfSquare (double a){

        double res = a * a;
        return res;

    }

} //end of class