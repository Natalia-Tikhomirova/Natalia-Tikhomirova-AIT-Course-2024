package classwork_15.string_methods;

public class StringAppl {
    public static void main(String[] args) {

        String str1 = "Hello,"; // первая строка

        char[] chars = {32, 'W', 'o', 'r', 'l', 'd', '!'}; // 32 - код пробела по таблице ASCII

        String str2 = new String(chars); // str2 - объект класса String, сделанный конструктором (тоже метод)
        // new - обращение к конструктору класса

        System.out.println(str1); // Hello,
        System.out.println(str2); //  World!

        // concat - объединяем, складываем объекты типа String

        String str = str1 + str2;
        System.out.println(str);

        //str1.concat(str1); // конкатенация с помощью метода
       System.out.println(str1.concat(str2));
       System.out.println(str1); // str1 не изменилось, т.к. тип String является неизменяемым - immutable

        // length of String
        int l = str.length(); // определяем длину строки str (идентификатор объекта типа String)
        System.out.println(l);

        // 1st symbol
        char ch = str.charAt(0);
        System.out.println(" First symbol: " + ch);

        // last symbol

        ch = str.charAt(str.length() - 1);
        System.out.println(" Last symbol: " + ch);

        // print str with spaces
        for (int i = 0; i < str.length(); i++) {
            System.out.print( str.charAt(i) + " ");  // i - параметр цикла (как и в массивах)
        }

        System.out.println(); // new line

        // check equals - проверить равенство строк
        String str3 = " worlD!";
        boolean checker = str3.equals(str2); // str2 = " World!"
        System.out.println(checker); // false
        checker = str3.equalsIgnoreCase(str2);
        System.out.println(checker); // true

        System.out.println("________________________________________");

        // symbol in position
        int index = str.indexOf('W');
        System.out.println(index); // 7 index

        int index1 = str.lastIndexOf('d'); //  при поиске идем справа налево??? - НЕТ
        System.out.println(index1);
        index = str.indexOf('o');
        index1 = str.lastIndexOf('o');
        System.out.println(index + " , " + index1); //
        index = str.indexOf('x');
        System.out.println(index); // -1 - символа такого в строке нет

        System.out.println("_________________substring______________________________________");
        System.out.println(str.substring(7));
        System.out.println(str.substring(7,10));

        System.out.println("_____________________________replace____________________________");
        str.replace("o","0-0-0");
        System.out.println(str.replace("o","0-0-0"));

        System.out.println("_____________________________split______________________________");
        // numbers of words - количество слов
        String str4 = "I love string in Java";
        String [] words = str4.split(" ");
        int w = words.length;
        System.out.println("Numbers of words in sentense: " + w);

        // numbers of letters - количество букв

        String [] letters = str4.split(""); // две кавычки без пробела выдает побуквенно
        int let = letters.length;
        System.out.println( "Numbers of letters in sentense: " + let);

        System.out.println("_________________________String.format______________________________");
        // Вставьте в строку дату полета Гагарина в виде:
        //"Дата полета Гагарина в космос: число – месяц – год." и напечатайте ее в консоли.
        //Используйте String.format()

        int  day = 12;
        String month = "April";
        int year = 1961;

        String gagarinDay = String.format("Дата полета Гагарина в космос: %d - %s - %d",day,month,year );
        System.out.println(gagarinDay);






    } // end of main
} // end of class


