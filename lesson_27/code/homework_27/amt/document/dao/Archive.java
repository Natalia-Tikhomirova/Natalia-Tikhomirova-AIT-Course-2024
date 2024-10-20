package homework_27.amt.document.dao;

import homework_27.amt.document.model.Document;

public interface Archive {

    boolean addDocument(Document document);
    Document findByAuthor(String author);
    Document findByTitle(String title);
    Document findByIin(long iin);
    Document removeDocument(long iin);
    int size();
    void printDocuments();

} // end of class
