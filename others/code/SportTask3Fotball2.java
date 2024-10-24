
// Подсчет количества желтых и красных карточек:
// Напишите программу, которая запрашивает у пользователя количество матчей и
// количество желтых и красных карточек, полученных командой в каждом матче.
// Программа должна вывести общее количество желтых и красных карточек.
// Пример ввода:
// Введите количество матчей: 2
// Введите количество желтых карточек в матче 1: 3
// Введите количество красных карточек в матче 1: 1
// Введите количество желтых карточек в матче 2: 2
// Введите количество красных карточек в матче 2: 0
//Пример вывода:
//Общее количество желтых карточек: 5
//Общее количество красных карточек: 1

import java.util.Scanner;

public class SportTask3Fotball2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of games:");
        int amountOfGames = scanner.nextInt();
        int[] yellowCard = new int[amountOfGames];
        int[] redCard = new int[amountOfGames];
        for (int i = 0; i < amountOfGames; i++) {
            System.out.println("Enter yellow cards for game " + (i + 1) + ":");
            yellowCard[i] = scanner.nextInt();
            System.out.println("Enter redcards for game " + (i + 1) + ":");
            redCard[i] = scanner.nextInt();
        }
        int yellowTotal = calculateTotalCards(yellowCard);
        int redTotal = calculateTotalCards(redCard);
        System.out.println("Total yellow cards: " + yellowTotal);
        System.out.println("Total red cards: " + redTotal);
    }

    public static int calculateTotalCards(int[] cards) {
        int totalSum = 0;
        for (int i = 0; i < cards.length; i++) {
            totalSum = totalSum + cards[i];
        }
        return totalSum;

    }
} // end of class
