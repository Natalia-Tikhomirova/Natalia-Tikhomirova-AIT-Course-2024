package homework;

// Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
// За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%. Сколько лет проработал работник вводится с клавиатуры.

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of years: "); // запрашиваем количество стажа
            int years = scanner.nextInt();

            double baseSalary = 500; // базовая зарплата
            double bonusPercentage; // процент надбавки
         if (years >= 15) {
             bonusPercentage = 150;

         } else if (years >= 10) {
             bonusPercentage = 100;

         } else if (years >= 5) {
             bonusPercentage = 50;

         } else if (years >= 3) {
             bonusPercentage = 10;

         } else {
             bonusPercentage = 0;
         }

         double finalSalary = baseSalary + (baseSalary * bonusPercentage / 100); // расчет итоговой зп с учетом надбавки за стаж


        System.out.println("The final  Salary = " + finalSalary + " Euro.");


        } // end of main




    }


