package homework_05;

// Задать в программе три стороны треугольника.
// Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
// Сообщить результат - существует или нет треугольник с заданными сторонами.

public class Triangle {

    public static void main(String[] args) {

        int a = 5;
        int b = 9;
        int c = 15;


        if ( a == 0 | b == 0 | c == 0 ){

            System.out.println( " Треугольник не существует.");

        }else if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println( " Треугольник  существует." );

        } else System.out.println(" Треугольник не существует.");


    } // end of main


} // end of class
