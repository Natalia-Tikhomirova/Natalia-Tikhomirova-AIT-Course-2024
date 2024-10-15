package homework_24.folder.model;

 //  Реализуйте класс Document и приложение Archive по аналогии с Book и Library. Уникальный номер документа содержит 10 цифр.

import java.util.Objects;

public class Document {

    public static final int IIN_LENGTH = 10;

    // field

    private String title;
    private String author;
    private long iin;

    // constructor


    public Document(String title, String author, long iin) {
        this.title = title;
        this.author = author;
        this.iin = checkIin(iin);
    }

    private long checkIin(long iin){
        // проверить длину iin по кол-ву цифр в этом числе
        if(countDigit(iin)){
            return iin;
        }
        return -1; // сигнал того, что isbn неверный
    }

    private boolean countDigit(long iin) {
        int count = 0;
        while ((iin / 10 != 0)){
            count++;
        }
        return count == IIN_LENGTH;
    }

    public long getIin() {

        return iin;
    }

    // TODO предусмотреть защиту по поводу 10 цифр и в этом случае
    public void setIin(long iin) {

        this.iin = iin;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document archive)) return false;
        return iin == archive.iin;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(iin);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Archive{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", iin=").append(iin);
        sb.append('}');
        return sb.toString();
    }
} // end of class


