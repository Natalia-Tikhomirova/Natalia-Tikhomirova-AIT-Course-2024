package homework_18.book.model;

// Создайте класс Book с полями:
// - уникальный номер ISBN
// - название title
// - автор author
// - год издания yearOfPublishing
// - жанр genre
// В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display, который выводит информацию о книге. Создайте конструктор, в котором нет поля ISBN. Создайте конструктор, в котором есть только поля title, author и genre.

public class Book {

    // fields
    private String isbn;
    private String title;
    private String author;


    // constructor

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }


    // getters and setters


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display(){
        System.out.println("ISBN: " + isbn + ", title: " + title + ", author: " + author );
    }

} // end of class
