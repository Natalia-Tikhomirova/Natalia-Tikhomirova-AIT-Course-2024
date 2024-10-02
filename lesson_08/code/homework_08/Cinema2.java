package homework_08;

import java.util.Scanner;

public class Cinema2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input age : ");
        int age = scanner.nextInt();
        double basePrice = 15; // стандартный билет
        double discountPercentage; // процент скидки

        if (age > 18 && age < 23) {

            discountPercentage = 10;

        } else if (age >= 65) {

            discountPercentage = 25;

        } else {

            discountPercentage = 0;
        }

        double finalPrice = basePrice + (basePrice * discountPercentage / 100);
        System.out.println("The final  ticket price = " + finalPrice + " Euro. ");
    }

}
