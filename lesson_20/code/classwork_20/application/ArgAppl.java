package classwork_20.application;

public class ArgAppl {

    public static void main(String[] args) {

        // метод main получает аргументы
        //  String[] args - это массив данных типа String, args - это ИМЯ массива

        String str1 = args[0]; // первый элемент массива по индексу 0
        // int n1 = Integer.parseInt(str1); // вынимаем число из строки (парсим)

        String str2 = args[1]; // второй элемент массива по индексу 1
        // int n2 = Integer.parseInt(str2); // вынимаем число из строки (парсим)

        // System.out.println(n1 * n2); // кратко
        // System.out.println(str1 + " * " + str2 + " = " + n1 * n2); // подробно

        System.out.println(str1 + " , " + str2);


    } // end of main
} // end of class
