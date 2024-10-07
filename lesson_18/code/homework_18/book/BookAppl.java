package homework_18.book;


import homework_18.book.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary("978-3-7657-1111-4", "Толковый словарь русского языка", "В. Даль", "русский","Десятое издание",200000, false);
        Dictionary dictionary1 = new Dictionary("978-3-7555-1111-4", "Большой англо-русский словарь", "В.Мюллер", "русско-английский", "Пятое издание",380000, true);
        Dictionary dictionary2 = new Dictionary("978-3-7657-666-4", "Kompaktwörterbuch Russisch", "P.Müller","russisch-deutsch", "zweite Auflage",130000, true );

        dictionary.display();
        System.out.println("_______________________________________________________________________");
        dictionary1.display();
        System.out.println("_______________________________________________________________________");
        dictionary2.display();

    } // end of main
} // end of class



