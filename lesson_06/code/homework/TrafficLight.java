package homework;

// Напишите программу для машины на светофоре.
// Что делать водителю, если горит красный, жёлтый или зелёный свет.
// Цвет светофора задается в программе, затем с клавиатуры.


import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println(" Input number of color: ");
        int trafficLightColor = scanner.nextInt();

        switch (trafficLightColor){

            case 1 -> {
                System.out.println(" This is red. Stop!!!");
            }

            case 2 -> {
                System.out.println(" This is yellow. Wait!!!");
            }

            case 3 -> {
                System.out.println(" This is green. Go!!!");
            }

            default -> System.out.println("Wrong input!");

        } // end of switch


    } // end of main

} // end of class
