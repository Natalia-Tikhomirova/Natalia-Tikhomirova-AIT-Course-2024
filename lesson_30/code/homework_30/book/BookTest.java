package homework_30.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class BookTest {

    Book[]books;

    @BeforeEach
    void setUp() {
        books = new Book[]{
                new Book("Gatsby", "Fitzgerald", 1925, 10.99),
                new Book("Pride", "Austen", 1900, 9.99),
                new Book("1984", "Orwell", 1949, 13.49),
                new Book("Pride", "Austen", 1813, 19.99),
                new Book("Moby", "Melville", 1851, 15.99),
                new Book("War", "Tolstoy", 1869, 19.99)
        };

    } // end of method

    @Test
    void testNativeSorting(){
        System.out.println("___________________Print as is______________________________");
        printArray(books);
        Arrays.sort(books);
        System.out.println("________________Print after sorting________________________");
        printArray(books);

    }
    @Test
    void testByAuthorAndYearSorting(){
        Comparator<Book> comparatorAuthorAndYear = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int res = o1.getAuthor().compareTo(o2.getAuthor());
                return res != 0 ? res : Integer.compare(o1.getYear(),o2.getYear());
            }
        };

        System.out.println("___________________Print as is______________________________");
        printArray(books);
        Arrays.sort(books,comparatorAuthorAndYear );
        System.out.println("______________Print after sorting by author and year________________");
        printArray(books);
    }


    @Test
    void testByPriceSorting(){
        System.out.println("___________________Print as is______________________________");
        printArray(books);
        Arrays.sort(books,(p1,p2) -> Double.compare(p1.getPrice(),p2.getPrice()));
        System.out.println("______________Print after sorting by price___________________");
        printArray(books);
    }

    @Test
    void testBinarySearch(){

        Comparator<Book> comporatorByTitle = new Comparator<Book>() {
            @Override
            public int compare(Book t1, Book t2) {
                return t1.getTitle().compareTo(t2.getTitle());
            }
        };
        System.out.println("___________________Print as is______________________________");
        printArray(books);
        Arrays.sort(books,comporatorByTitle);
        System.out.println("______________Print after sorting by title___________________");
        printArray(books);

        // create object - pattern for searching
        Book pattern = new Book("Pride",null,0,0.0);
        int index = Arrays.binarySearch(books,pattern,(t1,t2) -> t1.getTitle().compareTo(t2.getTitle()));
        System.out.println("Index: " + index);

    }

    public void printArray (Object[] array){ // печатает любой массив объекта

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
} // end of class