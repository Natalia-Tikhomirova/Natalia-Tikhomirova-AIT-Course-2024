package homework_18.computer_shop;

//  Создать несколько экземпляров каждого класса.
// Какой общий объем памяти у всех устройств на складе?
// Какова общая стоимость всех устройств на складе?


import homework_18.computer_shop.model.Computer;
import homework_18.computer_shop.model.Laptop;
import homework_18.computer_shop.model.Smartphone;

// Найти общий вес всех мобильных устройств в ComputerShop.

public class ShopAppl {

    public static void main(String[] args) {

        Computer computer = new Computer("i7",8,256, "Acer",1200);
        System.out.println(computer);

        Laptop laptop = new Laptop("M2",8,256,"Apple Airbook",2200,14,1.5,10,"blue");

        Computer[] computers = new Computer[6]; // 6 устройств; тип данных из род. класса Computer
        computers[0] = new Computer("i7",8,256, "Acer",1200);
        computers[1] = new Computer("i5",16,256, "HP",1500);
        computers[2] = new Computer("AMD",8,256, "NoName",2000); //элемент массива совпадает с типом массива -> no casting
        computers[3] = new Laptop("Apple",8,256, "MacBook",2000,14,1.5,10,"white"); // down casting
        computers[4] = new Laptop("Apple",16,512, "MacBook Air",2500,2000,1.8,12,"black"); // down casting
        computers[5] = new Smartphone("A1",128,256,"Samsung", 1300,9,1.45,12,"pink",123L); // down casting

        double totalWeight = 0;

        for (int i = 0; i < computers.length; i++) {
            if(computers[i] instanceof Laptop){
                Laptop myLaptop = (Laptop) computers[i]; // upper casting
                totalWeight += myLaptop.getWeight();
            }
        } // end of for

        System.out.println("Total weight = " + totalWeight + " kg.");

        System.out.println("======================================================");

        int totalSsd = 0;

        for (int i = 0; i < computers.length; i++) {
            totalSsd += computers[i].getSsd(); // подсчитываем все SSD
        } // end of for

        System.out.println("Total SSD:" + totalSsd);

        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++) {
            totalPrice+= computers[i].getPrice();
        } // end of for

        System.out.println( "Total price = " + totalPrice + " euro.");

        System.out.println("_____________________________________________________________");

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]); // печатаем весь массив - все компы и ноуты
        } // end of for
        System.out.println("_____________________________________________________________");

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getBrand()); // печатает бренды

        } // end of for

        System.out.println("_____________________________________________________________");

        Smartphone smartphone = new Smartphone("A16",6,512,"Apple Iphone",1300,6.1, 0.206,24,"violet",123456789012345L);
        System.out.println(smartphone);


    } // end of main
} // end of class
