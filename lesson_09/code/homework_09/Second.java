package homework_09;

// В программе задаются часы, минуты и секунды.
// Нужно вывести общее количество секунд, прошедших с начала суток.
// Вычисление произведите в методе, который получает на вход часы, минуты и секунды.

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        int hours = 15;
        int minutes = 34;
        int seconds = 47;

        int totalSeconds = calculateSeconds(hours, minutes, seconds);
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input time - " + hours + " : " + minutes + " : " + seconds);

        System.out.println(" Total seconds = " + totalSeconds);

    }// end of main

        public static int calculateSeconds ( int hours, int minutes, int seconds ){

            int res = hours * 3600 + minutes * 60 + seconds;
            return res;

        } // end of method

} // end of class


