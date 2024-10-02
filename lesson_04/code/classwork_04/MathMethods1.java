package classwork_04;

public class MathMethods1 {
    public static void main(String[] args) {

        // перевод долларов в евро
        double money = 500; // dollars
        double euro = exchangeDollarsToEuro(money);
        System.out.println("Euro:" + euro);

// количество съеденных калорий

        double weight = 200; // gramm
        double calorage = 50; // kkal on 100 gramm

        double energy = calculateCalorie(weight,calorage);
        System.out.println("Energy = " + energy);

// расход топлива и стоимости на поездку
        // Количество литров на поездку = расход бензина на 100 км * длина поездки в км
        // Стоимость поездки = (Количество литров на поездку * стоимость 1 л бензина в евро) * длина поездки

        double distance = 750; // длина поездки в км
        double consum = 8.5; // расход бензина на 100 км
        double price = 1.8; // стоимость 1 л бензина в евро
        double budget = costOfTheTrip(consum,price); // стоимость поездки
        double allconsum = costOfThePetrol(consum,distance);    //Количество литров на поездку


        System.out.println( budget + " Расход топлива = " );

    } // end of main

    private static double calculateCalorie (double weight, double calorage) {

        return weight * calorage / 100;

    }


    private static double exchangeDollarsToEuro(double money){

        double rate = 0.9;
        return money * rate;
    }

    private static double costOfTheTrip (double consum,double price){

        double rate = consum * price;
        return rate ;

    }
    private static double costOfThePetrol (double consum, double distance){

        double allconsume = consum * distance;
        return allconsume;
    }






} // end of class
