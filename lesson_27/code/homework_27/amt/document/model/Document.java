package homework_27.amt.document.model;

import java.util.Objects;

public class Document {

        // fields
        private static int IIN_LENGTH = 10;
        private final long iin;
        private String title;
        private String author;

        // constructor

        public Document(long iin, String title, String author) {
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
            if (!(o instanceof Document that)) return false;
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


