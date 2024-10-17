package homework_26.amt.document.model;

import java.util.Objects;

public abstract class AbstractDocument {

    // fields
    protected static int IIN_LENGTH = 10;
    protected final long iin;
    protected String title;
    protected String author;

    // constructor

    public AbstractDocument(long iin, String title, String author) {
        this.iin = iin;
        this.title = title;
        this.author = author;
    }

    // getter and setter

    public long getIin() {
        return iin;
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
        if (!(o instanceof AbstractDocument that)) return false;
        return iin == that.iin;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(iin);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractArchive{");
        sb.append("iin=").append(iin);
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append('}');
        return sb.toString();
    }

} // end of class
