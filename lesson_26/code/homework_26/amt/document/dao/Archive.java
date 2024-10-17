package homework_26.amt.document.dao;

import homework_26.amt.document.model.Document;

public interface Archive {

    boolean addDocument(Document document);
    Document findByAuthor(String author);
    Document findDocument(long iin);
    Document removeDocument(long iin);
    int size();
    void printDocuments();

} // end of class
