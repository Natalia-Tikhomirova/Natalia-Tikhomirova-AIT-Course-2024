package homework_24.folder.controller;

import homework_24.folder.model.Document;

public class Archive {

    // fields

    private Document[]documents;
    private int size;

    // constructor


    public Archive(int capacity) {
        this.documents = new Document[capacity];
        this.size = 0;
    }
    // CRUD methods


    // boolean addDocument(Document document)
    // size++;

    // void printBooks()

    public static Document findDocument(long iin){

        Document foundDocument = null;

        return foundDocument;
    }


    // removeDocument(long iin)
    // size--;

    // boolean updateDocument()

    public int size(){
        return size;
    }


} // end class
