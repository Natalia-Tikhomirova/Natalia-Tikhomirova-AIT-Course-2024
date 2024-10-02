package homework_04;

// 1. Напишите методы для конвертации валюты:и проверьте их работу, вызвав их в main.
// 2. Напишите метод, который переводит градусы Цельсия в градусы по Фаренгейту. Формулу пересчета найти в Интернете. Вызовите метод в main.
// 3. Создайте метод, который пересчитывает морские мили в километры. 1 морская миля = 1852 метра.

public class Exchange {
    public static void main(String[] args) {

        //евро в доллары США

        double money = 350; // euro
        double dollars = exchangeEuroToDollars(money);
        System.out.println( money+ " euro = " + dollars + " Dollar ");

        //евро в британские фунты

        double money1 = 350; // euro
        double gbp = exchangeEuroToGBP(money1);
        System.out.println(money1 + " euro = " + gbp + " GBP" );

        // евро в китайские юани

        double money2 = 350; // euro
        double cny = exchageEuroToCNY(money2);
        System.out.println( money2 + " euro = " +  cny + " CNY ");

        // градусы Цельсия в градусы по Фаренгейту: F=t(c)×1,8+32

        double celsius = 25; // градусов Цельсия
        double fahrenheit = exchangecelsiusToFahreheit(celsius);
        System.out.println( celsius + " градусов C = " + fahrenheit + " градусов F ");

        // морские мили в километры: x (km) = (мили/1000) * мили

        double meile = 100; // миль
        double km = exchangemeileToKm(meile);
        System.out.println( meile + "  mile = " + km + " km ");

    } // end of main

    private static double  exchangeEuroToDollars (double money) {

   double rate = 1.11;
   return money * rate;

    }

    private static double exchangeEuroToGBP (double money1) {

        double rate = 0.8;
        return  money1 * rate;

    }

    private static double exchageEuroToCNY (double money2) {

        double rate = 7.87;
        return money2 * rate;

    }

    private static double exchangecelsiusToFahreheit (double celsius){

        // F=t(c)×1,8+32

        double rate = celsius;
        return rate * 1.8 + 32;


    }

    private static double exchangemeileToKm (double miele){

        return miele * 1.852;

    }

} // end of class


