package homework_27.book_library.dao;

import homework_27.book_library.model.Book;

public interface Library {

    boolean addBook(Book book);
    void printBooks();
    Book findBookByIsbn(long isbn);

    Book findBookByAuthor(String author);

    Book removeBook(long isbn);
    int size();

} // end of class
