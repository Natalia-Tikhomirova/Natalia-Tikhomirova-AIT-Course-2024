package homework_17.HW.repetition;

// Распечатать 10 строк: “Task1”. “Task2". … “Task10”.
//Использовать цикл while.

public class Lines {

    public static void main(String[] args) {

        int x = 1;                                    // Начальная переменная для отсчета

        while ( x <= 10 ){                            // Цикл будет выполняться, пока x меньше или равно 10
            System.out.println( " Task " + x + ". "); // Печатаем текущую задачу
            x++;                                      // Увеличиваем x на 1 после каждой итерации

        } // end of while
    } // end of main
} // end of class
