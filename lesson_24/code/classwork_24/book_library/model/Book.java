package classwork_24.book_library.model;

import java.util.Objects;

// Создать класс Book с полями:
// long isbn, String title, String author, int yearOfPublishing.
// Проверить ISBN на корректное количество цифр = 13.
public class Book {

    public static final int ISBN_LENGTH = 13;

    // field
    private String title;
    private String author;
    private long isbn;
    private int yearOfPublishing;

    // constructor - это МЕТОД, позволяющий создавать объекты
    public Book(String title, String author, long isbn, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = checkIsbn(isbn);

    }

    private long checkIsbn(long isbn) { // без length, потому что не String
        // проверить длину isbn по кол-ву цифр
        if (countDigit(isbn)){
            return isbn;
        }
        return -1; // сигнал того, что isbn неверный
    }

    private boolean countDigit(long isbn) {
        // String.valueOf(isbn).length() == 13; - хороший подход, но требуется много ресурсов
        int count = 0;
        long temp = isbn; // переложили isbn в отдельную переменную, чтобы "не испортить" значение isbn
        while ((temp != 0)){ // isbn делится на 10 до 0
            temp = temp / 10;
            count++;
        }

        return count == ISBN_LENGTH;
    }

    public long getIsbn() {
        return isbn;
    }

    // TODO предусмотреть защиту по поводу 13 цифр и в этом случае
    public void setIsbn(long isbn) {
        if (checkIsbn(isbn) > 0) {
            this.isbn = checkIsbn(isbn);
        }else{
            System.out.println("ISBN is not correct.");
        }

        // public void setIsbn(long isbn) {
        //    if(countDigit(isbn)){
        //        this.isbn = isbn;
        //    } else{
        //        System.out.println("Error! ISBN '" + isbn + "' is invalid.");
        //    }
        //
        //}
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

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    // equals и hashCode методы идентификации объектов по составу полей
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    // печатает
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", isbn=").append(isbn);
        sb.append(", yearOfPublishing=").append(yearOfPublishing);
        sb.append('}');
        return sb.toString();
    }
} // end of class
