package homework_17.HW;


import homework_17.HW.model.Book;

public class BookAppl {

    public static void main(String[] args) {

        Book number01 = new Book("978-3-7657-1111-4", "Deutsch","Magdalena Matussek", 2024,"Educational literature");
        number01.display();
        Book number02 = new Book("Abenteuer auf dem Mond","Mary Pope Osborne",2007,"Stories");
        number02.display();
        Book number03 = new Book("Children from Bullerby","Astrid Lindgren","Storie");
        number03.display();



    } // end of main
} // end of class
