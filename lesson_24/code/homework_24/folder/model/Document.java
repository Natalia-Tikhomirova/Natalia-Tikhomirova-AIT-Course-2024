package homework_24.folder.model;

 //  Реализуйте класс Document и приложение Archive по аналогии с Book и Library. Уникальный номер документа содержит 10 цифр.

import java.util.Objects;

public class Document {

    public static final int IIN_LENGTH = 10; // Уникальный номер документа содержит 10 цифр.

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

    // Метод для проверки IIN (идентификационного номера) на корректность:
    private long checkIin(long iin){
        // Проверяем длину IIN по количеству цифр в этом числе:
        if(countDigit(iin)){
            // Если длина корректна, возвращаем IIN:
            return iin;
        }
        // Если IIN некорректен, возвращаем -1 как сигнал о неверном IIN:
        return -1;
    }

    // Метод для подсчета количества цифр в IIN:
    private boolean countDigit(long iin) {
        int count = 0;                                  // Переменная для подсчета цифр
        long temp = iin;                                // Временная переменная для работы с IIN
        // Цикл выполняется, пока временная переменная не станет равной 0:
        while ((temp  != 0)){
            temp = temp / 10;                            // Делим временную переменную на 10
            count++;                                     // Увеличиваем счетчик цифр
        }
        // Возвращаем true, если количество цифр равно заранее определенной длине IIN:
        return count == IIN_LENGTH;
    }

    public long getIin() {
        return iin;
    }

    // TODO предусмотреть защиту по поводу 10 цифр и в этом случае
    // Метод для установки значения IIN:
    public void setIin(long iin) {
        // Проверяем, корректен ли введенный IIN:
        if(checkIin(iin) > 0){
            this.iin = iin;
        }else {
            // Если IIN некорректен, выводим сообщение об ошибке:
            System.out.println("IIN is not correct.");
        }
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


