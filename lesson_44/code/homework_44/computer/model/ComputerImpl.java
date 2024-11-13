package homework_44.computer.model;

import homework_44.book.model.Book;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComputerImpl {
    public static void main(String[] args) {

        List<Computer> computers = Arrays.asList(new Computer(1234567890L,"i7",8,256, "Acer",1200),
                new Computer(1234567891L,"i5",16,256, "HP",1500),
                new Computer(1234567892L,"AMD",8,256, "NoName",2000),
                new Computer(1234567893L,"Apple",8,256, "MacBook",2000),
                new Computer(1234567894L,"Apple",16,512, "MacBook Air",2500),
                new Computer(1234567895L,"i7",16,512, "Acer",1800)
        );

        //отобразить все компьютеры
        System.out.println("==============All computers ===================");
        printComputers(computers);

        //отобразить компьютеры дороже указанной цены
        System.out.println("===========Computers with price more than 1500 euro  ===================");
        int price = 1500;
        printComputersWithPriceMoreThan(computers,price);

        //отобразить компьютеры, чья стоимость находится в заданном диапазоне
        int priceFrom = 1500;
        int priceTo = 2000;
        System.out.println("=================Computers form year " + priceFrom + " to year " + priceTo + " euro ================");
        List<Computer> computersOfPrice = findComputersOfPriceFromTo(computers,priceFrom,priceTo);
        printComputers(computersOfPrice);

        //отсортировать компьютеры в порядке убывания стоимости
        System.out.println("==============Computers sorted by price ===================");
        List<Computer> sortedByPrice = sortComputersByPrice(computers);
        printComputers(sortedByPrice);

        //получить среднюю стоимость компьютеров
        System.out.println("==============Average price of computers ===================");
        double averagePrice = calculatorAveragePrice(computers);
        System.out.println("Average price of books is " + averagePrice + " euro");

    }

    private static void printComputersWithPriceMoreThan(List<Computer> computers, int price) {
        computers.stream()
                .filter(computer -> computer.getPrice() > price)
                .forEach(System.out::println);
    }

    private static List<Computer> findComputersOfPriceFromTo(List<Computer> computers, int priceFrom, int priceTo) {
        return computers.stream()
                .filter(computer -> computer.getPrice() >= priceFrom && computer.getPrice() <= priceTo)
                .toList();
    }

    private static List<Computer> sortComputersByPrice(List<Computer> computers) {
        return computers.stream()
                .sorted(Comparator.comparing(Computer::getPrice))
                .toList();
    }

    private static double calculatorAveragePrice(List<Computer> computers) {
        return computers.stream()
                .mapToDouble(Computer::getPrice)
                .summaryStatistics()
                .getAverage();
    }

    private static void printComputers(List<Computer> computers) {
        computers.stream()
                .forEach(System.out::println);
    }
} // end of class



