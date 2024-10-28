package homework_33.diary;

//  // Реализовать метод printMenu().

import homework_33.week_day.WeekDay;

import java.util.Scanner;

public class DairyAppl {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        Diary[] diary = Diary.values();

        while (flag) {

            System.out.println("_________________________________________________");
            printMenu();

            System.out.println("Select the menu punkt: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1, 2, 3 -> {
                    System.out.println(" Your choice is: " + diary[choice - 1].getPunkt());
                }
                case 4 -> {
                    System.out.println("Exiting the menu. Goodbye!");
                    flag = false;
                }
                default -> System.out.println("There are no tasks available. Please select the correct punkt.");
            }
        }
        scanner.close();

    } // end of main

    public static void printMenu() {
        System.out.println("Menu: ");
        for (Diary punkt : Diary.values()) {
            System.out.println(punkt.getNumber() + " - " + punkt.getPunkt());
        }
    } // end of method


} // end of class
