package homework_37.compititions.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class RunningCompetition {

    private static final int ATHLETES_COUNT = 10;
    List<Athlete> athleteList = new ArrayList<>();

    public static void main(String[] args) {

        RunningCompetition competition = new RunningCompetition();


        // ввод данных
        competition.enterAthleteData();

        // сортировка по результатам
        competition.sortAthletesByResult ();

        // печать протокола
        competition.displayFinalProtocol();


    } // end of main

    // метод для ввода данных
    public void enterAthleteData() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ATHLETES_COUNT; i++) {
            System.out.println("Enter data for athlete #" + (i + 1));

            System.out.print("Last Name: ");
            String lastName = scanner.next();

            System.out.print("First Name: ");
            String firstName = scanner.next();

            System.out.print("Registration Number: ");
            int registrationNumber = scanner.nextInt();

            System.out.print("Club: ");
            String club = scanner.next();

            System.out.print("Result (seconds and tenths): ");
            double result = scanner.nextDouble();

            athleteList.add(new Athlete(lastName, firstName, registrationNumber, club, result));
        }
    } // end of method

    // метод для сортировки по результатам
    public void sortAthletesByResult () {
        Comparator<Athlete> comparator = new Comparator<Athlete>() {
            @Override
            public int compare(Athlete a1, Athlete a2) {
                return Double.compare(a1.getResult(),a2.getResult());
            }
        };
        athleteList.sort(comparator);

    } // end of method

    // метод для печати протокола
    public void displayFinalProtocol () {
        System.out.println("Final competition protocol:");
        int position = 1;
        for (Athlete athlete : athleteList) {
            System.out.println(position + ". " + athlete);
            position++;
        }
    } // end of method

} // end of class


