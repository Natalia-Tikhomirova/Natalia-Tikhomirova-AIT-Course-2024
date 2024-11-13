package homework_44.book.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BookAppl {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList( new Book("1984","Oruell",1234567890L,2010,13.49),
                new Book("Gatsby", "Fitzgerald",1234567891L ,1925,10.99),
                new Book("Pride", "Austen", 1234567892L,1900,9.99),
                new Book("Moby", "Melville",1234567893L, 1851,25),
                new Book("War", "Tolstoy",1234567894L, 1869, 56)
        );

        //отобразить все книги
        System.out.println("==============All books ===================");
        printBooks(books);

        //отобразить книги дороже указанной цены
        System.out.println("===========Books with price more than 10 euro  ===================");
        int price = 10;
        printBooksWithPriceMoreThan(books,price);

        //отобразить книги, чей год выпуска находится в заданном диапазоне
        int yearFrom = 1860;
        int yearTo = 2000;
        System.out.println("=================Books form year " + yearFrom + " to year " + yearTo + "================");
        List<Book> booksOfYear = findBooksOfYearFromTo(books,yearFrom,yearTo);
        printBooks(booksOfYear);

        //отсортировать книги в порядке убывания стоимости
        System.out.println("==============Books sorted by price ===================");
        List<Book> sortedByPrice = sortBooksByPrice(books);
        printBooks(sortedByPrice);

        //получить среднюю стоимость книг
        System.out.println("==============Average price of books ===================");
        double averagePrice = calcAveragePrice(books);
        System.out.println("Average price of books is " + averagePrice + " euro");

    }

    private static double calcAveragePrice(List<Book> books) {
        return books.stream()
                .mapToDouble(Book::getPrice)
                .summaryStatistics()
                .getAverage();
    }

    private static List<Book> sortBooksByPrice(List<Book> books) {
        return books.stream()
                .sorted(Comparator.comparing(Book::getPrice))
                .toList();
    }

    private static List<Book> findBooksOfYearFromTo(List<Book> books, int yearFrom, int yearTo) {
        return books.stream()
                .filter(book -> book.getYearOfPublishing() >= yearFrom && book.getYearOfPublishing() <= yearTo)
                .toList();
    }

    private static void printBooksWithPriceMoreThan(List<Book> books, int price) {
        books.stream()
                .filter(book -> book.getPrice() > price)
                .forEach(System.out::println);
    }

    private static void printBooks(List<Book> books) {
        books.forEach(System.out::println);

    }
} // end of class
