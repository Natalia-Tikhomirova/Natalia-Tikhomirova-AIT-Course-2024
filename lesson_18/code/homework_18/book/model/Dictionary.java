package homework_18.book.model;

public class Dictionary extends Book {

    private String language;
    private String edition;
    private int definitionsCount;
    private boolean isBilingual;

    public Dictionary(String isbn, String title, String author, String language, String edition, int definitionsCount, boolean isBilingual) {
        super(isbn, title, author);
        this.language = language;
        this.edition = edition;
        this.definitionsCount = definitionsCount;
        this.isBilingual = isBilingual;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getDefinitionsCount() {
        return definitionsCount;
    }

    public void setDefinitionsCount(int definitionsCount) {
        this.definitionsCount = definitionsCount;
    }

    public boolean isBilingual() {
        return isBilingual;
    }

    public void setBilingual(boolean bilingual) {
        isBilingual = bilingual;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" language: " + language + ", edition: " + edition + ", definitions count: " + definitionsCount + ", bilingual: " + isBilingual);
    }
} // end of class
