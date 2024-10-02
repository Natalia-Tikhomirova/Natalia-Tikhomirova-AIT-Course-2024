package classwork_08;

// Распечатать в консоли таблицу умножения от 1 до 10.

public class MultiplicationTable {

    public static void main(String[] args) {
        // цикл в цикле

        int i = 1, j = 1; // ввели 2 переменных

        while (i < 11){

            while (j < 11){

                System.out.print( i + " x " + j+ " = " + ( i * j ) + " | "); // печатаем построчно без ln
                j++; // "x" - умножение, можно заменить на  *

            } // end of if j

            j = 1; // cкидываем переменную до 1 (до нач. условия), чтобы начать умножение с первой цифры
            i++;

            System.out.println(); // next line

        } // end of if i

    } // end of main

} // end of class
