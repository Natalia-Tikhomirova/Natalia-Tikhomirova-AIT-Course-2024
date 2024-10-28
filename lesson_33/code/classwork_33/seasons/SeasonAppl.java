package classwork_33.seasons;

// Задать ENUM seasons - времена года (Summer, Autumn, Winter, Spring)
//Опробовать на нем методы:
// .values() - извлекает данные в массив
// .toString
// .ordinal()
// .valueOf()

public class SeasonAppl {
    public static void main(String[] args) {

        Season[]seasons = Season.values();
        System.out.println("_______________values of Enum__________________");
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
            System.out.println(seasons[i].getNumber() + ":" + seasons[i].getName());
        }

        System.out.println("____________________________________________________");
        // for - each

        for (Season s : seasons) { // ( тип: Сезон, переменная, которая пробежит : по всему перечисляемому диапазону
            System.out.println(s.getName());
            System.out.println(s.getDuration());

            System.out.println("______________toString()_________________");
            String str = Season.AUTUMN.toString(); // вернул строку
            System.out.println(str);

            System.out.println("______________ordinal()_________________");

            int num = Season.AUTUMN.ordinal();
            System.out.println(num);
            num = Season.WINTER.ordinal();
            System.out.println(num);

            System.out.println("______________valueOf()_________________");

          Season s1  = Season.valueOf("SPRING");
            System.out.println(s1);


        }



    } // end of main
} // end of class
