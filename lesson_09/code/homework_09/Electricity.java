package homework_09;

// Анна использует различные электроприборы в своем доме.
// У неё есть холодильник, который потребляет 150 Вт, и кондиционер с потреблением 2000 Вт.
// Анна хочет узнать, сколько она тратит на электроэнергию в месяц, если стоимость 1 кВт·ч составляет 0.15 евро.
// Вопросы: Сколько электроэнергии тратят холодильник и кондиционер вместе в час? (calculateHourlyConsumption)
// Сколько Анна тратит на электроэнергию в месяц? (calculateMonthlyCost)

public class Electricity {
    public static void main(String[] args) {

        double ref = 150;   // Вт
        double cond = 2000; // Вт
        int month = 30;  // дней
        double kWh = 0.15;  // 1 кВт/ч

        double hourlyconsum = calculateHourlyConsumption (ref,cond);
        double electricity = calculateMonthlyCost (hourlyconsum,month,kWh);
        System.out.println(" Anna spends on electricity per month : " + electricity + " kW/h ");

    } // end of main

    public static double calculateHourlyConsumption (double ref,double cond){

        double res = ( ref + cond)  / 1000;
        return res;

    } // end of method 1

    public static double calculateMonthlyCost (double hourconsum, int month, double kWh){

        double res = hourconsum * ( month * 24 ) * kWh;
        return res;

    } // end of method 2


} // end of class
