package homework_27.book_library.dao;

import homework_27.book_library.model.Book;

public class LibraryImpl implements  Library{

    private Book[] books;
    private int size;

    public LibraryImpl( int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    // CRUD methods

    @Override
    public boolean addBook(Book book){
        // negative cases
        if(book == null){
            return false;
        }

        if(size == books.length){
            return false;
        }
        if(findBookByIsbn(book.getIsbn()) != null){
            return false;
        }
        // positive case
        books[size] = book; // ставим книгу в конец массива на первое свободное место
        size++;
        return true;
    }

    @Override
    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }


    @Override
    public Book findBookByAuthor(String author) {

        for (int i = 0; i < size; i++) {
            if(books[i].getAuthor().equals(author)){
                return books[i];
            }
        }
        return null;
    }

    // Find a book by ISBN
    public Book findBookByIsbn(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if(books[i].getIsbn() == isbn){
                Book victim = books[i];     // жертва
                books[i] = books[size - 1];// last book put instead victim
                books[size - 1] = null;    // затираем последний элемент массива
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
} // end of class
