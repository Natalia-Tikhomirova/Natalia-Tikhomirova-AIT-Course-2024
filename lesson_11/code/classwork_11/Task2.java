package classwork_11;

// Задача о "вкраплениях".
//Имеется массив целых чисел, в котором несколько раз встречается число X.
//Выясните, сколько раз это число встречается в массиве?
//На каких местах массива оно стоит?

public class Task2 {

    public static void main(String[] args) {

        int [] array = { - 145, 75, 34, -15, -123, 57, -145, 86, 77, -145, 48, -59, -145 };
        int [] arrayOfIndex = new int[array.length]; // массив для поиска мест

        int x = - 145;
        int count = 0;
        int j = 0; // индекс для массива индексов

        for (int i = 0; i < array.length; i++) {

            if (array[i] == x){
                count ++;
                System.out.print(+ i + " , "); // печатаем сразу
                arrayOfIndex [j] = i; // заносим индекс во 2-й массив, чтобы потом можно было достать
                j++;   // увеличиваем индекс 2-го массива
            }
        }

        System.out.println();
        System.out.println(" Число встречается в массиве " + count + " раза . " );

        // печатаем массив индексов
        for (int i = 0; i < j; i++) {
            System.out.print(arrayOfIndex[i] + " , ");
        }
    }
}
