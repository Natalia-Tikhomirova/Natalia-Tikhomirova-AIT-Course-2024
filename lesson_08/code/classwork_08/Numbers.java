package classwork_08;

// Распечатать в консоли все числа от 1 до 100, которые делятся на 5 без остатка.
//  Задача, где мы в цикле можем печатать и проверять условия

public class Numbers {
    public static void main(String[] args) {

        int i  = 1;     // параметр цикла
        int end = 101;

        while ( i < end){

            if (i % 5 == 0){       // задаем условие кратности, в данном случае 5

                System.out.print(i + " ");

            } // end of if

            // System.out.println(i); // в столбик ln
            //System.out.print(i); // слитно без пробела в строку
            // System.out.print(i + " ") -  добавляем + " ", в строку с пробелом; переносим эту строку вверх внутрь if;

            i++; // постфиксная операция, увеличивает на 1

        } // end of cicle



    } // end of main

} // end of class
